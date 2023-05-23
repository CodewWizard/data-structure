public class DiffBetElementSumNDigitSum {
        public static void main(String[] args) {
                int[] arr = {1, 15, 6, 3};
                System.out.println(differenceOfSum(arr));
        }

        public static int differenceOfSum(int[] nums) {
                int digitSum = 0;
                int sum = 0;
                for (int i = 0; i < nums.length; i++) {
                        int temp = nums[i];
                        while(temp != 0){
                                int rem = temp % 10;
                                digitSum += rem;
                                temp /= 10;
                        }
                        sum += nums[i];
                }
                int res = sum - digitSum;
                 return Math.abs(res);
        }
}
