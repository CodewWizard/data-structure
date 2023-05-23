package SORTING.CyclicSort;

import java.util.*;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2, 2};
        System.out.println(Arrays.toString(mismatch(arr)));
    }

    public static int[] mismatch(int[] nums){

        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                int temp =  nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else {
                i++;
            }
        }

        int index = 0;
        int j = 0;
        while(index < nums.length){
            if(nums[index] != index + 1){
                return new int[] {nums[index] , index + 1};
            }
            else {
                index++;
            }
        }
        return new int[] {-1, -1};
    }
}
