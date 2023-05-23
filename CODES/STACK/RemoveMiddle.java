import java.util.Scanner;
import java.util.Stack;

public class RemoveMiddle {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
//        stack.push(74);
//        stack.push(67);
//        stack.push(49);
//        stack.push(94);
//        stack.push(8);
//        stack.push(11);
//        stack.push(1);

        int count = 0;
        int size = 5;
        System.out.println(stack);
        remove(stack, count, size);
        System.out.println(stack);

    }

    public static void remove(Stack<Integer> stack, int count, int size){
        if(count == size / 2){
            stack.pop();
            return;
        }

        int num = stack.peek();
        stack.pop();
        remove(stack,count + 1,size);
        stack.push(num);
    }
}


