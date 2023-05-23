import java.util.Stack;

public class ReverseStackRec{
    public static void main(String a[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(8);
        stack.push(3);

        display(stack);
        reverse(stack);
        System.out.println("\nAns:\n");
        display(stack);
    }

    static void insertAtBottom(Stack<Integer> stack, int k){
        if(stack.isEmpty()){
            stack.push(k);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, k);
        stack.push(temp);
    }


    static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.pop();
        reverse(stack);
        insertAtBottom(stack, temp);
    }

    public static void display(Stack<Integer> s)
    {
        if (s.isEmpty())
            return;

        int x = s.pop();

        display(s);

        System.out.print(x + " ");

        s.push(x);
    }
}
