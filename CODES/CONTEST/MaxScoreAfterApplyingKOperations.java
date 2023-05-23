import java.util.Arrays;

public class MaxScoreAfterApplyingKOperations {
    public static void main(String[] args) {
        double a = 4;
        double b = 10;
        System.out.println(Math.ceil(a/3));
        System.out.println(Math.ceil(b/3));

        int[] arr = new int[]{533854490,546147233,543352274,161843442,268635067};
//        System.out.println(maxKelements(arr, 7));
        maxKelements(arr, 3);
    }

    public static void maxKelements(int[] arr, int k){
        long count = 0;


        int i = 0;
        int j = 1;
        for (i = 0; i < k - 1; i++) {
            if(arr[i] >= arr[j]){
                count += arr[i];
                double temp = Math.ceil((double)arr[i] / 3);
//                arr[i] = (int)temp;
            }
            else{
                count += arr[j];
                double temp = Math.ceil((double)arr[j] / 3);
//                arr[j] = (int)temp;
            }
            j++;
        }

        if(k < arr.length){
            count += arr[arr.length  - 1];
        }
        else{
            if(arr[j - 1] >= arr[i - 1]){
                count += arr[j - 1];
                double temp = Math.ceil((double)arr[j] / 3);
//            arr[j - 1] = (int)temp;
            }
            else{
                count += arr[i - 1];
                double temp = Math.ceil((double)arr[i] / 3);
//            arr[i - 1] = (int)temp;
            }
        }


        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }

}

