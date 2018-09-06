package kenny.queue.basic;

public class QueueUsingLinearArray {

    private int q[];
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public QueueUsingLinearArray(int n) {
        this.q = new int[n + 1];
        this.size = n;
    }

    public void enqueue(int item) {
        if (front > 0) {
            for (int i = front + 1; i < q.length; i++) {
                q[i - front] = q[i];
            }
            rear = rear - front;
            front = 0;
            enqueue(item);
        }
        else {
            if (rear == size) {
                System.out.println("Full");
            } else {
                rear = rear + 1;
                q[rear] = item;
            }
        }
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Empty");
            return -1;
        }
        else {
            front = front + 1;
            int item = q[front];
            return item;
        }
    }

    public boolean isFull() {
        if (rear == size) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (front == rear) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getElementCount() {
        return rear - front;
    }

    public void printQueue() {
        int position = front + 1;
        System.out.print("Q:");
        while (position <= rear) {
            System.out.print(q[position] + " ");
            position++;
        }
        System.out.print("\n");
    }

}
