import java.util.HashSet;

public class DistinctCharEqual {
}
//    public static void main(String[] args) {
//        System.out.println(isItPossible("abcc", "aab"));
//    }

//    public static boolean isItPossible(String a, String b){
//
//        HashSet<Character> set1 = new HashSet<>();
//        HashSet<Character> set2 = new HashSet<>();
//
//        char[] temp = new char[a.length()];
//        temp = a.toCharArray();
//
//        char[] temp1 = new char[b.length()];
//        temp1 = b.toCharArray();
//
//
//        for (int i = 0; i < temp.length; i++) {
//            if(temp[i] == temp[i + 1]){
//                char e = temp[i];
//                temp[i] = temp1[i];
//                temp1[i] = e;
//            }
//        }
//
//        for (int i = 0; i < a.length(); i++) {
//            set1.add(a.charAt(i));
//        }
//        for (int i = 0; i < b.length(); i++) {
//            set2.add(b.charAt(i));
//        }
//
//        for (char d: set1) {
//            if(set1.contains(d) == set2.contains(d));
//        }
//    }

