package CODES.CONTEST.Weekly331;

import java.util.*;

public class CountVowel {
    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0, 2}, {1, 4}, {1, 1}};
        int[] ans = vowelStrings(words, queries);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            ans.add(find(queries[i][0], queries[i][1], words, set));
        }

        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public static int find(int start, int end, String[] words, HashSet<Character> set){
        int tmp = 0;
        for (int i = start; i <= end; i++) {
            String temp = words[i];
            if(set.contains(temp.charAt(0)) && set.contains(temp.charAt(temp.length() - 1))){
                tmp++;
            }
        }
        return tmp;
    }
}
