import java.util.Stack;

public class Sort {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(31);
        stack.push(7);
        stack.push(1);
        System.out.println(stack);
        sortAstack(stack);
        System.out.println(stack);
    }

    public static void sorted(Stack<Integer> stack, int element){
        if(stack.empty() || (!stack.empty() && stack.peek() > element)){
            stack.push(element);
            return;
        }

        int num = stack.pop();
        sorted(stack,element);
        stack.push(num);
    }

    public static void sortAstack(Stack<Integer> stack){
        if(stack.empty()){
            return;
        }

        int element =  stack.pop();
        sortAstack(stack);
        sorted(stack, element);
    }
}
