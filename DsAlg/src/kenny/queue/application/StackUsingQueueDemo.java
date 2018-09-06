package kenny.queue.application;

public class StackUsingQueueDemo {

    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();
        stackUsingQueue.push(1);
        stackUsingQueue.push(2);
        stackUsingQueue.push(3);
        System.out.println(stackUsingQueue.pop());
        System.out.println(stackUsingQueue.pop());
        System.out.println(stackUsingQueue.pop());
    }
}
