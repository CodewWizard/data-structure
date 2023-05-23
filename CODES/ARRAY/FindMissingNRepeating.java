import java.util.HashMap;
import java.util.*;

public class FindMissingNRepeating {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 6, 2, 1, 1};
        System.out.println(Arrays.toString(find(arr)));
    }


    public static int[] find(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(j)){
                //missing no
                ans[1] = j;
                j++;
                continue;
            }
            else if(map.get(arr[i]) > 1){
                //repeating no
                ans[0] = arr[i];
            }
            j++;
        }
        return ans;
    }
}
