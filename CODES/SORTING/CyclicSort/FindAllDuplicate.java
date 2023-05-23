package SORTING.CyclicSort;

import java.util.*;
public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
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
        while(index < nums.length){
            if(nums[index] != index + 1){
                ans.add(nums[index]);
                index++;
            }
            else {
                index++;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
