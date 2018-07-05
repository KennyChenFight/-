package kenny.stack.application;

public class Token {

    private String operator;
    private int priority;
    // means 代表這個operator需要幾個operand來計算，-1 means 不討論
    private int number = -1;

    public Token(String operator, int priority, int number) {
        this.operator = operator;
        this.priority = priority;
        this.number = number;
    }

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
