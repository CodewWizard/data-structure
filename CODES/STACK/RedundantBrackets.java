import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {
        String s = "(a+b)";
        System.out.println(isRedundant(s));
    }

    static boolean isRedundant(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                stack.push(ch);
            }
            else{

                if(ch == ')'){
                    boolean isRed = true;

                    while (stack.peek() != '('){
                        char top = stack.peek();
                        if(top == '+' || top == '-' || top == '*' || top == '/'){
                            isRed = false;
                        }
                        stack.pop();
                    }
                    if(isRed){
                        return true;
                    }
                    stack.pop();
                }
            }
        }
        return false;
    }
}
