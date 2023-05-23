import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {12, 3, 2, 4,};
        int[] ans1 = new int[arr.length];
        int[] ans = next(stack, arr, ans1);
        System.out.println(Arrays.toString(ans));
        ArrayList<Integer> a = new ArrayList<>();
    }

    public static int[] next(Stack<Integer> stack, int[] arr, int[] ans){
        for (int i = 2 * arr.length -1; i >=0; i--) {
            while (!stack.empty() && stack.peek() <= arr[i % arr.length]){
                stack.pop();
            }
            if(i < arr.length){
                if(!stack.empty()){
                    ans[i] = stack.peek();
                }
                else{
                    ans[i] = -1;
                }
            }
            stack.push(arr[i % arr.length]);
        }
        return ans;
    }
}
