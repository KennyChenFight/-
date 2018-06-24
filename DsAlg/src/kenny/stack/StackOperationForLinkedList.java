package kenny.stack;

public class StackOperationForLinkedList {

    public static StackUsingLinkedList createStack(int n) {
        return new StackUsingLinkedList(n);
    }

    public static boolean isFull(StackUsingLinkedList stack) {
        if (stack.getTop() == stack.getSize() - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isEmpty(StackUsingLinkedList stack) {
        if (stack.getTop() == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void push(StackUsingLinkedList stack, int item) {
        if (isFull(stack)) {
            System.out.println("your stack is full!");
        }
        else {
            Node node = new Node();
            stack.setTop(stack.getTop() + 1);
            node.setData(item);
            node.setLink(stack.getNode());
            stack.setNode(node);
        }
    }

    public static int pop(StackUsingLinkedList stack) {
        if (isEmpty(stack)) {
            System.out.println("your stack is empty!");
            return -1;
        }
        else {
            int data = stack.getNode().getData();
            stack.setTop(stack.getTop() - 1);
            stack.setNode(stack.getNode().getLink());
            return data;
        }
    }

    public static void printStack(StackUsingLinkedList stack) {
        System.out.println("Now stack item:");
        if (isEmpty(stack)) {
            System.out.println("No item!");
        }
        else {
            Node node = stack.getNode();
            while (node.getLink() != null) {
                System.out.print(node.getData() + " ");
                node = node.getLink();
            }
        }
    }

}
