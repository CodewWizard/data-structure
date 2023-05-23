import java.util.*;

public class DeleteMidStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Display(stack);
        remove(stack, 0, stack.size());
        System.out.println("\nAns -> ");
        Display(stack);

    }

    public static void remove(Stack<Integer> stack, int cnt, int N){
        if(cnt == N/2){
            stack.pop();
            return;
        }
        int temp = stack.pop();
        remove(stack, cnt+1, N);
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
