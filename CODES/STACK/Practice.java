import java.util.Arrays;
import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
//        Stack<Character> stack = new Stack<>();
//        String str = "Madiha";
//        System.out.println(reverse(stack, str));


//        Stack<Integer> stack = new Stack<>();
//        stack.push(2);
//        stack.push(5);
//        stack.push(3);
//        stack.push(10);
//        stack.push(4);
//
//        System.out.println(stack);
//        middle(stack);
//        System.out.println(stack);

//        String str = "(])";
//
//        System.out.println(valid(str));

//        Stack<Integer> stack = new Stack<>();
//        stack.push(7);
//        stack.push(1);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println(stack);
//        insertAtBottom(stack, 9);
//        System.out.println(stack);

//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        stack.push(2);
//        stack.push(8);
//        stack.push(3);
//
//        System.out.println(stack);
//        sort(stack);
//        System.out.println(stack);

        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[] {2, 1, 5, 6, 2, 3};
        int[] ans = nextSmallerElement(arr,arr.length);
        System.out.println(Arrays.toString(ans));
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

    private static void sort(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.peek();
        stack.pop();
        sort(stack);
        sortInsert(stack, temp);
    }

    private static void sortInsert(Stack<Integer> stack, int temp) {
        if(stack.isEmpty() || (stack.peek() < temp)){
            stack.push(temp);
            return;
        }
        int num = stack.peek();
        stack.pop();


        sortInsert(stack, temp);
        stack.push(num);
    }

    private static void insertAtBottom(Stack<Integer> stack, int x) {
        if(stack.isEmpty()){
            stack.push(x);
            return;
        }
        int temp = stack.peek();

        stack.pop();
        insertAtBottom(stack,x);
        stack.push(temp);
    }

    private static boolean valid(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if((str.charAt(i) == ']' && stack.peek() == '[') || (str.charAt(i) == '}' && stack.peek() == '{') || (str.charAt(i) == ')' && stack.peek() == '(')){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void middle(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
         int i = 0;
        while (i < stack.size() / 2 ){
            temp.push(stack.peek());
            stack.pop();
            i++;
        }
        stack.pop();
        while (!temp.isEmpty()){
            stack.push(temp.peek());
            temp.pop();
        }
    }

    public static String reverse(Stack<Character> stack, String str){
        String ans = "";
        int i = 0;
        while (i < str.length()){
            stack.push(str.charAt(i));
            i++;
        }
        while (!stack.isEmpty()){
            ans += stack.peek();
            stack.pop();
        }
        return ans;
    }
}
