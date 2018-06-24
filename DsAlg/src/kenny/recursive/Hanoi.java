package kenny.recursive;

import java.util.Scanner;

public class Hanoi {

    // calculate recurSum function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入一個整數: ");

        int n = input.nextInt();

        String A = "A";
        String B = "B";
        String C = "C";

        recurHanoi(n, A, B, C);

        System.out.println("Calling 'recurBin' function times: " + COUNT);
    }

    // recursive
    public static void recurHanoi(int n, String A, String B, String C) {
        COUNT++;

        if (n == 1) {
            System.out.printf("move disk %d " + "from %s "+ "to %s\n", n, A, C);
        }
        else {
            recurHanoi(n - 1, A, C, B);
            System.out.printf("move disk %d " + "from %s "+ "to %s\n", n, A, C); // recurHanoi(1, A, B, C);
            recurHanoi(n - 1, B, A, C);
        }
    }
}
