package CODES.QUEUE.Questions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepChar {
    public static void main(String[] args) {
        String str = "aabc";
        System.out.println(nonRepeatChar(str));
    }

    static String nonRepeatChar(String str){
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        Queue<Character> que = new LinkedList<>();
        String ans =  "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //increase count
            if(!map.containsKey(ch)){
                que.add(ch);
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (!que.isEmpty()) {
                if((map.get(que.peek()) > 1)) {
                    que.remove();
                }
                else{
                    ans += que.peek();
                    break;
                }
            }

            if(que.isEmpty()){
                ans += "#";
            }
        }
        return ans;
    }
}
