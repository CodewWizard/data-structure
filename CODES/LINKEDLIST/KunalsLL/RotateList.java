package CODES.LINKEDLIST.KunalsLL;

public class RotateList {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(3);
        l.insertLast(4);
        l.insertLast(5);

        l.display();
        l.rotateList(l.head, 2);
        l.display();
    }
}
