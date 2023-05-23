package OTHERS;

public class TowerOfHanoi {
        public static int ans = 0;
        public static void main(String[] args) {
                System.out.println(ans);
                System.out.println(towerOfHanoi(3,  "Source", "Helper", "Destination", ans));
        }

        public static int towerOfHanoi(int n, String source, String helper, String destination, int ans){
                if(n == 1){
                        System.out.println("Transfer disk "+n+" from " + source +" to "+destination);
                        return 1;
                }
                ans += towerOfHanoi(n - 1, source, destination, helper, ans);
                System.out.println("Transfer disk "+n+" from " + source +" to "+destination);
                ans += towerOfHanoi(n - 1, helper, source, destination, ans);
                System.out.println(ans);
                return ans;
        }
}
