package kenny.recursiveornot;

import java.util.Scanner;

public class Gcd {

    // calculate recurSum function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入兩個整數: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int recurResult = recurGcd(a, b);
        int nonRecurResult = nonRecurGcd(a, b);

        System.out.println("Recursive Result: " + recurResult);
        System.out.println("Calling 'recurGcd' function times: " + COUNT);
        System.out.print("NonRecursive Result: " + nonRecurResult);
    }

    public static int recurGcd(int a, int b) {
        COUNT++;

        if (a % b == 0) {
            return b;
        }
        else {
            return recurGcd(b, a % b);
        }
    }

    public static int nonRecurGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        else {
            while (a % b != 0) {
                int c = b;
                b = a % b;
                a = c;
            }
            return b;
        }
    }
}
