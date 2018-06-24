package kenny.recursive;


public class Permutation {

    // calculate recurSum function calling times
    private static int COUNT = 0;

    public static void main(String[] args) {
        char[] lists = new char[]{'A', 'B', 'C'};

        recurPerm(lists, 0, 2);

        System.out.println("Calling 'recurPerm' function times: " + COUNT);
    }

    // recursive to produce permutation from lists[i] to lists[n]
    public static void recurPerm(char[] lists, int i, int n) {
        COUNT++;

        if (i == n) {
            for(int j = 0; j <= n; j++) {
                System.out.print(lists[j] + " ");
            }
            System.out.println();
        }
        else {
            for (int j = i; j <= n; j++) {
                swap(lists, i, j);
                recurPerm(lists, i + 1, n);
                swap(lists, i, j);
            }
        }
    }

    public static void swap(char[] lists, int i, int j) {
        char temp;
        temp = lists[i];
        lists[i] = lists[j];
        lists[j] = temp;
    }
}
