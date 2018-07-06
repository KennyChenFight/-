package kenny.stack.application;

import java.util.*;

public class PostfixEvaluationDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入只有加(+)減(-)乘(*)除(/)及次方(^)的Postfix式子:");
        String sentence = input.nextLine();
        Stack<String> s = new Stack<>();
        for (int j = 0; j < sentence.length(); j++) {
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
                                result = String.valueOf(Integer.parseInt(temp[1]) + Integer.parseInt(temp[0]));
                                s.push(result);
                                System.out.println(temp[1] + "+" + temp[0] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                            case "-":
                                result = String.valueOf(Integer.parseInt(temp[1]) - Integer.parseInt(temp[0]));
                                s.push(result);
                                System.out.println(temp[1] + "-" + temp[0] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                            case "*":
                                result = String.valueOf(Integer.parseInt(temp[1]) * Integer.parseInt(temp[0]));
                                s.push(result);
                                System.out.println(temp[1] + "*" + temp[0] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                            case "/":
                                result = String.valueOf(Integer.parseInt(temp[1]) / Integer.parseInt(temp[0]));
                                s.push(result);
                                System.out.println(temp[1] + "/" + temp[0] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                            case "^":
                                result = String.valueOf(Math.pow(Integer.parseInt(temp[1]), Integer.parseInt(temp[0])));
                                s.push(result);
                                System.out.println(temp[1] + "^" + temp[0] + "=" + result);
                                System.out.println("push:" + result);
                                break;
                        }
                    }
                }
            }
        }
        System.out.println("result: " + s.pop());
    }
}
