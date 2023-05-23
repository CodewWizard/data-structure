package OTHERS;

public class PowerOf {
        public static void main(String[] args) {
                // here a is base and b is power
                System.out.println(power(2, 4));
        }

        public static int power(int base, int pow){
                if(pow == 0){
                        return 1;
                }
                if(pow == 1){
                        return base;
                }

                int ans = power(base, pow / 2);
                if(pow % 2 == 0){
                        return ans * ans;
                }
                else {
                        return base * ans * ans;
                }
        }
}
