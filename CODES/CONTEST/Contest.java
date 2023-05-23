import java.util.Arrays;

public class Contest {
    public static void main(String[] args) {
        int[] arr = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        int[] ans = applyOperations(arr);
        System.out.println(Arrays.toString(ans));

    }
        public static void zeroesToEnd(int[] arr, int n){
            int k = 0;

            for (int i: arr) {
                if(i != 0){
                    arr[k++] = i;
                }
            }

            for (int i = k; i < arr.length; i++) {
                arr[i] = 0;
            }
        }

        public static int[] applyOperations(int[] nums) {
            int[] ans = new int[nums.length];

            for(int i = 0; i < nums.length; i++){
                ans[i] = nums[i];
            }

            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] == nums[i+1]){
                    ans[i] = nums[i] * 2;
                    ans[i + 1] = 0;
                    nums[i] = ans[i];
                    nums[i+1] = ans[i + 1];
                }
            }
            zeroesToEnd(ans, nums.length);
            return ans;
    }
}
