import java.util.Stack;

public class InsertLast {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(8);
        stack.push(3);

        Display(stack);
        insert(stack,5);
        System.out.println("Ans : \n");
        Display(stack);
    }

    static void insert(Stack<Integer> stack, int k){
        if(stack.isEmpty()){
            stack.push(k);
            return;
        }

        int temp = stack.pop();
        insert(stack,k);
        stack.push(temp);
    }

    public static void Display(Stack<Integer> s)
    {
        if (s.isEmpty())
            return;

        int x = s.pop();

        Display(s);

        System.out.print(x + " ");

        s.push(x);
    }
}
