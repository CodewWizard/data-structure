import java.util.*;

public class IntersectionOf2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{6, 1, 2, 2};

        System.out.println(intersection(arr1, arr2));
    }

    public static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (int j : arr2) {
            if (set.contains(j)) {
                ans.add(j);
                set.remove(j);
            }
        }
        System.out.println(ans);
        return ans.size();
    }
}
