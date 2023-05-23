package CODES.LINKEDLIST.StriversLL;

public class ReverseLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertLast(4);
        ll.insertLast(2);
        ll.insertLast(7);
        ll.insertLast(9);
        ll.insertLast(3);
        ll.display();
        ll.reverseInPlace(ll.head);
        ll.display();
    }
}
