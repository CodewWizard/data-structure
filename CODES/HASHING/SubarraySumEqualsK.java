import java.util.*;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 20, 3, 10, 5};
        System.out.println(subArrayCount(arr, 33));
    }

    public static int subArrayCount(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>(); //<Sum, Freq>
        map.put(0, 1); //empty subarray
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            }

            else{
                map.put(sum, 1);
            }
        }
        return ans;
    }
}
