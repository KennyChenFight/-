package kenny.queue.application;

import kenny.queue.basic.QueueUsingLinearArray;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {

    public QueueUsingLinearArray queueUsingLinearArray = new QueueUsingLinearArray(3);

    public void push(int item) {
        if (queueUsingLinearArray.isFull()) {
            System.out.println("Stack Full");
        }
        else {
            queueUsingLinearArray.enqueue(item);
        }
    }

    public int pop() {
        int n = queueUsingLinearArray.getElementCount();
        if (queueUsingLinearArray.isEmpty()) {
            System.out.println("S empty");
            return -1;
        }
        else {
            for (int i = 1; i <= n - 1; i++) {
                int x = queueUsingLinearArray.dequeue();
                queueUsingLinearArray.enqueue(x);
            }
            int item = queueUsingLinearArray.dequeue();
            return item;
        }
    }
}
