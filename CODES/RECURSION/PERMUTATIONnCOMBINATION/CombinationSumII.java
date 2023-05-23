package CODES.RECURSION.PERMUTATIONnCOMBINATION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int arr[] = {2,5,2,1,2};
        int[] arr2 = {10, 1, 2, 7, 6, 1, 5};
//        List<List<Integer>> res = combinationSumII(arr2, 8);
//        for (List<Integer> list:res) {
//            System.out.println(list);
//        }

        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        combinationSumIIByStriver(0, arr, 5, ans, new ArrayList<>());
        for (List<Integer> list: ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> combinationSumII(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds) {
            if(target == 0){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i = index; i < candidates.length; i++){
                if(i > index && candidates[i] == candidates[i - 1]){
                    continue;
                }
                if(candidates[i] > target){
                    break;
                }
                ds.add(candidates[i]);
                findCombinations(i + 1,candidates,target - candidates[i],ans, ds);
                ds.remove(ds.size() - 1);
            }
    }

    public static void combinationSumIIByStriver(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if(i > index && arr[i] == arr[i - 1]){
                continue;
            }

            if(arr[i] > target){
                break;
            }

            list.add(arr[i]);
            combinationSumIIByStriver(i + 1, arr, target - arr[i], ans, list);
            list.remove(list.size() - 1);
        }
    }
}
