package CODES.RECURSION.PERMUTATIONnCOMBINATION;

public class PermutationII {
        public static void main(String[] args) {
                perm("ljr", "");
        }
        public static void perm(String str, String ans){
                if(str.isEmpty()){
                        System.out.println(ans);
                        return;
                }

                for (int i = 0; i < str.length(); i++) {
                        String temp = str.substring(0, i) + str.substring(i + 1);
                        perm(temp, ans+str.charAt(i));
                }
        }
}
