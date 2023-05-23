package CODES.LINKEDLIST.KunalsLL;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }

    public static boolean isHappy(int n) {
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

    private static int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

}
