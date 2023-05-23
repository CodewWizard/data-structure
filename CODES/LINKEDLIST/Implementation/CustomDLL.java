package CODES.LINKEDLIST.Implementation;

public class CustomDLL {
    private Node head;

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int index, int val){
        if(index == 0){
            insertFirst(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        temp.next.prev = node;
        node.prev = temp;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node tail = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = node;
        node.prev = tail;
    }


    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        //printing reverse order

        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
