package kenny.stack.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfixAndPostfixDemo {

    public static void main(String[] args) {
        System.out.print("input infix: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        ArrayList<String> tokenList = PriorityTable.sentenceConvertToTokenList(sentence);
        Stack<String> tokenStack = new Stack<>();

        System.out.print("Postfix: ");
        // infix to postfix
        for (String x : tokenList) {
            if (PriorityTable.isOperand(x)) {
                System.out.print(x);
            }
            else {
                if (x.equals(")")) {
                    String y = "";
                    do {
                        y = tokenStack.pop();
                        if (!y.equals("(")) {
                            System.out.print(y);
                        }
                    } while (!y.equals("("));
                }
                else {
                    switch (PriorityTable.comparePriority(x, tokenStack, true)) {
                        // x 優先性 > 目前tokenStack
                        case 0:
                            tokenStack.push(x);
                            break;
                        // x 優先性 <= 目前tokenStack的top element
                        case 1:
                            do {
                               String y = tokenStack.pop();
                               System.out.print(y);
                            } while (PriorityTable.comparePriority(x, tokenStack, true) == 1);
                            tokenStack.push(x);
                    }
                }
            }
        }

        while(!tokenStack.isEmpty()) {
            String y = tokenStack.pop();
            System.out.print(y);
        }

        System.out.println();

        // infix to prefix
        System.out.print("Prefix: ");
        Stack<String> t = new Stack<>();
        Collections.reverse(tokenList);
        for (String x : tokenList) {
            if (PriorityTable.isOperand(x)) {
                t.push(x);
            }
            else {
                if (x.equals("(")) {
                    String y = "";
                    do {
                        y = tokenStack.pop();
                        if (!y.equals(")")) {
                            t.push(y);
                        }
                    } while (!y.equals(")"));
                }
                else {
                    switch (PriorityTable.comparePriority(x, tokenStack, false)) {
                        // x 優先性 > 目前tokenStack
                        case 0:
                            tokenStack.push(x);
                            break;
                        // x 優先性 <= 目前tokenStack的top element
                        case 1:
                            do {
                               String y = tokenStack.pop();
                                t.push(y);
                            } while (PriorityTable.comparePriority(x, tokenStack, false) == 1);
                            tokenStack.push(x);
                    }
                }
            }
        }

        while(!tokenStack.isEmpty()) {
            String y = tokenStack.pop();
            t.push(y);
        }
        while(!t.isEmpty()) {
            String y = t.pop();
            System.out.print(y);
        }
    }
}
