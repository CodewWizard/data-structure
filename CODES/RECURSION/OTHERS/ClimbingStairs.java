package OTHERS;

public class ClimbingStairs {
        public static void main(String[] args) {
                System.out.println(climbingStairs(4));
        }

        public static int climbingStairs(int  n){
                if(n < 0){
                        return 0;
                }
                if(n == 0){
                        return 1;
                }
                int ans =  climbingStairs(n - 1) + climbingStairs(n - 2);
                return ans;
        }
}
