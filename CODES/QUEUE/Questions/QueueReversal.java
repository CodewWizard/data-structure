package CODES.QUEUE.Questions;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;


public class QueueReversal{
    public static void main(String ar[]){
        Queue<Integer> que= new LinkedList<>();
        que.add(12);
        que.add(4);
        que.add(7);
        que.add(3);

        reverse(que);
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
    }

    static Queue<Integer> reverse(Queue<Integer> que){
        Stack<Integer> stack= new Stack<>();

        //Push the elements to stack
        while(!que.isEmpty()){
            stack.push(que.remove());
        }

//again add the elements to queue
        while(!stack.isEmpty()){
            que.add(stack.pop());
        }

        return que;

    }
}
