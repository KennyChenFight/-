package kenny.stack.application;

import java.util.Scanner;
import java.util.Stack;

// 假設輸入的字串只有a、b，且必須符合{a^n b^n | n >= 0}
// 也就是代表:1. a出現n次 2. b出現n次 3. a一律出現在b之前
public class CompareTwoStrDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入只含有a、b的字串:");
        String sentence = input.nextLine();
        System.out.println("是否符合:" + compare(sentence));
    }

    public static boolean compare(String sentence) {

        // flag = 0 means 還沒遇到b之前的state
        int flag = 0;
        Stack<String> s = new Stack<>();
        for (int i = 0; i < sentence.length(); i++) {
            String x = sentence.charAt(i) + "";
            if (x.equals("a")) {
                if (flag == 1) {
                    return false;
                }
                else {
                    s.push(x);
                }
            }
            else {
                flag = 1;
                if (s.isEmpty()) {
                    return false;
                }
                else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
}
