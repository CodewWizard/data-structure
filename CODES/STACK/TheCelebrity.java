import java.util.Stack;

public class TheCelebrity {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 0},
                        {0, 0, 0},
                        {0, 1, 0}};

        System.out.println(celebrityCheck(arr));
    }

    private static int celebrityCheck(int[][] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }

        while (stack.size() > 1){
            int a = stack.peek();
            stack.pop();

            int b = stack.peek();
            stack.pop();

            if(arr[a][b] == 1){
                stack.push(b);
            }
            else{
                stack.push(a);
            }
        }

        int ans = stack.peek();

        //row check
        int zeroCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[ans][i] == 0)
                zeroCnt++;
        }

        //check all are zeroes are not
        if(zeroCnt != arr.length)
            return -1;

        // col check

        int oneCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i][ans] == 1)
                oneCnt++;
        }

        //check all are 1 except diagonal or itself
        if(oneCnt != arr.length - 1)
            return -1;

        return ans;
    }
}
