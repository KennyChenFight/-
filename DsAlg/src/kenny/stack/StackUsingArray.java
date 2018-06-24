package kenny.stack;

public class StackUsingArray {

    private int stack[];
    private int top = -1;
    private int size;

    public StackUsingArray(int n) {
        this.stack = new int[n];
        this.size = n;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
