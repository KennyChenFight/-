package kenny.stack;

public class StackUsingLinkedList {

    private Node node;
    private int top = -1;
    private int size;

    public StackUsingLinkedList(int n) {
        node = new Node();
        node.setData(-1);
        node.setLink(null);
        this.size = n;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
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
