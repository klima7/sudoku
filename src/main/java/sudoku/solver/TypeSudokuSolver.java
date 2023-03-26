package sudoku.solver;

import sudoku.board.SudokuBoard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TypeSudokuSolver implements SudokuSolver {

    @Override
    public void solve(SudokuBoard board) {
        clearBoard(board);
        backtrack(0, 0,board);
    }

    private void clearBoard(SudokuBoard board) {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                board.set(x, y, 0);
            }
        }
    }

    private boolean backtrack(int y, int x, SudokuBoard board) {
        if (y == 9) return true;

        int nextRow = x == 8 ? y + 1 : y;
        int nextCol = x == 8 ? 0 : x + 1;

        if (board.get(x, y) != 0) {
            return backtrack(nextRow, nextCol, board);
        }

        List<Integer> candidates = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.shuffle(candidates);
        for (int candidate : candidates) {
            if (isValidMove(y, x, candidate, board)) {
                board.set(x, y, candidate);
                if (backtrack(nextRow, nextCol, board)) {
                    return true;
                }
                board.set(x, y, 0);
            }
        }

        return false;
    }

    private boolean isValidMove(int y, int x, int num, SudokuBoard board) {
        SudokuBoard copy = SudokuBoard.copyBoard(board);
        copy.set(x, y, num);
        return copy.checkBoard();
    }

}
