package STACK;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(3);
        stack.push(14);
        stack.push(72);
        System.out.println(stack.push(6));

        System.out.println(stack);

        stack.pop();

        System.out.println(stack );

        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);

//        System.out.println(que);
        que.remove();
//        System.out.println(que);
    }
}
