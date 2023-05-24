package CODES.LINKEDLIST.FarazLL;

public class LinkedL {
    public Node head;
    private Node tail;
    private int size;

    public LinkedL(){
        this.size = 0;
    }

    // remove Linked list elements
    public Node removeElements(Node head, int val) {
        Node dummy = new Node();
        dummy.value = -1;
        dummy.next = head;
        Node t1 = dummy;

        if(head == null) return null;

        while(t1.next != null && t1 !=null){
            if(t1.next.value == val){
                Node temp = t1.next;
                t1.next = temp.next;
            }
            else{
                t1 = t1.next;
            }
        }

        return dummy.next;
    }

    // convert binary no in linked list to integer
    public int binaryToInt(){
        Node tmp = head;
        int ans = 0;
        while (tmp != null){
            ans *= 2;
            ans += tmp.value;
            tmp = tmp.next;
        }
        return ans;
    }

    // Delete node without head
    // node is pointing to that node which to be deleted
    public void deleteNode(Node node){
        // first we swapped the nodes
        int temp = node.value;
        node.value = node.next.value;
        node.next.value = temp;

        // linking node
        node.next = node.next.next;
    }

    // Find the Nt
    // h node from end of Linked list
    public int getNthFromLast(Node head, int n)
    {
        // Your code here
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n > size){
            return -1;
        }

        Node start = new Node();
        start.next = head;
        Node fast = start;
        Node slow = start;

        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int val = slow.next.value;
        return val;
    }

    // Remove Nth node from end of Linked list
    public Node removeNth(Node node, int n){
        if(node.next == null && n == 1){
            return null;
        }
        if(node == null || node.next == null){
            return node;
        }
        int size = 0;
        Node temp = node;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        temp = node;
        for(int i = 0; i < size - n - 1; i++){
            temp = temp.next;
        }
        if(size == n){
            head = node.next;
            return node;
        }
        if(temp.next == null){
            temp.next = null;
        }
        else{
            temp.next = temp.next.next;
        }
        return node;
    }


    // Reverse linked list
    public Node reverseInPlace(Node node){
        Node newHead = null;
        while (node != null){
            Node next = node.next;
            node.next = newHead;
            newHead = node;
            node = next;
        }
        head = newHead;
        return head;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLastNode = get(size - 2);
        int val = tail.value;
        tail = secondLastNode;
        tail.next = null;
        size--;
        return val;
    }
    public int deleteFirst(){
        int temp = head.value;
        head = head.next;
        if(head == tail){
            tail = null;
        }
        size--;
        return temp;
    }

    public void insertWithRecursive(int val, int index){
        head = insertWithRecursive(val, index, head);
    }
    private Node insertWithRecursive(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertWithRecursive(val, index - 1, node.next);
        return node;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

       Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
       Node node = new Node(val);
        tail.next = node;
        tail = node;

        size += 1;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        public int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(){}

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}

