public class ReverseAString {
    public static void main(String[] args) {
        char s[] = {'M', 'A', 'D'};
        System.out.println(reverse(s));
    }

    public static char[] reverse(char[] s){
        int start = 0;
        int end = s.length - 1;

        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;
    }
}
