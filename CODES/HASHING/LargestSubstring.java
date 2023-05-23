import java.util.HashMap;

public class LargestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(largestSubstringWithoutRepeat(str));
    }

    private static int largestSubstringWithoutRepeat(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int len = 0;

        while (right < str.length()){
            if(map.containsKey(str.charAt(right))){
                left = Math.max(left, map.get(str.charAt(right)) + 1);
            }
            map.put(str.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}

