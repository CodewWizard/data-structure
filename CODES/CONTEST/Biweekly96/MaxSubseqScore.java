package Biweekly96;

import java.util.*;
public class MaxSubseqScore {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 3, 2};
        int[] arr2 = {2, 1, 3, 4};
//        System.out.println(maxScore(arr1, arr2, 3));
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr, arr.length));
    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        long ans = 0;
        long min = Long.MAX_VALUE;
        long res = 1;
        List<List<Integer>> list = new ArrayList<>();
        list = subSet(nums1);

        List<List<Integer>> list2 = new ArrayList<>();
        list2 = subSet(nums2);

        int j = 0;
        List<Integer> subList2 = new ArrayList<>();
        for (List<Integer> temp : list2) {
            subList2.add(temp.get(j));
            j++;
        }

        List<Integer> subList = new ArrayList<>();
        for (List<Integer> temp : list){
            if(temp.size()== k){
                ans = 0;
                int i = 0;
                while(i < temp.size()){
                    ans += temp.get(i);
                    min = Math.min(nums2[i], min);
                    i++;
                }
            }
            long newRes = ans * min;
            res = Math.max(res, newRes);
        }
        return res;
    }
    static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(map.get(arr[i]));
            if(map.get(arr[i]) > 1){
                return i + 1;
            }
        }
        return -1;
    }
}
