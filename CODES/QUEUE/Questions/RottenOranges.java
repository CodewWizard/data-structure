package CODES.QUEUE.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        int[][] arr = {{2, 1, 1},
                        {1, 1, 0},
                        {0, 1, 1}};
        System.out.println(rotten(arr));
    }

    public static int rotten(int[][] grid){
        //if grid is empty
        if(grid == null || grid.length == 0){
            return 0;
        }


        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> que = new LinkedList<>();
        int count_fresh = 0;

        //put the all rotten oranges in queue
        //count all the fresh oranges

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                //put the rotten ones
                if(grid[i][j] == 2){
                    que.offer(new int[]{i, j});
                }

                //count fresh oranges
                if(grid[i][j] != 0){
                    count_fresh++;
                }
            }
        }

        //if no fresh oranges in grid return 0
        if(count_fresh == 0){
            return 0;
        }


        int min = 0;
        int cnt = 0;
        //to move right left down up
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        //start from initially rotten oranges
        while (!que.isEmpty()){
            int size = que.size();
            cnt += size;

            for (int i = 0; i < size; i++) {
                int[] temp = que.poll();
                for (int j = 0; j < 4; j++) {

                    int x = temp[0] + dx[j];
                    int y = temp[1] + dy[j];

                    if(x < 0 || y < 0 || x >= rows || y>= cols || grid[x][y] == 0 || grid[x][y] == 2) continue;

                    grid[x][y] = 2;
                    que.offer(new int[]{x, y});
                }
            }

            if(que.size() != 0){
                min++;
            }
        }
        return count_fresh == cnt ? min : -1;
    }
}
