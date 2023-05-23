package CODES.LINKEDLIST.KunalsLL;

public class LL {

    public Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    // Rotate List

    public Node rotateList(Node node, int k){
        if(k <= 0 || node == null || node.next == null){
            return node;
        }
        int n = 1;
        Node last = node;
        while(last.next != null){
            n++;
            last = last.next;
        }
        last.next = node;
        int rotation = k % n;
        int skip = n - rotation;
        Node newLast = node;

        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        node = newLast.next;
        newLast.next = null;

        head = node;
        return node;
    }

    // Reorder Linked list
    public void reorderList(Node head) {
        if(head == null || head.next == null){
            return;
        }
        Node head1 = head;
        Node mid = getMiddle(head);
        Node head2 = reverse(mid);

        // rearrange
        while (head1 != null && head2 != null){
            Node temp = head1.next;
            head1.next = head2;
            head1 = temp;

            temp = head2.next;
            head2.next = head1;
            head2 = temp;
        }

        // next of tail to null
        if(head1 != null){
            head1.next = null;
        }
    }

    // check the linked list palindrome or not
    public boolean isPalindrome(Node head){
        Node mid = getMiddle(head);
        Node headSecond = reverse(mid);
        Node re_reverseHead = headSecond;

        // compare both the halves
        while (head != null && headSecond != null){
            if(head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        // re-reverse the list
        reverse(re_reverseHead);
        return head == null || headSecond == null;
    }

    // Reverse linked list in subpart of linked listt
    public Node reverseII(Node head, int left, int right){
        if(left ==  right){
            return head;
        }

        // skip the first left - 1 nodes
        Node current = head;
        Node prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;
        
        // reverse between left and right
        Node next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    // In place Reversal of linked list (Iterative)
    public Node reverse(Node head){
        if(head == null){
            return null;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
        return head;
    }


    // Reverse a Linked list using recursion
    public void reverseUsingRecursion(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverseUsingRecursion(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    // Bubble sort
    public void bubbleSort(){
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            Node first = get(col);
            Node second = get(col + 1);

            if(first.value > second.value){
                // swap

                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second ==  tail){
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }
                else{
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        }
        else{
            bubbleSort(row - 1, 0);
        }
    }

    // Sort list - Merge Sort
    // https://leetcode.com/problems/sort-list/

    public Node sortList(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    // to get mid-part of list
    public static Node getMid(Node head)
    {
        Node midPrev = null;

        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    // to merge two halves of list
    public Node mergeTwoLists(Node head1, Node head2) {
        Node dummyHead = new Node();
        Node temp = dummyHead;

        while (head1 != null && head2 != null){
            if(head1.value < head2.value){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        temp.next = (head1 != null) ? head1 : head2;
        return dummyHead.next;
    }

    // Middle of Linked List
    // https://leetcode.com/problems/middle-of-the-linked-list/
    public static Node getMiddle(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    // Happy Number
    // https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    //linked list cycle II - find the starting position of cycle
    // https://leetcode.com/problems/linked-list-cycle-ii/
    public Node findNode(Node head1){
        int len = lenCycle(head1);

        if(len == 0){
            return null;
        }
        // find the start node

        Node first = head1;
        Node second = head1;

        while (len > 0){
            second = second.next;
            len--;
        }


        // keep moving both forward  and they will meet at cycle start
        while (first != second){
            first = first.next;
            second = second.next;
        }
        return second;
    }

    //calculate the length of cycle
    public int lenCycle(Node head1){
        Node fast = head1;
        Node slow = head1;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                //calculate length
                Node temp = slow;
                int len = 0;
                do {
                    temp = temp.next;
                    len++;
                }while (temp != slow);
                return len;
            }
        }
        return 0;
    }

    //check there is cycle is present in linked list or not
    // https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(Node head1){
        Node fast = head1;
        Node slow = head1;

        while (fast != null & fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // merge list without extra space and with recursion
    // h1 and h2 are head of the lists
    public static Node mergeRecursion(Node h1, Node h2){
        if(h1 != null && h2 != null){
            if(h1.value < h2.value){
                h1.next = mergeRecursion(h1.next, h2);
                return h1;
            }
            else{
                h2.next = mergeRecursion(h1, h2.next);
                return h2;
            }
        }
        if(h1 != null){
            return h2;
        }
        return h1;
    }

    //merge two sorted list
    // https://leetcode.com/problems/merge-two-sorted-lists/
    public static LL merge(LL list1, LL list2){

        Node first = list1.head;
        Node second = list2.head;

        LL ans = new LL();

        while (first != null && second != null){
            if(first.value < second.value){
                ans.insertLast(first.value);
                first = first.next;
            }
            else{
                ans.insertLast(second.value);
                second = second.next;
            }
        }
        while(first != null){
            ans.insertLast(first.value);
            first = first.next;
        }

        while(second != null){
            ans.insertLast(second.value);
            second = second.next;
        }
        return ans;
    }

    public void deleteDuplicates(){
        deleteDuplicates(head);
    }
    private Node deleteDuplicates(Node head) {
        if(head == null){
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }
            else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
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
    public class Node{
        public int value;
        private Node next;

        public Node(){

        }
        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
