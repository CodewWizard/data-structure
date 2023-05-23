import java.util.*;

public class PangramSentence {
    public static void main(String[] args) {
//        System.out.println(checkPangram("abcdefghijklmABCDEFGHIJKLM"));
    }

    public static boolean checkPangram  (String str) {
        // your code here
        HashSet<Character> set = new HashSet<>();
        set.add('y');
        boolean containsMyCar = set.stream().anyMatch("y"::equals);
        System.out.println(containsMyCar);

        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
                set.add(str.charAt(i));
        }
        return set.size() == 26;
    }
}
