import java.util.Stack;

public class SortStack{
    public static void main(String a[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(10);
        stack.push(-2);
        stack.push(5);

        display(stack);
        sort(stack);
        System.out.println("\nAns :");
        display(stack);
    }

    static void insertInSortedWay(Stack<Integer> stack, int k){
        if(stack.isEmpty() || stack.peek() < k){
            stack.push(k);
            return;
        }

        int temp = stack.pop();
        insertInSortedWay(stack, k);
        stack.push(temp);
    }

    static void sort(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int temp = stack.pop();
        sort(stack);
        insertInSortedWay(stack, temp);
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

