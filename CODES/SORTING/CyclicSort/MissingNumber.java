package SORTING.CyclicSort;


import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length){
            if(arr[i] != i){
                return i;
            }
            i++;
        }
        return i;
    }

}
