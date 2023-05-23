package CODES.LINKEDLIST.FarazLL;

public class DeleteNodeWithoutHead {
    public static void main(String[] args) {
        LinkedL l = new LinkedL();
        l.insertLast(4);
        l.insertLast(5);
        l.insertLast(1);
        l.insertLast(9);
        l.display();
        l.deleteNode(l.head);
        l.display();
    }
}
