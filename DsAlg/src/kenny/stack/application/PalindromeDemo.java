package kenny.stack.application;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入一字串:");
        String sentence = input.nextLine();
        System.out.println("是否符合迴文:" + isPalindrome(sentence));

    }

    public static boolean isPalindrome(String sentence) {
        Stack<String> tokenStack = new Stack<>();
        int n = sentence.length();
        for (int i = 0; i < n / 2; i++) {
            String x = sentence.charAt(i) + "";
            tokenStack.push(x);
        }

        int index = n / 2;
        if (n % 2 == 1) {
            index = n / 2 + 1;
        }

        for (int i = index; i < n; i++) {
            String x = sentence.charAt(i) + "";
            if (!x.equals(tokenStack.pop())) {
                return false;
            }
        }
        return true;
    }
}
