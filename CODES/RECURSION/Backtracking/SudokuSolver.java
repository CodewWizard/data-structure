package CODES.RECURSION.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

//        System.out.println(sudokuSolver(board));
        if(sudokuSolver(board)){
            displayBoard(board);
        }else{
            System.out.println("Cannot solve");
        }
    }

    public static boolean sudokuSolver(int[][] board){
        int row = -1;
        int col = -1;

        boolean emptyCellsLeft = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyCellsLeft = false;
                    break;
                }
            }
            //if you found some empty element in row, then break
            if(!emptyCellsLeft){
                break;
            }
        }

        if (emptyCellsLeft){
            return true;
            // sudoku is solved
        }

        // backtrack
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(sudokuSolver(board)){
                    //found the ans
                    return true;
                }
                else{
                    //backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int num){
        // check the row
        for (int i = 0; i < board.length; i++) {
            //check if the number is in the row
            if(board[row][i] == num){
                return false;
            }
        }

        //check the column
        for (int[] tempRow : board) {
            //check if the number is in the col
            if(tempRow[col] == num){
                return false;
            }
        }

        int sqrt  = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static void displayBoard(int[][] board){
        for (int[] row : board) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
