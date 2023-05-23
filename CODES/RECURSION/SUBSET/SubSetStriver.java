package CODES.RECURSION.SUBSET;

import java.util.*;
public class SubSetStriver {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        sub(0, new ArrayList<>(), arr);
    }

    public static void sub(int index, List<Integer> list, int[] arr){
        if(index == arr.length){
                System.out.println(list);
            return;
        }

        //taking
        list.add(arr[index]);
        sub(index + 1, list, arr);
        list.remove(list.size() - 1);

        //ignoring
        sub(index + 1, list, arr);

    }
}
