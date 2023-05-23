package CODES.RECURSION.STRINGS;

import java.util.*;

public class PalindromePartitioning {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        palindromePartitioning(0, "aabb", new ArrayList<>(), ans);
        for (ArrayList<String> list: ans) {
            System.out.println(list);
        }
    }

    public static void palindromePartitioning(int index, String s, ArrayList<String> path, ArrayList<ArrayList<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i + 1));
                palindromePartitioning(i + 1, s, path, ans);
                path.remove(path.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
