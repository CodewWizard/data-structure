package CODES.LINKEDLIST.KunalsLL;

public class IsPalindrome {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(2);
        l.insertLast(1);

        System.out.println(l.isPalindrome(l.head));
    }
}
