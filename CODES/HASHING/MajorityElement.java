import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 5, 1, 3, 1, 5, 1};
        System.out.println((majority(arr)));
//        System.out.println(majority2(arr));
    }

    private static ArrayList<Integer> majority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int temp = 0;
        for(Map.Entry<Integer, Integer> entry :map.entrySet()){
            if(entry.getValue() > ((arr.length) / 3)){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }

    static int majority2(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int temp = 0;
        for(Map.Entry<Integer, Integer> entry :map.entrySet()){
            if(entry.getValue() > ((arr.length) / 2)){
                ans = entry.getKey();
            }
        }
        if(ans == 0){
            return ans = -1;
        }
        return ans;
    }
}
