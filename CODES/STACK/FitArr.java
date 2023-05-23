import java.lang.reflect.Array;
import java.util.Arrays;

public class FitArr {
    public static void main(String[] args) {
        int[] arr= {54, 23,37, 33, 84, 17, 12, 31, 17, 9, 65, 56, 8, 69, 45, 95, 22, 71, 95, 69, 59, 1, 76, 52};
        int[] brr = {71, 40, 25, 43, 72, 91, 89, 27, 66, 78, 12, 50, 96, 24, 33, 13, 86, 99, 70, 94, 8, 15, 41, 42};
//        System.out.println(isFit(arr, brr, arr.length));
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static boolean isFit (int[] arr, int[] brr, int n) {
        sort(arr, n);
        sort(brr, n);
        //Complete the function
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if(arr[i] <= brr[i]){
                continue;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}
