import java.util.*;
public class ValidBrackets{
    public static void main(String args[]){
        Stack<Character> stack = new Stack<Character>();
        String a = "[()]";
        valid(stack, a);
    }

    static boolean valid(Stack<Character> stack, String a){
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '[' || a.charAt(i) == '(' || a.charAt(i) == '{'){
                stack.push(a.charAt(i));
            }
            else{
                    if(stack.isEmpty()){
                        return false;
                    }

                    int c = stack.pop();
                    if(a.charAt(i) == ')' && c == '('){
                        continue;
                    }
                    if(a.charAt(i) == '}' && c == '{'){
                    continue;
                }
                    if(a.charAt(i) == ']' && c == '['){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }

            if(stack.isEmpty()){
                return true;
            }
            return false;
        }
    }
