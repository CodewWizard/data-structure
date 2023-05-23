package CODES.QUEUE.Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        Queue<Integer> que1 = new LinkedList<>();
//
//        que.add(2);
//        que.add(9);
//        que.add(3);
//        que.add(10);
//
//        System.out.println(que);
//        System.out.println("Front: "+que.peek());
//        System.out.println("Removed element: "+que.remove());
//        System.out.println("Size: "+que.size());
//        System.out.println(que);


//        CODES.QUEUE.Implementation.CircularQueue que = new CODES.QUEUE.Implementation.CircularQueue(5);
//        que.insert(3);
//        que.insert(2);
//        que.insert(45);
//        que.insert(12);
//        que.insert(27);
//
//        que.display();
//        System.out.println("\nRemoved element: "+que.remove());
//        que.insert(67);
//        que.display();


//        CODES.QUEUE.Implementation.CustomQueue que = new CODES.QUEUE.Implementation.CustomQueue(3);
//        que.insert(5);
//        que.insert(4);
//        que.insert(3);
//
//        System.out.println(que.remove());
//        System.out.println(que.remove());
//        System.out.println(que.remove());
//        System.out.println(que.remove());

//        MyCircularDeque que = new MyCircularDeque(3);
//
//        System.out.println(que.insertLast(1));
//        System.out.println(que.insertLast(2));
//        System.out.println(que.insertFront(3));
//        System.out.println(que.insertFront(4));
//
//        System.out.println(que.getRear());
//        System.out.println(que.isFull());
//
//        System.out.println(que.deleteLast());
//        System.out.println(que.insertFront(4));
//        System.out.println(que.getFront());


        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);

//        System.out.println(que.remove());
        System.out.println(que.peek());
    }
}
