import java.util.Arrays;

public class IncrementSubMatrices {
        public static void main(String[] args) {
                int[][] query = {{1, 1, 2, 2}, {0, 0, 1, 1}};
                int[][] que = {{0, 0, 1, 1}};
                System.out.println(query.length);
                System.out.println(query[0].length);
                int[][] ans = rangeAddQueries(3, query);
                for (int[] arr : ans) {
                        System.out.println(Arrays.toString(arr));
                }
        }

        public static  int[][] rangeAddQueries(int n, int[][] queries){
                int[][] mat = new int[n][n];
                for (int[] query : queries) {
                        int row1 = query[0], col1 = query[1], row2 = query[2], col2 = query[3];
                        for (int i = row1; i <= row2; i++) {
                                for (int j = col1; j <= col2; j++) {
                                        mat[i][j]++;
                                }
                        }
                }
                return mat;
        }
}
