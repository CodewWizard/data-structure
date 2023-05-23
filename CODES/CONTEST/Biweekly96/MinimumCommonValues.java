package Biweekly96;

import java.util.*;

public class MinimumCommonValues {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 6};
        int[] b = {2, 3, 4, 5};
        System.out.println(commonValues(a, b));
    }

    public static int commonValues(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], i);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])){
                ans = Math.min(ans, arr2[i]);
            }
        }
        return ans;
    }
}
