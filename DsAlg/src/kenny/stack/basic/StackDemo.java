package kenny.stack.basic;

import java.util.Random;

public class StackDemo {

    public static void main(String[] args) {
        //stackUsingArrayDemo();
        stackUsingLinkedListDemo();
    }

    /*
    Stack using array simple demo
    first push item to full
    second pop per step
    third print stack
     */
    public static void stackUsingArrayDemo() {
        StackUsingArray stack = StackOperationForArray.createStack(5);

        // push item to stack until stack is full
        System.out.println("first push item to stack:");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int number = random.nextInt(5);
            System.out.print(number + " ");
            StackOperationForArray.push(stack, number);
        }
        System.out.print("\n");
        System.out.println("Stack is Full:" + StackOperationForArray.isFull(stack));

        // print stack item
        StackOperationForArray.printStack(stack);
        System.out.print("\n");

        System.out.println("then stack pop per step:");
        // pop stack item and print stack item
        for (int i = 0; i < 5; i++) {
            StackOperationForArray.pop(stack);
            StackOperationForArray.printStack(stack);
            System.out.print("\n");
        }
        System.out.print("Stack is empty:" + StackOperationForArray.isEmpty(stack));
    }

    /*
    Stack using linked list simple demo
    first push three items
    second pop per step
    third print stack
     */
    public static void stackUsingLinkedListDemo() {
        StackUsingLinkedList stack = StackOperationForLinkedList.createStack();
        StackOperationForLinkedList.push(stack, 1);
        StackOperationForLinkedList.push(stack, 2);
        StackOperationForLinkedList.push(stack, 3);
        StackOperationForLinkedList.printStack(stack);
        StackOperationForLinkedList.pop(stack);
        System.out.print("\n");
        StackOperationForLinkedList.printStack(stack);
        StackOperationForLinkedList.pop(stack);
        System.out.print("\n");
        StackOperationForLinkedList.printStack(stack);
        StackOperationForLinkedList.pop(stack);
        System.out.print("\n");
        StackOperationForLinkedList.printStack(stack);
    }
}
