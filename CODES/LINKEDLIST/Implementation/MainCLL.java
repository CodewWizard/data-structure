package CODES.LINKEDLIST.Implementation;

public class MainCLL {
    public static void main(String[] args) {
        CustomCLL linkedList = new CustomCLL();
        linkedList.insertLast(2);
        linkedList.insertLast(10);
        linkedList.insertFirst(99);
        linkedList.insertFirst(54);
        linkedList.insertFirst(3);
        linkedList.display();
        System.out.println(linkedList.deleteFirst());
        linkedList.display();
        System.out.println(linkedList.deleteLast());
        linkedList.display();
    }
}
