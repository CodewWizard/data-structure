package CODES.ARRAY;

import java.util.*;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr, 4)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                ans[i] = nums[j];
                j++;
            }
            else{
                ans[i] = nums[n];
                n++;
            }
        }
        return ans;
    }
}
