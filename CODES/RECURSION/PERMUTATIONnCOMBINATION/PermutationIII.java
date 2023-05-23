package CODES.RECURSION.PERMUTATIONnCOMBINATION;

public class PermutationIII {
    public static void main(String[] args) {
        permutation("ABC", "", 0);
    }

    public static void permutation(String str, String ans, int pos){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            String temp = str.substring(0, i) + str.substring(i + 1);
            permutation(temp, ans + cur, pos + 1);
        }
    }
}
