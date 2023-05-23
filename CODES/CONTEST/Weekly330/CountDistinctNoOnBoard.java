package CODES.CONTEST.Weekly330;

public class CountDistinctNoOnBoard {
    public static void main(String[] args) {
        System.out.println(distinctIntegers(6));
    }

    public static int distinctIntegers(int n) {
        if(n == 1){
            return 1;
        }
        return n - 1;
    }
}
