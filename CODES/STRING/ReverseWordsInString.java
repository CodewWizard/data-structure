public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverse("Madiha Mujawar"));
    }

    public static String reverse(String s){
        int lastSpaceIndex = -1;
        char[] ch = s.toCharArray();

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || ch[i] == ' ') {
                int startIndex = lastSpaceIndex + 1;
                int endIndex = i - 1;
                while (startIndex < endIndex) {
                    char temp1 = ch[startIndex];
                    ch[startIndex] = ch[endIndex];
                    ch[endIndex] = temp1;
                    startIndex++;
                    endIndex--;
                }
                lastSpaceIndex = i;
            }
        }
        return new String(ch);
    }
}
