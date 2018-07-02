package kenny.stack.application;

public class Token {

    private String operator;
    private int priority;

    public Token(String operator, int priority) {
        this.operator = operator;
        this.priority = priority;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}
