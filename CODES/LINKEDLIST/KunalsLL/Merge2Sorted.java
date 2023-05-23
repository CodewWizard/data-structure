package CODES.LINKEDLIST.KunalsLL;

public class Merge2Sorted {
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(4);


        LL l2 = new LL();
        l2.insertLast(1);
        l2.insertLast(3);
        l2.insertLast(4);

//        LL ans = LL.merge(l1, l2);
//        ans.display();


        // merge with recursion and without extra space
        LL ll1 = new LL();
        ll1.insertLast(1);
        ll1.insertLast(3);
        ll1.insertLast(5);

        LL ll2 = new LL();

        ll2.insertLast(1);
        ll2.insertLast(2);
        ll2.insertLast(9);
        ll2.insertLast(14);

        LL.mergeRecursion(ll1.head, ll2.head);
        ll1.display();
        ll2.display();
    }
}
