import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(91);
        System.out.println(stack);
        pushAtBottom(stack, 4);
        System.out.println(stack);
    }

    public static void solve(Stack<Integer> stack, int x){
        if(stack.empty()){
            stack.push(x);
            return;
        }

        int num = stack.pop();
        solve(stack,x);
        stack.push(num);
    }

    public static void pushAtBottom(Stack<Integer> stack, int x){
        solve(stack, x);
    }
}
