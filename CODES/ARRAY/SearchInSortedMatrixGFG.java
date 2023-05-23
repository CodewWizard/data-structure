import java.util.*;

public class SearchInSortedMatrixGFG {
    public static void main(String[] args) {

        // matrix is row wise sorted and column wise sorted
        int[][] arr = new int[][]{{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        System.out.println(Arrays.toString(search(arr, 37)));
    }

    public static int[] search(int[][] arr, int target){
        int[] ans = new int[2];
        boolean flag = false;
        int n = arr.length;
        int m = arr[0].length;
        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0){
            if(arr[i][j] == target){
                ans[0] = i;
                ans[1] = j;
                flag =  true;
                System.out.println(flag);
                return ans;
            }
            if(arr[i][j] > target){
                //shift column towards the left
                j--;
            }
            else{
                //shift row towards the down
                i++;
            }
        }
        System.out.println(flag);
        return ans;
    }
}
