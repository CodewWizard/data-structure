package CODES.TWO_POINTER;

import java.util.ArrayList;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 1};
        System.out.println(reversePairs(arr));
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        int cnt = 0;
        int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && arr[i] > (2 * arr[j])){
                j++;
            }
            cnt += (j - (mid + 1));
        }

        ArrayList<Integer> temp1 = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp1.add(arr[left++]);
            }
            else{
                temp1.add(arr[right++]);
            }
        }

        while (left <= mid){
            temp1.add(arr[left++]);
        }

        while (right <= high){
            temp1.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp1.get(i - low);
        }
        return cnt;
    }

    public static int mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return 0;
        }
        int mid = (low + high) / 2;

        int temp = mergeSort(arr, low, mid);
        temp += mergeSort(arr, mid + 1, high);
        temp += merge(arr, low, mid, high);
        return temp;
    }

    public static int reversePairs(int[] arr){
        return mergeSort(arr, 0, arr.length - 1);
    }
}
