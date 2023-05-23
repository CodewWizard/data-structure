package WeeklyContest329;

import java.util.*;

public class SortStudentsByKthScore {
    public static void main(String[] args) {
        int[][] arr = {{10,6,9,1}
                    ,{7,5,11,2},
                    {4,8,3,15}};

        int[][] res = score(arr, 2);
        for (int[] temp:res) {
            System.out.println(Arrays.toString(temp));
        }
    }

    public static int[][] score(int[][] score, int k){
        int n = score.length;
        int m = score[0].length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(score[i][k], i);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(score[i][k]);
        }
        Collections.sort(list);

        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            int element = list.get(list.size() - 1);
            list.remove(list.size() - 1);

            for (int j = 0; j < m; j++) {
                if (j == k)
                    ans[i][j] = element;
                else {
                    ans[i][j] = score[map.get(element)][j];
                }
            }
        }
        return ans;
    }
}
