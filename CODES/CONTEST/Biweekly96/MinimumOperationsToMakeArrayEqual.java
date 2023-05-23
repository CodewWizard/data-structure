package Biweekly96;

import java.util.*;
public class MinimumOperationsToMakeArrayEqual {
    public static void main(String[] args) {
        int[] arr1 = {3, 8, 5, 2};
        int[] arr2 = {2, 4, 1, 6};
        System.out.println(minOperations(arr1, arr2, 1));
    }
    public static long minOperations(int[] nums1, int[] nums2, int k) {
        if (k == 0)
            return Arrays.equals(nums1, nums2) ? 0 : -1;

        int n = nums1.length;
        long ans = 0, count = 0;

        for (int i = 0; i < n; i++) {
            int diff = nums1[i] - nums2[i];
            if (diff % k != 0)
                return -1;

            if (diff > 0)
                count += diff / k;

            ans += diff;
        }
        return ans == 0 ? count : -1;
    }
}
