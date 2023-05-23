package CODES.QUEUE.Questions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class FirstNegInt {
    public static void main(String[] args) {
        int[] arr = new int[]{-8, 2, 3, -6, 10};

        System.out.println(Arrays.toString(firstNegative(arr, arr.length, 2)));
    }

    static int[] firstNegative(int[] arr, int n, int k){
        int[] ans = new int[n - k + 1];
        int idx = 0;

        for(int i = 0; i <= n-k; i++) {
            int temp = 0;
            for(int j = i; j < i+k; j++) {
                if(arr[j] < 0) {
                    temp = arr[j];
                    break;
                }
            }
            ans[idx++] = temp;
        }

        return ans;
    }
}
