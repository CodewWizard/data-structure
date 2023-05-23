package CODES.QUEUE.Implementation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) throws Exception {
        Deque<Integer> deck = new ArrayDeque<>();

        deck.add(2);
        deck.add(65);
        deck.add(9);
        deck.add(34);
        System.out.println(deck);
        System.out.println("Removed element: " +deck.remove());
        System.out.println("Removed element from the end: " +deck.removeFirst());

        System.out.println(deck);


    }
}
