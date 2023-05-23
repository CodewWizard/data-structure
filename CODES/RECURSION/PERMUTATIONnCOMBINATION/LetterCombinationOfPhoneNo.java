package PERMUTATIONnCOMBINATION;


import java.util.*;

public class LetterCombinationOfPhoneNo {
        public static void main(String[] args) {
                phonePad("", "67");
                System.out.println(phonePadReturn("", "12"));
        }


        //this code by kunal kushwaha
        public static void phonePad(String ans, String str){
                if(str.isEmpty()){
                        System.out.println(ans);
                        return;
                }

                int digit = str.charAt(0) - '0';
                        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                                char ch = (char) ('a'+ i);
                                phonePad(ans  + ch, str.substring(1));
                }
        }

        public static ArrayList<String> phonePadReturn(String ans, String str){
                if(str.isEmpty()){
                        ArrayList<String> list = new ArrayList<>();
                        list.add(ans);
                        return list;
                }

                ArrayList<String> list = new ArrayList<>();

                int digit = str.charAt(0) - '0';
                for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                        char ch = (char) ('a'+ i);
                        list.addAll(phonePadReturn(ans  + ch, str.substring(1)));
                }
                return list;
        }
}
