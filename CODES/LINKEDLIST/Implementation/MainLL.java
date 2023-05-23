package CODES.LINKEDLIST.Implementation;

public class MainLL {
    public static void main(String[] args) {
        CustomLL linkedList = new CustomLL();
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);
        linkedList.insertLast(4);
        linkedList.insert(5, 1);

        linkedList.display();
        System.out.println(linkedList.deleteFirst());
        linkedList.display();
        System.out.println(linkedList.deleteLast());
        linkedList.display();
        System.out.println(linkedList.delete(1));
        linkedList.display();
        linkedList.insertLast(8);
        linkedList.insertLast(23);
        linkedList.insertWithRecursive(10, 2);
        linkedList.display();
    }
}
