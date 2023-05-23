import java.util.*;
public class LargestSubarrayWZero{
    public static void main(String a[]){
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(subarray(arr));
    }

    public static int subarray(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(sum == 0){
                max = i + 1;
            }
            else{
                if(map.get(sum) != null){
                    max = Math.max(max, i - map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
}
