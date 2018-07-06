package kenny.stack.application;

import java.util.Scanner;
import java.util.Stack;

public class PrefixEvaluationDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入只有加(+)減(-)乘(*)除(/)及次方(^)的Prefix式子:");
        String sentence = input.nextLine();
        Stack<String> s = new Stack<>();
        for (int j = sentence.length() - 1; j >= 0; j--) {
            String x = sentence.charAt(j) + "";
            if (PriorityTable.isOperand(x)) {
                s.push(x);
                System.out.println("push:" + x);
            }
            else {
                int number = PriorityTable.getOperatorNumber(x);
                if (number == -1) {
                    System.out.println("找不到此operator");
                    break;
                }
                else {
                    String[] temp = new String[number];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = s.pop();
                        System.out.println("pop:" + temp[i]);
                    }
                    String result = "";
                    if (number == 2) {
                        switch (x) {
                            case "+":
                                result = String.valueOf(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]));
                                s.push(result);
                                System.out.println(temp[0] + "+" + temp[1] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                            case "-":
                                result = String.valueOf(Integer.parseInt(temp[0]) - Integer.parseInt(temp[1]));
                                s.push(result);
                                System.out.println(temp[0] + "-" + temp[1] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                            case "*":
                                result = String.valueOf(Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]));
                                s.push(result);
                                System.out.println(temp[0] + "*" + temp[1] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                            case "/":
                                result = String.valueOf(Integer.parseInt(temp[0]) / Integer.parseInt(temp[1]));
                                s.push(result);
                                System.out.println(temp[0] + "/" + temp[1] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                            case "^":
                                result = String.valueOf(Math.pow(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
                                s.push(result);
                                System.out.println(temp[0] + "^" + temp[1] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                        }
                    }
                }
            }
        }
        System.out.println("result:" + s.pop());
    }
}
