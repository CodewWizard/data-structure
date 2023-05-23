package CODES.RECURSION.PERMUTATIONnCOMBINATION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSumI {
    public static void main(String[] args) {
        int arr[] = {7,2,6,5};
        List<List<Integer>> res = combinationSum(arr, 7);
//        for (List<Integer> list:res) {
//            System.out.println(list);
//        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combinationSumByStriver(0, arr, 16, ans, new ArrayList<>());
        for (List<Integer> list:ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombination(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(candidates[index] <= target){
            ds.add(candidates[index]);
            findCombination(index,candidates,target - candidates[index],ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(index + 1,candidates,target,ans, ds);
    }

    public static void combinationSumByStriver(int index, int[] arr, int k, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list){
        if(index == arr.length){
            if (k == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if(arr[index] <= k){
            list.add(arr[index]);
            //index will pass as it is
            // minus the current element from k
            combinationSumByStriver(index, arr, k - arr[index], ans, list);
            list.remove(list.size() - 1);
        }

        combinationSumByStriver(index + 1, arr, k, ans, list);
    }
}
