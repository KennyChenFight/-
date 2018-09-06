package kenny.queue.application;

import java.util.Stack;

public class QueueUsingStack {

    public Stack<String> s = new Stack<>();
    public Stack<String> t = new Stack<>();


    public void enqueue(String item) {
        s.push(item);
    }

    public String dequeue() {
        if (t.isEmpty()) {
            if (s.isEmpty()) {
                System.out.println("Q empty");
                return "-1";
            }
            else {
                while (!s.isEmpty()) {
                    String x = s.pop();
                    t.push(x);
                }
            }
        }
        String item = t.pop();
        return item;
    }
}
