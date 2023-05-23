package CODES.LINKEDLIST.KunalsLL;

public class ReorderList {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(3);
        l.insertLast(4);
        l.insertLast(5);

        l.display();
        l.reorderList(l.head);
        l.display();
    }
}
