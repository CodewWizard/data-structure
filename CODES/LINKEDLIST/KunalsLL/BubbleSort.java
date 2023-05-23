package CODES.LINKEDLIST.KunalsLL;

public class BubbleSort {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertLast(5);
        l.insertLast(4);
        l.insertLast(3);
        l.insertLast(2);
        l.insertLast(1);

        l.bubbleSort();
        l.display();
    }
}
