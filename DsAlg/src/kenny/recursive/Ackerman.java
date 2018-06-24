package kenny.recursive;

import java.util.Scanner;

public class Ackerman {

    // calculate recurAckerman function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入兩個整數");

        int n = input.nextInt();
        int m = input.nextInt();
        int recurResult = recurAckerman(n, m);

        System.out.println("Recursive Result: " + recurResult);
        System.out.println("Calling 'recurBin' function times: " + COUNT);
    }

    public static int recurAckerman(int m, int n) {
        COUNT++;

        if (m == 0) {
            return n + 1;
        }
        else if(n == 0){
            return recurAckerman(m - 1, 1);
        }
        else {
            return recurAckerman(m - 1, recurAckerman(m , n - 1));
        }
    }
}
