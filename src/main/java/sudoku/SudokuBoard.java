package sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SudokuBoard {
    private int[][] board;

    public SudokuBoard() {
        board = new int[9][9];
    }

    public void set(int x, int y, int input) {
        board[x][y] = input;
    }

    public int get(int x, int y) {
        return board[x][y];
    }

    public void solveGame() {
        SudokuSolver sudokucheck = new SudokuSolver();
        sudokucheck.fillBoard(board);
    }

    void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (i == 2 || i == 5) {
                System.out.println("---------------------");
            }
        }
        System.out.println();
    }
}
