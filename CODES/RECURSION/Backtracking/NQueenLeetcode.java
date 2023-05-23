package Backtracking;

import java.util.*;
public class NQueenLeetcode {
    public static void main(String[] args) {
        char[][] board = new char[4][4];
        List<List<String>> allBoard = new ArrayList<>();
        nQueen(board, 0, allBoard);
        System.out.println(allBoard);
    }

    public static void nQueen(char[][] board, int row, List<List<String>> allBoard){
        if(row == board.length){
            display(board, allBoard);
            return;
        }

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                nQueen(board, row + 1, allBoard);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // for vertically row
        for (int i = 0; i < row; i++) {
            if(board[i][col] == 'Q')
                return false;
        }

        // for left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i] == 'Q')
                return false;
        }

        //for right diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i] == 'Q')
                return false;
        }
        return true;
    }

    private static void display(char[][] board, List<List<String>> allBoard) {
        List<String> list = new ArrayList<>();
        String temp = "";
        for (char[] row : board) {
            temp = "";
            for (char element : row) {
                if(element == 'Q'){
                    temp += 'Q';
                }
                else{
                    temp += '.';
                }
            }
            list.add(temp);
        }
        allBoard.add(list);
    }
}
