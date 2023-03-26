package sudoku.solver;

import sudoku.board.SudokuBoard;

public interface SudokuSolver {
    void solve(SudokuBoard board);

    static void fillBoard(SudokuBoard board) {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                board.set(x, y, 0);
            }
        }
    }
}
