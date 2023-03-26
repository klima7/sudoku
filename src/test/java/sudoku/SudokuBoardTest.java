package sudoku;

import org.junit.jupiter.api.Test;
import sudoku.board.SudokuBoard;

import static org.junit.jupiter.api.Assertions.*;
class SudokuBoardTest {

    @Test
    public void testTwoSudokuAreSolvedInDifferentWay() {
        SudokuBoard sudoku1 = new SudokuBoard();
        SudokuBoard sudoku2 = new SudokuBoard();

        sudoku1.solveGame();
        sudoku2.solveGame();

        int equalsCount = 0;
        for(int x=0;x<9;x++) {
            for(int y=0;y<9;y++) {
                if(sudoku1.get(x,y) == sudoku2.get(x,y)) {
                    equalsCount++;
                }
            }
        }
        assertNotEquals(equalsCount, 81, "The 2 sudokus are the same");
    }
}
