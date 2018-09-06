package kenny.queue.basic;

public class QueueDemo {

    public static void main(String[] args) {
        // queue using linear array demo
        System.out.println("Queue using linear array demo:");
        QueueUsingLinearArray queueUsingLinearArray = new QueueUsingLinearArray(3);
        queueUsingLinearArray.enqueue(1);
        queueUsingLinearArray.enqueue(2);
        queueUsingLinearArray.enqueue(3);
        queueUsingLinearArray.enqueue(4);
        queueUsingLinearArray.printQueue();
        queueUsingLinearArray.dequeue();
        queueUsingLinearArray.dequeue();
        queueUsingLinearArray.dequeue();
        queueUsingLinearArray.dequeue();
        // queue using circular array demo
        System.out.println("--------------------------------");
        System.out.println("Queue using circular array demo:");
        QueueUsingCircularArray queueUsingCircularArray = new QueueUsingCircularArray(3);
        queueUsingCircularArray.enqueue(1);
        queueUsingCircularArray.enqueue(2);
        queueUsingCircularArray.dequeue();
        queueUsingCircularArray.dequeue();
        queueUsingCircularArray.printQueue();
        // queue using cirular array special demo
        System.out.println("--------------------------------");
        System.out.println("Queue using circular special array demo:");
        QueueUsingSpecialCircularArray queueUsingSpecialCircularArray = new QueueUsingSpecialCircularArray(3);
        queueUsingSpecialCircularArray.enqueue(1);
        queueUsingSpecialCircularArray.enqueue(2);
        queueUsingSpecialCircularArray.enqueue(3);
        queueUsingSpecialCircularArray.dequeue();
        queueUsingSpecialCircularArray.dequeue();
        queueUsingSpecialCircularArray.dequeue();
        queueUsingSpecialCircularArray.printQueue();
    }
}
