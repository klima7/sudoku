package sudoku;

import org.junit.jupiter.api.Test;
import sudoku.board.SudokuField;
import sudoku.group.SudokuRow;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SudokuBoxTest {

    @Test
    public void testVerifyReturnsTrueForValidBox() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        SudokuField[] fields = new SudokuField[9];
        for(int i=0; i<9; i++) {
            fields[i] = new SudokuField(values[i]);
        }

        SudokuRow box = new SudokuRow(fields);
        assertTrue(box.verify());
    }

    @Test
    public void testVerifyReturnsFalseForInvalidBox() {
        int[] values = {1, 2, 2, 4, 5, 6, 7, 8, 9};

        SudokuField[] fields = new SudokuField[9];
        for(int i=0; i<9; i++) {
            fields[i] = new SudokuField(values[i]);
        }

        SudokuRow box = new SudokuRow(fields);
        assertFalse(box.verify());
    }
}
