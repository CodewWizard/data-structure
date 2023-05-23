package CODES.LINKEDLIST.KunalsLL;

public class RemoveDuplicate {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(4);
        ll.insertLast(4);
        ll.display();

        // remove duplicate in sorted list
        ll.deleteDuplicates();
        ll.display();
    }
}
