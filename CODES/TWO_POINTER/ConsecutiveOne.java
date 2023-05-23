package CODES.TWO_POINTER;

public class ConsecutiveOne{
    public static void main(String a[]){
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(consecutiveOne(arr));
    }

    static int consecutiveOne(int[] arr){
        int cnt = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                cnt++;
            }
            else{
                cnt = 0;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}
