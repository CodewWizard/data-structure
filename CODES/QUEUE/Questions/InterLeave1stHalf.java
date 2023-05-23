package CODES.QUEUE.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeave1stHalf {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(11);
        que.add(12);
        que.add(13);
        que.add(14);
        que.add(15);
        que.add(16);
//        que.add(17);
//        que.add(18);
//        que.add(19);
//        que.add(20);

        System.out.println(que);
        interLeave(que);
        System.out.println(que);
    }

    static void interLeave(Queue<Integer> que){
        Queue<Integer> newQ = new LinkedList<>();

        //fetch 1st half elements and push it into newQ
        int size = que.size() / 2;
        for (int i = 0; i < size; i++) {
            newQ.add(que.remove());
        }

        //add the elements
        while (!newQ.isEmpty()){
            que.add(newQ.remove());
            que.add(que.remove());
        }
    }
}
