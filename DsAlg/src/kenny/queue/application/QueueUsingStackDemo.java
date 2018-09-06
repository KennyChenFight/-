package kenny.queue.application;

public class QueueUsingStackDemo {

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enqueue("A");
        queueUsingStack.enqueue("B");
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
    }
}
