package kenny.recursive;

import java.util.Scanner;

public class TwoExp {

    // calculate recurTwoExp function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入整數: ");

        int n = input.nextInt();
        int recurResult = recurTwoExp(n);
        int nonRecurResult = nonRecurTwoExp(n);

        System.out.println("Recursive Result: " + recurResult);
        System.out.println("Calling 'recurTwoExp' function times: " + COUNT);
        System.out.print("NonRecursive Result: " + nonRecurResult);
    }

    // recursive
    public static int recurTwoExp(int n) {
        COUNT++;

        if (n == 0) {
            return 1;
        }
        else {
            return 2 * recurTwoExp(n - 1);
        }
    }

    // non-recursive
    public static int nonRecurTwoExp(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            int result = 1;
            for(int i = 1; i <= n; i++){
                result *= 2;
            }

            return result;
        }
    }
}
