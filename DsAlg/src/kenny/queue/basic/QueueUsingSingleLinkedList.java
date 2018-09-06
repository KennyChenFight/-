package kenny.queue.basic;

import kenny.queue.basic.Node;

// todo need to revised
public class QueueUsingSingleLinkedList {

    public Node node = new Node();
    public Node front = new Node();
    public Node rear = new Node();

    public void enqueue(int item) {
        Node t = new Node();
        t.data = item;
        t.next = null;
        if (front.next == null) {
            front.next = t;
        }
        else {
            node.next = t;
        }
        rear = t;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Empty");
            return -1;
        }
        else {
            int item = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return item;
        }
    }

    public void printQueue() {
        Node t = node;
        while(t.next != null) {
            System.out.print(t.data);
            t = t.next;
        }
    }
}
