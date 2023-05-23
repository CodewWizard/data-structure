import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] a = new int[] {2, 3, 1, 2, 3};
        System.out.println(duplicates(a, a.length));
    }

    public static ArrayList<Integer> duplicates(int a[], int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        if(n == 0){
            ans.add(-1);
            return ans;
        }

        for(int i = 0; i < n; i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }
            else{
                map.put(a[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1){
                ans.add(entry.getKey());
            }
        }

        if(ans.isEmpty()){
            ans.add(-1);
            return ans;
        }
        return ans;
    }

}
