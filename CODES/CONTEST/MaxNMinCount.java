import java.util.ArrayList;
import java.util.HashSet;

public class MaxNMinCount {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2,3};
        System.out.println(count(arr));
    }

    public static int count(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int neg = 0;
        int pos = 0;

        for (int i: arr) {
            list.add(i);
        }

        for (int i : list) {
            if(i < 0){
                neg++;
            }
            else if(i > 0){
                pos++;
            }
        }

        return Math.max(neg, pos);
    }
}
