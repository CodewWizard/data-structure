package CODES.QUEUE.Questions;

import java.util.*;

public class FindOriginalArray {
    public static void main(String[] args)  {
        int[] arr = new int[]{1, 3, 4, 2, 6, 8};
        int[] arr2 = new int[] {6, 3, 0, 1};
        System.out.println((findOriginalArray(arr)));
    }

    public static ArrayList<Integer> findOriginalArray(int[] changed)  {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();

        Arrays.sort(changed);

        for (int i : changed) {
            if(que.isEmpty() || que.peek() != i){
                ans.add(i);
                que.add(i * 2);
            }
            else{
                que.remove();
            }
        }
        if(!que.isEmpty()){
            return new ArrayList<>();
        }
        return ans;
    }
}
