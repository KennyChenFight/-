package kenny.recursiveornot;

import java.util.ArrayList;
import java.util.Scanner;

public class Fib {

    // calculate recurFib function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入整數: ");

        int n = input.nextInt();
        int recurResult = recurFib(n);
        int nonRecurResult = nonRecurFib(n);

        System.out.println("Recursive Result: " + recurResult);
        System.out.println("Calling 'recurFib' function times: " + COUNT);
        System.out.print("NonRecursive Result: " + nonRecurResult);
    }

    // recursive
    public static int recurFib(int n) {
        COUNT++;

        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return recurFib(n - 1) + recurFib(n - 2);
        }
    }

    // non-recursive
    public static int nonRecurFib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);

            for (int i = 2; i <= n; i++) {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
            int result = list.get(list.size() - 1);

            return result;

            /* another method
            int a = 0;
            int b = 1;
            int c = 0;

            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            return c;
            */
        }
    }
}
