package OTHERS;

public class PlaceTiles {
    public static void main(String[] args) {
        System.out.println(countWaysToPlaceTiles(2, 3));
    }

    public static int countWaysToPlaceTiles(int n, int m){
        if(n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }

        // vertically place the tile
        int vertical = countWaysToPlaceTiles(n - m, m);

        // horizontally place the tile
        int horizontal = countWaysToPlaceTiles(n - 1, m);

        return vertical + horizontal;
    }
}
