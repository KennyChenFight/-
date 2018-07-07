package kenny.stack.application;

import java.util.Scanner;
import java.util.Stack;

public class CompareBracketsDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入具有加(+)減(-)乘(*)除(/)且加上括號的式子:");
        String sentence = input.nextLine();
        System.out.println("合法的式子:" + compareBrackets(sentence));

    }

    public static boolean compareBrackets(String sentence) {
        Stack<String> tokenStack = new Stack<>();

        for (int i = 0; i < sentence.length(); i++) {
            String x = sentence.charAt(i) + "";
            if (x.equals("(")) {
                tokenStack.push(x);
            }
            else {
                if (tokenStack.isEmpty()) {
                    return false;
                }
                else {
                    tokenStack.pop();
                }
            }
        }
        if (tokenStack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
