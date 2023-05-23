package CODES.RECURSION.SUBSET;

import java.util.HashSet;

public class SubSeqII {
        public static int count = 0;
        public static void main(String[] args) {
                subSeq("abc", 0, "");

                HashSet<String> set = new HashSet<>();
                count = 0;
                subSeqUnique("aaa", 0, "", set);
        }
        public static void subSeq(String str, int index, String ans){
                if(index == str.length()){
                        System.out.println(ans);
                        return;
                }

                //ignoring
                subSeq(str, index + 1, ans);

                //taking
                subSeq(str, index + 1, ans + str.charAt(index));
        }
        public static void subSeqUnique(String str, int index, String ans, HashSet<String> set){
                if(index == str.length()){
                        if(set.contains(ans)){
                                return;
                        }
                        else{
                                System.out.println(ans);
                                set.add(ans);
                                count++;
                                System.out.println(count);
                                return;
                        }
                }

                //ignoring
                subSeqUnique(str, index + 1, ans, set);

                //taking
                subSeqUnique(str, index + 1, ans + str.charAt(index), set);
        }

}
