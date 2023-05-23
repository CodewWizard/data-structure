package CODES.QUEUE.Questions;

import java.util.*;

public class SlidingWindowMax{
    public static void main(String a[]){
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(slide(arr, 3)));
    }

    public static int[] slide(int[] arr, int k){
        Deque<Integer> que = new ArrayDeque<>();
        int[] ans = new int[arr.length - k + 1];
        int temp = 0;

        for(int i = 0; i < arr.length; i++){

            //removing out of range integers
            if(!que.isEmpty() && que.peek() == i - k){
                que.poll();
            }

            //remove smaller numbers
            while (!que.isEmpty() && arr[que.peekLast()] < arr[i]){
                que.pollLast();
            }

            que.offer(i);
            if(i >= k - 1){
                ans[temp++] = arr[que.peek()];
            }
        }
        return ans;
    }
}
