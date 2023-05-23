package STRINGS;

public class FirstNLastOccurrenceOfChar {
        public static int first  = -1;
        public static int last = -1;
        public static void main(String[] args) {
                findOccurrence("aaa", 0, 'a');
        }
        public static void findOccurrence(String str, int index, int element){
                if(index == str.length()) {
                        System.out.println(first);
                        System.out.println(last);
                        return;
                }
                if(str.charAt(index) == element){
                        if(first == -1){
                                first = index;
                        }
                        else {
                                last = index;
                        }
                }
                findOccurrence(str, index + 1, element);
        }
}
