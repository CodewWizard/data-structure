package CODES.RECURSION.SUBSET;

import java.util.*;

public class SubsetII {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int arr[] = {2, 1, 2};
        Arrays.sort(arr);
        subset2(arr, 0, new ArrayList<>(), ans);
        for (List<Integer> list: ans) {
            System.out.println(list);
        }
    }


    //striver solution

    public static void subset2 (int[] arr, int index, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < arr.length; i++) {
            if(i != index && arr[i] == arr[i - 1]) continue;
            ds.add(arr[i]);
            subset2(arr,i + 1, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
