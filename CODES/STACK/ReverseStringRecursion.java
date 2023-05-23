import java.util.Stack;

public class ReverseStringRecursion {
    public static void main(String args[]){
        String a = "madiha";
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < a.length(); i++){
            stack.push(a.charAt(i));
        }
        String ans = "";
        System.out.println(reverse(stack, ans));
    }

    static String reverse(Stack<Character> stack, String ans){
        if(stack.isEmpty()){
            return ans;
        }
        char temp = stack.pop();
        ans += temp;
        return reverse(stack, ans);
    }

}
