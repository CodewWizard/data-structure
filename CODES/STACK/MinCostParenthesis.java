import java.util.Stack;

public class MinCostParenthesis {
    public static void main(String[] args) {
        System.out.println(findMinimumCost("((()"));
    }

    static int findMinimumCost(String s){
        if(s.length() % 2 != 0){
            return -1;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(ch);
            }
            else{

                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }

        //stack contains invalid expressions
        int a = 0, b = 0;
        while (!stack.empty()){
            if(stack.peek() == '('){
                b++;
            }
            else{
                a++;
            }
            stack.pop();
        }

        int ans = (a + 1) / 2 + (b + 1) / 2;
        return ans;
    }
}
