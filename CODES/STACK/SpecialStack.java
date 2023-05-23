import java.util.Stack;

public class SpecialStack {
    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;

    public SpecialStack(){
        stack = new Stack<>();
    }
    public void push1(int data){
        //for first element

        if(stack.isEmpty()){
            stack.push(data);
            min = data;
        }

        else {
            if (data < min) {
                stack.push(2 * data - min);
                min = data;
            } else {
                stack.push(data);
            }
        }
    }

    public int pop1() {
            if(stack.isEmpty()){
                return -1;
            }
            int curr = stack.peek();
            stack.pop();
    
            if(curr > min){
                return curr;
            }
            else{
                int prevMin = min;
                int val = 2 * min - curr;
    
                return prevMin;
            }
    }
    int top(){
        if(stack.isEmpty()){
            return -1;
        }

        int curr = stack.peek();
        if(curr < min){
            return min;
        }

        else{
            return curr;
        }
    }

    int getMin(){
        if(stack.isEmpty()){
            return -1;
        }

        return min;
    }

    public static void main(String[] args) {
        SpecialStack obj = new SpecialStack();

        obj.push1(18);
        obj.push1(19);
        obj.push1(29);
        obj.push1(15);
        obj.push1(16);

        System.out.println("Min : "+obj.getMin());

//        System.out.println("Pop : "+obj.pop1());
//        System.out.println("Top : "+obj.top());

//        System.out.println("Min: "+obj.getMin());

    }
}
