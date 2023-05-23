import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "(]";
        System.out.println(valid(s,st));
    }

    public static boolean valid(String s, Stack<Character> st){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.empty()){
                    return false;
                }
                char c = st.peek();
                st.pop();
                if(s.charAt(i) == ')' && c == '('){
                    continue;
                }
                else if(s.charAt(i) == ']' && c == '['){
                    continue;
                }
                else if(s.charAt(i) == '}' && c == '{'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}
