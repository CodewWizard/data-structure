import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static void main(String[] args) {
        System.out.println(pascal2(3));
    }

    public static List<Integer> pascal2(int n){
        List<Integer> res = new ArrayList<>();
        List<Integer> row, pre = null;

        for (int i = 0; i <= n; i++) {
            row = new ArrayList<Integer>();

            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    row.add(1);
                }
                else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
        }
        res = pre;
        return res;
    }
}
