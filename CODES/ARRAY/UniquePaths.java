public class UniquePaths {
    public static void main(String[] args) {

        // n and m are no of rows and cols in grid (matrix)
        System.out.println(path(3, 3));

        //i and j are starting point of grid
        System.out.println(path2(0, 0, 3, 3));
    }

    //Combination Solution
    static int path(int n, int m){
            int temp = n + m - 2;
            int temp2 = m - 1;
            double res = 1;

            for(int i = 1; i <= temp2; i++){
                res = res * (temp - temp2 + i) / i;
            }
            return (int)res;
    }

    //Recursive Solution
    static int path2(int i, int j, int n, int m){
        if(i == (n - 1) && j == (m - 1)){
            return 1;
        }

        if(i >= n || j >= m){
            return 0;
        }
        return path2(i + 1, j, n, m) + path2(i, j + 1, n, m);
    }
}
