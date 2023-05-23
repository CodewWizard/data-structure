package CODES.LINKEDLIST.Implementation;

public class CustomCLL {

    private Node head;
    private Node tail;

    public CustomCLL(){
        this.head = null;
        this.tail = null;
    }

    public int deleteLast(){
        if(head == null){
            return -1;
        }

        Node temp = head;
        int val = tail.val;
        while (temp.next != tail){
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
        return val;
    }

    public int deleteFirst(){
        if(head == null){
            return -1;
        }
        int val = head.val;
        head = head.next;
        tail.next = head;
        return val;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.next = head;
            tail = node;
            tail.next = tail;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.next = head;
            tail = node;
            tail.next = tail;
            return;
        }
        node.next = head;
        tail.next = node;
        head = node;
    }

    public void display(){
        if(head == null){
            return;
        }
        Node temp = head;
        while (temp.next != head){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.val + " -> ");
        System.out.println("END");
    }

    private class Node{
        Node next;
        int val;

        public Node(int val){
            this.val = val;
        }
    }
}
