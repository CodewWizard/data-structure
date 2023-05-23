package CODES.LINKEDLIST.KunalsLL;

public class ReverseII {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertLast(23);
        l.insertLast(98);
        l.insertLast(11);
        l.insertLast(50);
        l.insertLast(32);
        l.insertLast(76);
        l.insertLast(82);

        l.display();
        l.reverseII(l.head, 3, 6);
        l.display();
    }
}
