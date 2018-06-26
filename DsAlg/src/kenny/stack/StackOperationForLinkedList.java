package kenny.stack;

public class StackOperationForLinkedList {

    public static StackUsingLinkedList createStack() {
        return new StackUsingLinkedList();
    }

    public static boolean isEmpty(StackUsingLinkedList stack) {
        if (stack.getTop() == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void push(StackUsingLinkedList stack, int item) {
        Node node = new Node();
        node.setData(item);
        node.setLink(stack.getTop());
        stack.setTop(node);
    }

    public static int pop(StackUsingLinkedList stack) {
        if (isEmpty(stack)) {
            System.out.println("your stack is empty!");
            return -1;
        }
        else {
            int data = stack.getTop().getData();
            stack.setTop(stack.getTop().getLink());
            return data;
        }
    }

    public static void printStack(StackUsingLinkedList stack) {
        System.out.println("Now stack item:");
        if (isEmpty(stack)) {
            System.out.println("No item!");
        }
        else {
            Node node = stack.getTop();
            while (node != null) {
                System.out.print(node.getData() + " ");
                node = node.getLink();
            }
        }
    }

}
