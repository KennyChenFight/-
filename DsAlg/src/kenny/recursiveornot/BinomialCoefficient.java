package kenny.recursiveornot;

import java.util.Scanner;

public class BinomialCoefficient {

    // calculate recurBin function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入兩個整數, 前>後: ");

        int n = input.nextInt();
        int m = input.nextInt();
        int recurResult = recurBin(n, m);
        int nonRecurResult = nonRecurBin(n, m);

        System.out.println("Recursive Result: " + recurResult);
        System.out.println("Calling 'recurBin' function times: " + COUNT);
        System.out.print("NonRecursive Result: " + nonRecurResult);
    }

    // recursive
    public static int recurBin(int n, int m) {
        COUNT++;
        if (n < m) {
            return -1; // error because n must be > m
        }
        else if (m == 0 || m == n) {
            return 1;
        }
        else {
            return recurBin(n - 1, m) + recurBin(n - 1, m - 1);
        }
    }

    // non-recursive
    public static int nonRecurBin(int n, int m) {
        if (n < m) {
            return -1;
        }
        else if (m == 0 || m == n) {
            return 1;
        }
        else {
            int n_numerator = 1;
            int m_denominator = 1;
            int n_m_denominator = 1;

            for (int i = 1; i <= n; i++) {
                n_numerator *= i;
            }

            for (int i = 1; i <= m; i++) {
                m_denominator *= i;
            }

            for (int i = 1; i <= (n - m); i++) {
                n_m_denominator *= i;
            }

            return n_numerator / (m_denominator * n_m_denominator);
        }
    }
}
