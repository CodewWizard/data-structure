package ARRAY;

import java.util.*;
public class CommonElements {
        public static void main(String[] args) {
                int[] A = {1, 5, 10, 20, 40, 80};
                int[] B = {6, 7, 20, 80, 100};
                int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
                System.out.println(commonElements(A, B, C));
        }
        static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C) {
                // code here
                HashSet<Integer> set1 = new HashSet<>();
                HashSet<Integer> set2 = new HashSet<>();
                HashSet<Integer> set3 = new HashSet<>();

                ArrayList<Integer> ans = new ArrayList<>();

                for (int i : A) {
                        set1.add(i);
                }

                for (int i : B) {
                        set2.add(i);
                }

                for (int i : C) {
                        set3.add(i);
                }

                List<Integer> list = new ArrayList<Integer>(set1);
                for (int i = 0; i < set1.size(); i++) {
                        if (set2.contains(list.get(i)) && set3.contains(list.get(i))) {
                                ans.add(list.get(i));
                        }
                }
                Collections.sort(ans);
                return ans;
        }
}
