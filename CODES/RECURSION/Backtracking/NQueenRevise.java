package Backtracking;

import java.util.*;
public class NQueenRevise {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(nQueen(board, 0));
    }

    public static int nQueen(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += nQueen(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // for vertically row
        for (int i = 0; i < row; i++) {
            if(board[i][col])
                return false;
        }

        // for left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i])
                return false;
        }

        //for right diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i])
                return false;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print ("X ");
                }
            }
            System.out.println();
        }
    }
}
