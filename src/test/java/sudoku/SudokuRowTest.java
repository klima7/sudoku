package sudoku;

import org.junit.jupiter.api.Test;
import sudoku.board.SudokuField;
import sudoku.group.SudokuRow;

import static org.junit.jupiter.api.Assertions.*;
class SudokuRowTest {

    @Test
    public void testVerifyReturnsTrueForValidRow() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        SudokuField[] fields = new SudokuField[9];
        for(int i=0; i<9; i++) {
            fields[i] = new SudokuField(values[i]);
        }

        SudokuRow row = new SudokuRow(fields);
        assertTrue(row.verify());
    }

    @Test
    public void testVerifyReturnsFalseForInvalidRow() {
        int[] values = {1, 2, 2, 4, 5, 6, 7, 8, 9};

        SudokuField[] fields = new SudokuField[9];
        for(int i=0; i<9; i++) {
            fields[i] = new SudokuField(values[i]);
        }

        SudokuRow row = new SudokuRow(fields);
        assertFalse(row.verify());
    }
}
