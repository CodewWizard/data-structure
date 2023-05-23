package ARRAY;

import java.util.*;
public class Anagram {
        public static void main(String[] args) {
                isAnagram("aabaa", "baaaaa");
        }

        public static boolean isAnagram(String a,String b)
        {

                // Your code here
                HashMap<Character, Integer> map1 = new HashMap<>();
                HashMap<Character, Integer> map2 = new HashMap<>();

                for(int i = 0; i < a.length(); i++){
                        if(!map1.isEmpty() && map1.containsKey(a.charAt(i))){
                                map1.put(a.charAt(i), map1.get(i) + 1);
                        }
                        else{
                                map1.put(a.charAt(i), 1);
                        }
                }

                for(int i = 0; i < b.length(); i++){
                        if(!map2.isEmpty() && map2.containsKey(a.charAt(i))){
                                map2.put(a.charAt(i), map2.get(i) + 1);
                        }
                        else{
                                map2.put(a.charAt(i), 1);
                        }
                }

                System.out.println(map1);
                System.out.println(map2);

                return true;
        }
}
