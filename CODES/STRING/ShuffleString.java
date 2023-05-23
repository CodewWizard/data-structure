package STRING;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        char[] temp = new char[s.length()];

        for(int i = 0; i < indices.length; i++){
            temp[indices[i]] = ch[i];
        }

        return new String(temp);
    }
}
