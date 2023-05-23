package CODES.LINKEDLIST.FarazLL;

public class ConvertBinaryToInt {
    public static void main(String[] args) {
        LinkedL l = new LinkedL();
        l.insertLast(1);
        l.insertLast(1);
        l.insertLast(0);

        System.out.println(l.binaryToInt());
    }
}
