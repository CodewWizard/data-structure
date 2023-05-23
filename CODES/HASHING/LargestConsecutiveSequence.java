import java.util.*;

public class LargestConsecutiveSequence {
    public static void main(String a[]){
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(consecutive(arr));
    }

    public static int consecutive (int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }
        int ans = 0;

        for(int num : arr){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }

                ans = Math.max(ans, currentStreak);
            }
        }

        return ans;
    }

}
