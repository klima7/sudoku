package sudoku.board;

public class SudokuField {
    private int value;

    public SudokuField(int value) {
        this.value = value;
    }

    public SudokuField() {
        this(0);
    }

    public int getFieldValue() {
        return value;
    }

    public void setFieldValue(int value) {
        this.value = value;
    }
}
