package CODES.SLIDING_WINDOW;

import java.util.*;

public class FirstNegNo {
    public static void main(String[] args) {
        System.out.println("hello this is madiha mujawar");
        int[] arr = {-8, 2, 3, -6, 10};
        System.out.println(Arrays.toString(firstNegativeNumberInWindow(arr, 2)));
    }

    public static int[] firstNegativeNumberInWindow(int[] arr, int k){
        int i = 0, j = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        while (j < arr.length){
            if(arr[j] < 0){
                temp.add(arr[j]);
            }

            if(j - i + 1 < k){
                j++;
            } else if (j - i + 1 == k) {
                if(!temp.isEmpty()){
                    res.add(temp.get(0));
                }else{
                    res.add(0);
                }
                if(arr[i] < 0){
                    temp.remove(0);
                }
                i++;
                j++;
            }
        }
        int[] op = new int[res.size()];
        for (int l = 0; l < op.length; l++) {
            op[l] = res.get(l);
        }
        return op;
    }
}
