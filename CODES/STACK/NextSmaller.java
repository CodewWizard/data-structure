import java.util.Arrays;
import java.util.Stack;

public class NextSmaller{
    public static void main(String ar[]){
        int[] arr = {4, 2, 1, 5, 3};
        Stack<Integer> stack = new Stack<>();
        int[] ans = next(stack, arr);
//        System.out.println(Arrays.toString(ans));

        immediateSmaller(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] next(Stack<Integer> stack, int[] arr){
        stack.push(-1);
        int[] ans = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            while(arr[i] <= stack.peek()){
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }

    static void immediateSmaller(int arr[], int n) {
        for(int i = 0; i < n - 1; i++){
            if(arr[i] < arr[i + 1]){
                arr[i] = -1;
            }
            else{
                arr[i] = arr[i + 1];
            }
        }
        arr[n - 1] = -1;
    }
}
