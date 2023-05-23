package CODES.LINKEDLIST.KunalsLL;

public class MergeSort {
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.insertLast(5);
        l1.insertLast(4);
        l1.insertLast(3);
        l1.insertLast(2);
        l1.insertLast(1);

        l1.sortList(l1.head);
        l1.display();
    }
}
