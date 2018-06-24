package kenny.stack;

import java.util.Random;

public class StackDemo {

    public static void main(String[] args) {
        StackUsingArray stack = StackOperation.createStackUsingArray(5);

        // push item to stack until stack is full
        System.out.println("push item to stack:");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int number = random.nextInt(5);
            System.out.print(number + " ");
            StackOperation.push(stack, number);
        }
        System.out.println();

        // print stack item
        StackOperation.printStack(stack);
        System.out.print("\n");

        System.out.println("stack pop per step:");
        // pop stack item and print stack item
        for (int i = 0; i < 5; i++) {
            StackOperation.pop(stack);
            StackOperation.printStack(stack);
            System.out.print("\n");
        }
    }
}
