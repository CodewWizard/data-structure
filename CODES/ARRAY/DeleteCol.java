package ARRAY;

public class DeleteCol {
    public static void main(String[] args) {
        String[] strs = {"abc", "bce", "cae"};
        int K = strs[0].length();

        // Variable to store the count of columns to be deleted.
        int answer = 0;
        // Iterate over each index in the string.
        for (int col = 0; col < K; col++) {
            // Iterate over the strings.
            for (int row = 1; row < strs.length; row++) {
                // Characters should be in increasing order,
                // If not, increment the counter.
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}