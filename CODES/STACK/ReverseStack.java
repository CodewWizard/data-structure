import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(7);
        stack.push(3);
        stack.push(2);
        System.out.println(stack);
        getReverse(stack);
        System.out.println(stack);
    }

    private static void solve(Stack<Integer> stack, int element){
        if(stack.empty()){
            stack.push(element);
            return;
        }

        int num = stack.peek();
        stack.pop();

        solve(stack,element);
        stack.push(num);
    }

    private static void getReverse(Stack<Integer> stack) {
        if(stack.empty()){
            return;
        }

        int element = stack.peek();
        stack.pop();
        getReverse(stack);
        solve(stack, element);
    }
}
