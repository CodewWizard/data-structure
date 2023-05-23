package WeeklyContest329;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(10));
    }

    public static int digitSum(int n){
        int temp = n;
        int temp2 = n;
        int digitCount = 0;
        int sum = 0;
        int posCount = 0;

        // count the digit
        while (temp != 0){
            int rem = temp % 10;
            digitCount++;
            temp /= 10;
        }

        while (temp2 != 0){
            int rem = temp2 % 10;
            posCount++;
            if(digitCount % 2 == 0){
                if(posCount % 2 == 0){
                    sum = sum + rem;
                }
                else {
                    sum = sum + (-rem);
                }
            }
            else {
                if(posCount % 2 == 0){
                    sum = sum + (-rem);
                }
                else{
                    sum = sum + rem;
                }
            }
            temp2 /= 10;
        }
        return sum;
    }
}
