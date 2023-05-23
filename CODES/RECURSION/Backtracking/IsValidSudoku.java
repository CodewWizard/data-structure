package Backtracking;

public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                    {'5','3','.','.','7','.','.','.','.'},
                    {'6','.','.','1','9','5','.','.','.'},
                    {'.','9','8','.','.','.','.','6','.'},
                    {'8','.','.','.','6','.','.','.','3'},
                    {'4','.','.','8','.','3','.','.','1'},
                    {'7','.','.','.','2','.','.','.','6'},
                    {'.','6','.','.','.','.','2','8','.'},
                    {'.','.','.','4','1','9','.','.','5'},
                    {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] board) {
        int[][] newBoard = new int[board.length][board.length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.'){
                    newBoard[i][j] = board[i][j] - '0';
                }
            }
        }

        for(int i = 0; i < newBoard.length; i++){
            for(int j = 0; j < newBoard.length; j++){
                if(newBoard[i][j] != 0){
                    if(!isSafe(newBoard, i, j, newBoard[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean isSafe(int[][] board, int row, int col, int num){
        // check the row
        for (int i = 0; i < board.length; i++) {
            //check if the number is in the row
            if(i != col){
                if(board[row][i] == num){
                    return false;
                }
            }
        }

        //check the column
        for (int i = 0; i < board.length; i++) {
            if(i != row){
                if(board[i][col] == num){
                    return false;
                }
            }
        }

        int sqrt  = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if(r != row && c != col){
                    if(board[r][c] == num){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
