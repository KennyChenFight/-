package kenny.recursiveornot;

import java.util.Scanner;

public class Fac {

    // calculate recurFac function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("輸入整數:");

        int n = input.nextInt();
        int recurResult = recurFac(n);
        int nonRecurResult = nonRecurFac(n);

	    System.out.println("Recursive Result: " + n + "! = " + recurResult);
	    System.out.println("Calling 'recurFac' function times: " + COUNT);
	    System.out.println("NonRecursive Result: " + n + "! = " + nonRecurResult);
    }

    // recursive
    public static int recurFac(int n) {
        COUNT++;

        if (n == 0) {
            return 1;
        }
        else {
            return recurFac(n - 1) * n;
        }
    }

    // non-recursive
    public static int nonRecurFac(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            int sum = 1;

            for (int i = 1; i <= n; i++) {
                sum *= i;
            }

            return sum;
        }
    }
}
