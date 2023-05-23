import java.util.*;

public class SubarrayWXOR{
    public static void main(String a[]){
        int[] arr = {4, 2, 2, 6, 4};
        System.out.println(count(arr, 6));
    }

    public static int count(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        int xor = 0;

        for(int i = 0; i < arr.length; i++){
            xor = xor ^ arr[i];

            if(map.get(xor ^ k) != null){
                cnt += map.get(xor ^ k);
            }

            if(xor == k){
                cnt++;
            }

            if(map.get(xor) != null){
                map.put(xor, map.get(xor) + 1);
            }
            else{
                map.put(xor, 1);
            }
        }
        return cnt;
    }
}
