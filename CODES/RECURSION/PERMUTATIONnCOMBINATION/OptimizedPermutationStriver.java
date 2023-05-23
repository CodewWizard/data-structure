package CODES.RECURSION.PERMUTATIONnCOMBINATION;

import java.util.*;

public class OptimizedPermutationStriver {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        List<List<Integer>> ans = new ArrayList<>();
        optimizedPermutation(0, arr, ans);
        for (List<Integer> list:ans) {
            System.out.println(list);
        }
    }

    public static void optimizedPermutation(int index, int[] arr, List<List<Integer>> ans){
        if(index == arr.length){
            //copy the list into ans
            List<Integer> list = new ArrayList<>();
            for (int j : arr) {
                list.add(j);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            optimizedPermutation(index + 1, arr, ans);
            swap(i, index, arr);
        }
    }

    private static void swap(int i, int index, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
