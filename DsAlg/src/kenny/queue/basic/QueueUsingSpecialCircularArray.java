package kenny.queue.basic;

public class QueueUsingSpecialCircularArray {

    public int[] q;
    public int front = 0;
    public int rear = 0;
    public int size = 0;
    public boolean tag = false;

    public QueueUsingSpecialCircularArray(int n) {
        q = new int[n + 1];
        size = n;
    }

    public void enqueue(int item) {
        if (rear == front && tag) {
            System.out.println("Full");
        }
        else {
            rear = (rear + 1) % size;
            q[rear] = item;
            if (rear == front) {
                tag = true;
            }
        }
    }

    public int dequeue() {
        if (rear == front && !tag) {
            System.out.println("Empty");
            return -1;
        }
        else {
            front = (front + 1) % size;
            int item = q[front];
            if (front == rear) {
                tag = false;
            }
            return item;
        }
    }

    public void printQueue() {
        if (rear == front && !tag) {
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
