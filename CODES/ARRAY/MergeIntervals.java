import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] arr1 = new int[][]{{1, 4}, {4, 5}};

//        int[][] ans = mergeIntervals(arr);
        int[][] ans = mergeIntervals(arr1);


        for(int[] val: ans)
        {
            System.out.print(Arrays.toString(val));
        }
    }

    public static int[][] mergeIntervals(int[][] interval){
        List<int[]> res = new ArrayList<>();

        if(interval.length == 0){
            return res.toArray(new int[0][]);
        }

        Arrays.sort(interval, (a, b)-> a[0] - b[0]);

        int start = interval[0][0];
        int end = interval[0][1];

        for (int[] i: interval) {
            if(i[0] <= end){
                end = Math.max(end, i[1]);
            }
            else{
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }
}
