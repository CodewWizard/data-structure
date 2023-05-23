import java.util.Arrays;

public class SearchA2DMatrixLeetcode {
    public static void main(String[] args) {

        //In matrix, each row is sorted from left to right
        //First integer of each row is greater than previous row

        int[][] arr = new int[][]{{1, 3, 5}, {10, 11, 16}, {23, 30, 34}};
        System.out.println((search(arr, 56)));
        System.out.println((search(arr, 16)));

    }

    private static boolean search(int[][] arr, int target) {
        if(arr.length == 0){
            return false;
        }

        int n = arr.length;
        int m = arr[0].length;

        int low = 0;
        int high = (n * m) - 1;

        while (low <= high){
            int mid = (low + (high - low) / 2);

            //[mid / m] = returns row
            //[mid % m] = returns col

            if(arr[mid / m][mid % m] == target){
                return true;
            }
            if(arr[mid / m][mid % m] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}
