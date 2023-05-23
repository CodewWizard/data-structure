import java.util.Stack;

public class LargestHistogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println(largest(arr));

        //Optimized Solution -- Striver
//        System.out.println(optimized(arr));
    }

    private static int optimized(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int maxx = 0;

        for(int i = 0; i <= n; i++){

            while(!stack.isEmpty() && (i == n || arr[stack.peek()] >= arr[i])){

                int height = arr[stack.peek()];
                stack.pop();

                int width;

                if(stack.isEmpty()){
                    width = i;
                }

                else{
                    width = i - stack.peek() - 1;
                }
                maxx = Integer.max(maxx, width * height);
            }
            stack.push(i);
        }
        return maxx;
    }

    public static int largest(int[] arr){
        int n = arr.length;

        int[] next = new int[n];
        next = nextSmallerElement(arr, n);

        int[] prev = new int[n];
        prev = prevSmallerElement(arr, n);

        int area = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int len =  arr[i];

            if(next[i] == -1){
                next[i] = n;
            }
            int bred = next[i] - prev[i] - 1;

            int newArea = len * bred;
            area = Integer.max(area,newArea);
        }
        return area;
    }

    private static int[] nextSmallerElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];

            while (stack.peek() != -1 && arr[stack.peek()] >= curr){
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private static int[] prevSmallerElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int curr = arr[i];

            while (stack.peek() != -1
                    && arr[stack.peek()] >= curr){
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
