package CODES.SLIDING_WINDOW;

import java.util.Arrays;

public class MaxSubarrSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxSubArraySumOfSizeK(arr, 3));
    }

    public static int maxSubArraySumOfSizeK(int[] arr, int k){
        int i = 0, j = 0, sum = 0, max = Integer.MIN_VALUE;
        while (j < arr.length){
            sum += arr[j];
            
            if(j - i + 1 < k){
                j++;
            }
            else if (j - i + 1 == k) {
                max = Integer.max(sum, max);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
