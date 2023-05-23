import java.util.*;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(remove("acaaabbbacdddd"));
    }

    public static String remove(String s){
        Deque<Character> que = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if(!que.isEmpty() && que.peekLast() == s.charAt(i)){
                que.removeLast();
            }
            else{
                que.addLast(s.charAt(i));
            }
        }
        char[] ch = new char[que.size()];

        int i = 0;
        while (!que.isEmpty()) {
            ch[i] = que.removeFirst();
            i++;
        }
        return new String(ch);
    }
}
