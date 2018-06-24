package kenny.stack;

public class StackOperationForArray {

    public static StackUsingArray createStack(int n) {
        return new StackUsingArray(n);
    }



    public static boolean isFull(StackUsingArray stack) {
        if (stack.getTop() == stack.getSize() - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isEmpty(StackUsingArray stack) {
        if (stack.getTop() == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void push(StackUsingArray stack, int item) {
        if (isFull(stack)) {
            System.out.println("your stack is full!");
        }
        else {
            int[] newStack = stack.getStack();
            stack.setTop(stack.getTop() + 1);
            int top = stack.getTop();
            newStack[top] = item;
            stack.setStack(newStack);
        }
    }

    public static int pop(StackUsingArray stack) {
        if (isEmpty(stack)) {
            System.out.println("your stack is empty!");
            return -1;
        }
        else {
            int item = stack.getStack()[stack.getTop()];
            stack.setTop(stack.getTop() - 1);
            return item;
        }
    }

    public static void printStack(StackUsingArray stack) {
        System.out.println("Now stack item:");
        if (isEmpty(stack)) {
            System.out.println("No item!");
        }
        else {
            int[] newStack = stack.getStack();
            for (int i = stack.getTop(); i >= 0; i--) {
                System.out.print(newStack[i] + " ");
            }
        }
    }

}
