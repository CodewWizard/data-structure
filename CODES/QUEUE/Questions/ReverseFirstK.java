package CODES.QUEUE.Questions;

import java.util.*;

public class ReverseFirstK {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);

        System.out.println(que);
        System.out.println(reverse(que,3));
    }

    static Queue<Integer> reverse(Queue<Integer> que, int k){
        Stack<Integer> ans= new Stack<>();

        for(int i = 0; i < k; i++){
            ans.push(que.remove());
        }

        while(!ans.isEmpty()){
            que.add(ans.pop());
        }

        int temp = que.size() - k;
        while (temp != 0){
            int val = que.remove();
            que.add(val);
            temp--;
        }


        return que;
    }

}
