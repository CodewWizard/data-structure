import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        for (int[] temp : arr) {
            System.out.println(Arrays.toString(temp));
        }
    }

    public static void rotate(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[j][i];;
                arr[j][i] = temp;
            }
        }
//        for (int[] temp : arr) {
//            System.out.println(Arrays.toString(temp));
//        }
//        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length/2; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }
}
