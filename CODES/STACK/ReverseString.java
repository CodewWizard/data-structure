import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "mad";
        System.out.println(getReverse(stack, str));
    }

    private static String getReverse(Stack<Character> stack, String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.empty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
