package CODES.RECURSION.SUBSET;

import java.util.ArrayList;
import java.util.List;

public class SubSetWhoseSumIsK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
//        subSeqWithSumK(0, new ArrayList<>(), arr);
        System.out.println(oneSubseqWithSumK(0, new ArrayList<>(), 0, arr, 2));
//        System.out.println(countSubSeqWhoseIsSumIsK(0, new ArrayList<>(), arr, 2, 0));
    }

    public static void subSeqWithSumK(int index, List<Integer> list, int[] arr, int k){
        if(index == arr.length){
            int sum = 0;
            for (int i:list) {
                sum += i;
            }
            if(sum == k){
                System.out.println(list);
            }
            return;
        }

        //taking
        list.add(arr[index]);
        subSeqWithSumK(index + 1, list, arr, k);
        list.remove(list.size() - 1);

        //ignoring
        subSeqWithSumK(index + 1, list, arr, k);

    }

    // Technique to print one answer
    public static boolean oneSubseqWithSumK(int index, List<Integer> list, int sum, int[] arr, int targetSum){
        if(index == arr.length){
            if(targetSum == sum){
                System.out.println(list);
                return true;
            }
            else return false;
        }

        list.add(arr[index]);
        sum += arr[index];

        if(oneSubseqWithSumK(index + 1, list, sum, arr, targetSum)){
            return true;
        }

        sum -= arr[index];
        list.remove(list.size() - 1);

        if(oneSubseqWithSumK(index + 1, list, sum, arr, targetSum)){
            return true;
        }

        return false;
    }

    public static int countSubSeqWhoseIsSumIsK(int index, List<Integer> list, int[] arr, int targetSum, int sum){
        if(index == arr.length){
            if(targetSum == sum){
                System.out.println(list);
                return 1;
            }
            else return 0;
        }

        //taking
        sum += arr[index];
        list.add(arr[index]);
        int left = countSubSeqWhoseIsSumIsK(index + 1, list, arr, targetSum, sum);
        list.remove(list.size() - 1);
        sum -= arr[index];

        //ignoring
        int right = countSubSeqWhoseIsSumIsK(index + 1, list, arr, targetSum, sum);
        return left + right;
    }
}
