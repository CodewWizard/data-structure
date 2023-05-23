package CODES.LINKEDLIST.StriversLL;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(3);
        l.insertLast(4);
        l.insertLast(5);

        l.display();
        l.removeNth(l.head, 5);
        l.display();
    }
}
