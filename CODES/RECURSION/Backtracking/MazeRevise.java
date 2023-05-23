package Backtracking;

public class MazeRevise {
        public static void main(String[] args) {
//                System.out.println(countMaze(3, 3));
//                path(3, 3, "");

                boolean[][] maze = {{true, true, true},
                                                        {true, true, true},
                                                        {true, true, true}};
//                System.out.println("Maze with Obstacles");
//                mazeWithObstacles("", 0, 0, maze);
//                System.out.println("All paths");
//                allPaths("", 0, 0, maze);
                System.out.println(countMazePaths(0, 0, 3, 3));
        }

        public static int countMaze(int row, int col){
                if(col == 1 || row == 1){
                        return 1;
                }

                int left = countMaze(row, col - 1);
                int right = countMaze(row - 1, col);
                return left + right;
        }

        public static void path(int row, int col, String ans){
                if(row == 1 && col == 1){
                        System.out.println(ans);
                        return;
                }
                if(row > 1){
                        path(row - 1, col, ans+"D");
                }
                if(col > 1){
                        path(row, col - 1, ans+"R");
                }
        }

        public static void mazeWithObstacles(String ans, int row, int col, boolean[][] maze){
                if(row == maze.length - 1 && col == maze[0].length - 1){
                        System.out.println(ans);
                        return;
                }
                if(!maze[row][col]){
                        return;
                }

                if(row < maze.length - 1){
                        mazeWithObstacles(ans + "D", row + 1, col, maze);
                }

                if(col < maze[0].length - 1){
                        mazeWithObstacles(ans + "R", row, col + 1, maze);
                }
        }

        public static void allPaths(String ans, int row, int col, boolean[][] maze){
                if(row == maze.length - 1 && col == maze[0].length - 1){
                        System.out.println(ans);
                        return;
                }
                if(!maze[row][col]){
                        return;
                }

                // maze[row][col] = false
                maze[row][col] = !maze[row][col];

                if(row < maze.length - 1){
                        allPaths(ans + "D", row + 1, col, maze);
                }

                if(col < maze[0].length - 1){
                        allPaths(ans + "R", row, col + 1, maze);
                }

                if(row > 0){
                        allPaths(ans + "U", row - 1, col, maze);
                }

                if(col > 0){
                        allPaths(ans + "L", row, col - 1, maze);
                }
                // maze[row][col] = true
                maze[row][col] = !maze[row][col];
        }

        public static int countMazePaths(int row, int col, int n, int m){
                if(row == n || col == m){
                        return 0;
                }
                if(row == n - 1 && col == m - 1){
                        return 1;
                }

                //down
                int down = countMazePaths(row + 1, col, n, m);

                // right
                int right = countMazePaths(row, col + 1, n, m);
                return down + right;
        }
}
