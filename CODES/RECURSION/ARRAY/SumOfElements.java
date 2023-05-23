package ARRAY;

import java.util.Arrays;

public class SumOfElements {
        public static void main(String[] args) {
                int[] arr = {1, 1, 1, 1};
                System.out.println(sumOfElement(arr, 0, 0));
        }

        static int sumOfElement(int[] arr, int index, int sum){
                if(index == arr.length){
                        return sum;
                }
                sum = sum + arr[index];
                return sumOfElement(arr, index + 1, sum);
        }
}
