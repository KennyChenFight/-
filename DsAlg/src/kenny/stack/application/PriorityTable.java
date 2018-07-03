package kenny.stack.application;

import java.util.ArrayList;
import java.util.Stack;

public class PriorityTable {

    private final static Token[] convertToPostfixtable = {
            new Token("(", 0),
            // $用來代表負號
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

    private final static Token[] convertToPrefixtable = {
            new Token(")", 0),
            // $用來代表負號
            new Token("$", 1),
            new Token("^", 2),
            new Token("^", 2),
            new Token("*", 3),
            new Token("/", 4),
            new Token("+", 5),
            new Token("-", 6),
            new Token(">", 7),
            new Token("<", 8),
            new Token("<=", 9),
            new Token(">=", 10),
            new Token("==", 11),
            new Token("!=", 12),
            new Token("NOT", 13),
            new Token("AND", 14),
            new Token("OR", 15),
            new Token("=", 16),
            new Token("=", 16),
            new Token(")", 17),
    };

    public static int comparePriority(String token1, Stack<String> tokenStack, boolean isPost) {
        Token[] table = isPost ? convertToPostfixtable : convertToPrefixtable;

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
            for (int j = 0; j < convertToPostfixtable.length; j++) {
                Token token = convertToPostfixtable[j];
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
        for (Token temp : convertToPostfixtable) {
            String operator = temp.getOperator();
            if (token.equals(operator)) {
                return false;
            }
        }
        return true;
    }
}
