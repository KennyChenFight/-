package kenny.queue.basic;

public class QueueUsingCircularArray {

    private int[] q;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public QueueUsingCircularArray(int n) {
        this.q = new int[n];
        this.size = n;
    }

    public void enqueue(int item) {
        rear = (rear + 1) % size;
        if (rear == front) {
            rear = (rear - 1) % size;
            System.out.print("Full");
        }
        else {
            q[rear] = item;
        }
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Empty");
            return -1;
        }
        else {
            front = (front + 1) % size;
            int item = q[front];
            return item;
        }
    }

    public void printQueue() {
        if (front == rear) {
            System.out.println("Empty");
        }
        else {
            int position = (front + 1) % size;
            System.out.print("Q:");
            while (position != rear) {
                System.out.print(q[position] + " ");
                position = (position + 1) % size;
            }
            System.out.print(q[rear] + " ");
            System.out.print("\n");
        }
    }
}
