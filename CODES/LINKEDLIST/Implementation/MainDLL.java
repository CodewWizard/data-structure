package CODES.LINKEDLIST.Implementation;

public class MainDLL {
    public static void main(String[] args) {
        CustomDLL linkedList = new CustomDLL();
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(9);
        linkedList.insertLast(10);
        linkedList.insert(2, 80);
        linkedList.insertFirst(1);
        linkedList.display();
    }
}
