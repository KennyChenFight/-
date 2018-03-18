package kenny.recursiveornot;

import java.util.Scanner;

public class Sum {

    // calculate recurSum function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入整數: ");

        int n = input.nextInt();
        int recurResult = recurSum(n);
        int nonRecurResult = nonRecurSum(n);

        System.out.println("Recursive Result: " + recurResult);
        System.out.println("Calling 'recurSum' function times: " + COUNT);
        System.out.print("NonRecursive Result: " + nonRecurResult);

    }

    // recursive
    public static int recurSum(int n) {
        COUNT++;

        if (n == 0) {
            return 0;
        }
        else {
            return recurSum(n - 1) + n;
        }
    }

    // non-recursive
    public static int nonRecurSum(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            return sum;
        }
    }
}
