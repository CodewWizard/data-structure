package CODES.RECURSION.PERMUTATIONnCOMBINATION;

import java.util.*;

public class PermutationRevision {
        public static void main(String[] args) {
                permutation("", "abc");
                System.out.println(permutationList("", "abc"));

                List<String> ans = permutationList("", "abb");
                Collections.sort(ans);
                System.out.println(ans);
                System.out.println(permutationsCount("", "abcd"));
        }

        public static void permutation(String ans, String str){
                if(str.isEmpty()){
                        System.out.println(ans );
                        return;
                }

                for (int i = 0; i <= ans.length(); i++) {
                        String first = ans.substring(0, i);
                        String second = ans.substring(i, ans.length());

                        permutation(first + str.charAt(0) + second, str.substring(1));
                }
        }

        public static List<String> permutationList(String ans, String str) {
                if (str.isEmpty()) {
                        List<String> list = new ArrayList<>();
                        list.add(ans);
                        return list;
                }

                List<String> res = new ArrayList<>();

                for (int i = 0; i <= ans.length(); i++) {
                        String second = ans.substring(0, i);
                        String first = ans.substring(i, ans.length());

                        res.addAll(permutationList(first + str.charAt(0) + second, str.substring(1)));
                }
                return res;
        }
        public static int permutationsCount(String ans, String str){
                if(str.isEmpty()){
                        return 1;
                }
                int count = 0;
                for (int i = 0; i <= ans.length(); i++) {
                        String first = ans.substring(0, i);
                        String second = ans.substring(i, ans.length());

                        count += permutationsCount(first + str.charAt(0) + second, str.substring(1));
                }
                return count;
        }
}
