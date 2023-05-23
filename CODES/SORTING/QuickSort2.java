package SORTING;

import java.util.Arrays;

public class QuickSort2 {
        public static void main(String[] args) {
                int[] arr = {10, 80, 30, 90, 40, 50, 70};
                quickSort(arr, 0, arr.length - 1);
                System.out.println(Arrays.toString(arr));
        }

        public static void quickSort(int[] arr, int low, int high){
                if(low < high){
                        int pivotIndex = partition(arr, low, high);

                        quickSort(arr, low, pivotIndex -1);
                        quickSort(arr, pivotIndex + 1, high);
                }
        }

        static int partition(int[] arr, int low, int high){
                int pivot = arr[high];
                int index = low - 1;

                for (int i =low; i < high; i++) {
                        if(arr[i] < pivot){
                                index++;
                                //swap
                                int tmp = arr[index];
                                arr[index] = arr[i];
                                arr[i] = tmp;
                        }
                }
                index++;
                int temp = arr[index];
                arr[index] = pivot;
                arr[high] = temp;
                return index;
        }
}
