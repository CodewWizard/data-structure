package PERMUTATIONnCOMBINATION;

import java.util.*;

public class CombinationOfPhoneNo {
        public static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        public static void main(String[] args) {
                ArrayList<String> res = new ArrayList<>();
                comb("23", 0, "", res);
                System.out.println(res);
        }
        public static void comb(String str, int index, String ans, ArrayList <String> res){
                if(index == str.length()){
                        res.add(ans);
                        System.out.println(ans);
                        return;
                }
                String map = keypad[str.charAt(index) - '0'];

                for (int i = 0; i < map.length(); i++) {
                        comb(str, index + 1, ans+map.charAt(i), res);
                }
        }
}
