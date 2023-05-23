package PERMUTATIONnCOMBINATION;

public class DiceThrow {
        public static void main(String[] args) {
                dice("", 2);
        }

        public static void dice(String ans, int target){
                if(target == 0){
                        System.out.println(ans);
                        return;
                }

                for (int i = 1; i <= 6 && i <= target; i++) {
                        dice(ans + i, target - i);
                }
        }
}
