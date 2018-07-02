package kenny.stack.application;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfixDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        ArrayList<String> tokenList = PriorityTable.sentenceConvertToTokenList(sentence);
        Stack<String> tokenStack = new Stack<>();

        for (String token : tokenList) {
            if (PriorityTable.isOperand(token)) {
                System.out.print(token);
            }
            else {
                if (token.equals(")")) {
                    String y = "";
                    do {
                        y = tokenStack.pop();
                        if (!y.equals("(")) {
                            System.out.print(y);
                        }
                    } while (!y.equals("("));
                }
                else {
                    switch (PriorityTable.comparePriority(token, tokenStack)) {
                        case 0:
                            tokenStack.push(token);
                            break;
                        case 1:
                            do {
                               String y = tokenStack.pop();
                               System.out.print(y);
                            } while (PriorityTable.comparePriority(token, tokenStack) == 1);
                            tokenStack.push(token);
                    }
                }
            }
        }

        while(!tokenStack.isEmpty()) {
            String y = tokenStack.pop();
            System.out.print(y);
        }
    }
}
