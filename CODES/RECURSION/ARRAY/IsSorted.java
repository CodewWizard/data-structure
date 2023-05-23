package ARRAY;

import java.util.Arrays;

public class IsSorted {
        public static void main(String[] args) {
                int[] arr = {1, 2, 83, 4, 5};
                System.out.println(isSorted(arr, arr.length));
        }

        public static boolean isSorted(int[] arr, int size){
                if(size == 0 || size == 1){
                        return true;
                }

                if(arr[0] > arr[1]){
                        return false;
                }
                else{
                         boolean ans = isSorted(Arrays.copyOfRange(arr, 1, size), size - 1);
                        return ans;
                }
        }
}
