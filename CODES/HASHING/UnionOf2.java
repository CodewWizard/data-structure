import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionOf2 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[] {3, 4, 5};

        System.out.println(union(arr1, arr2));
        System.out.println(union2(arr1, arr2));
    }

    public static int union(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        //because hashset does not allow duplicates
        for (int i : arr1) {
            set.add(i);
        }

        for (int j : arr2) {
            set.add(j);
        }
        return set.size();
    }

    public static ArrayList<Integer> union2(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int j : arr1) {
            if (!set.contains(j)) {
                set.add(j);
                ans.add(j);
            }
        }

        for (int j : arr2) {
            if (!set.contains(j)) {
                set.add(j);
                ans.add(j);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
