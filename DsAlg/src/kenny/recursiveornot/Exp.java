package kenny.recursiveornot;

import java.util.Scanner;

public class Exp {

    // calculate recurExp function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入兩個整數: ");

        int n = input.nextInt();
        int m = input.nextInt();
        int recurResult = recurExp(n, m);
        int nonRecurResult = nonRecurExp(n, m);

        System.out.println("Recursive Result: " + recurResult);
        System.out.println("Calling 'recurExp' function times: " + COUNT);
        System.out.print("NonRecursive Result: " + nonRecurResult);
    }

    // recursive
    public static int recurExp(int x, int y) {
        COUNT++;

        if (y == 0) {
            return 1;
        }
        else {
            return x * recurExp(x, y - 1);
        }
    }

    // non-recursive
    public static int nonRecurExp(int x, int y) {
        if (y == 0) {
            return 1;
        }
        else {
            int result = x;

            for (int i = 1; i < y; i++){
                result *= x;
            }

            return result;
        }
    }

    // another recursive approach
    public static int recurFoo(int x, int n) {
        int f;
        if (n % 2 == 0) {
            f = 1;
        }
        else {
            f = x;
        }
        if (n < 2) {
            return f;
        }
        else {
            return f * recurFoo(x * x, n / 2);
        }
    }
}
