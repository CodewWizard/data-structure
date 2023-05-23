package STRINGS;

import java.util.Arrays;

public class RemoveDuplicates {
        public static void main(String[] args) {
                boolean[] map = new boolean[26];
                removeDuplicate("zvvo", 0, "", map);
        }

        public static void removeDuplicate(String str, int index, String ans, boolean[] map){
                if(index == str.length()){
                        System.out.println(ans);
                        return;
                }
                        if(map[str.charAt(index) - 'a']){
                                removeDuplicate(str, index + 1, ans, map);
                        }
                        else{
                                ans += str.charAt(index);
                                map[str.charAt(index) - 'a'] = true;
                                removeDuplicate(str, index + 1, ans, map);
                        }
        }
}
