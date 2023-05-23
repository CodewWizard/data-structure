package CODES.TWO_POINTER;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] arr2 = new int[]{4, 2, 0, 3, 2, 5};
        System.out.println(trappedWater(arr));
//        System.out.println(trappedWater(arr2));
    }

    public static int trappedWater(int[] arr){
        int res = 0;
        int left = 0;
        int right = arr.length - 1;
        int maxLeft = 0;
        int maxRight = 0;

        while (left <= right){
            if(arr[left] <= arr[right]){
                if(arr[left] >= maxLeft){
                    maxLeft = arr[left];
                }
                else{
                    res += maxLeft - arr[left];
                }
                left++;
            }
            else{
                if(arr[right] >= maxRight){
                    maxRight = arr[right];
                }
                else{
                    res += maxRight - arr[right];
                }
                right--;
            }
        }
        return res;
    }
}
