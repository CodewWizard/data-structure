import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
//        System.out.println(Arrays.toString(twoSum(arr, 14)));
//        pattern();
    }

    static int[] twoSum(int[] arr, int target){
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target - arr[i])){
                ans[1] = i;
                ans[0] = map.get(target - arr[i]);
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }

    static void pattern(){
        //5 is no of rows (input)
        int k = 5 * 2 -1;
        int flag = 0;
        int temp = 1;
        for (int i = 1; i <= k ; i++) {
            for (int j = 1; j <= k; j++) {
                if(j == i || j == (k - i + 1)){
                    System.out.print(temp);
                }
                System.out.print(" ");
            }
            if(temp == 5){
                flag = 1;
            }
            if(flag == 1){
                temp--;
            }
            else{
                temp++;
            }

            System.out.println();
        }
    }
}
