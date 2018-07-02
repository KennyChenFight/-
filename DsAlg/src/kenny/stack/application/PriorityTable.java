package kenny.stack.application;

import java.util.ArrayList;
import java.util.Stack;

public class PriorityTable {

    private final static Token[] table = {
            new Token("(", 0),
            // $ => 負號
            new Token("$", 1),
            new Token("^", 2),
            new Token("^", 3),
            new Token("*", 4),
            new Token("/", 4),
            new Token("+", 5),
            new Token("-", 5),
            new Token(">", 6),
            new Token("<", 6),
            new Token("<=", 6),
            new Token(">=", 6),
            new Token("==", 6),
            new Token("!=", 6),
            new Token("NOT", 7),
            new Token("AND", 8),
            new Token("OR", 8),
            new Token("=", 9),
            new Token("=", 10),
            new Token("(", 11),
    };

    public static int comparePriority(String token1, Stack<String> tokenStack) {
        if (tokenStack.isEmpty()) {
            return 0;
        }

        int priority1 = -1;
        int priority2 = -1;

        for (Token token : table) {
            String operator = token.getOperator();
            int priority = token.getPriority();
            if (token1.equals(operator)) {
                priority1 = priority;
                break;
            }
        }

        for (Token token : table) {
            String operator = token.getOperator();
            int priority = token.getPriority();
            if (tokenStack.peek().equals(operator)) {
                priority2 = priority;
            }
        }
        //System.out.println(priority1 + " " + priority2);
        if (priority1 < priority2) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public static ArrayList<String> sentenceConvertToTokenList(String sentence) {
        ArrayList<String> tokenList = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            boolean isOperand = true;
            for (int j = 0; j < table.length; j++) {
                Token token = table[j];
                if ((i + 2) < sentence.length()) {
                    String temp1 = sentence.charAt(i) + sentence.charAt(i + 1) + sentence.charAt(i + 2) + "";
                    String temp2 = sentence.charAt(i) + sentence.charAt(i + 1) + "";
                    String temp3 = sentence.charAt(i) + "";
                    if (token.getOperator().equals(temp1)) {
                        tokenList.add(token.getOperator());
                        isOperand = false;
                        i = i + 2;
                        break;
                    }
                    else if (token.getOperator().equals(temp2)) {
                        tokenList.add(token.getOperator());
                        isOperand = false;
                        i = i + 1;
                        break;
                    }
                    else {
                        if (token.getOperator().equals(temp3)) {
                            tokenList.add(token.getOperator());
                            isOperand = false;
                            break;
                        }
                    }
                }
                else if ((i + 1) < sentence.length()) {
                    String temp2 = sentence.charAt(i) + sentence.charAt(i + 1) + "";
                    String temp3 = sentence.charAt(i) + "";

                    if (token.getOperator().equals(temp2)) {
                        tokenList.add(token.getOperator());
                        isOperand = false;
                        i = i + 1;
                        break;
                    }
                    else {
                        if (token.getOperator().equals(temp3)) {
                            tokenList.add(token.getOperator());
                            isOperand = false;
                            break;
                        }
                    }
                }
                else {
                    String temp3 = sentence.charAt(i) + "";
                    if (token.getOperator().equals(temp3)) {
                        tokenList.add(token.getOperator());
                        isOperand = false;
                        break;
                    }
                }
            }
            if (isOperand) {
                tokenList.add(sentence.charAt(i) + "");
            }
        }
        return tokenList;
    }

    public static boolean isOperand(String token) {
        if (token.equals(")")) {
            return false;
        }
        for (Token temp : table) {
            String operator = temp.getOperator();
            if (token.equals(operator)) {
                return false;
            }
        }
        return true;
    }
}
