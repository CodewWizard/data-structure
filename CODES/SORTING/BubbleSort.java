package CODES.SORTING;

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void bubble(int a[], int n){
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - 1; j++)
            {
                if(a[j] > a[j + 1]){
                    swap(a, j, j + 1);
                }
            }
        }
    }

}