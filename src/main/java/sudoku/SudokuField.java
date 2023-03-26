package sudoku;

public class SudokuField {
    private int value;

    public SudokuField(int value) {
        this.assertValidValue(value);
        this.value = value;
    }

    public int getFieldValue() {
        return value;
    }

    public void setFieldValue(int value) {
        this.assertValidValue(value);
        this.value = value;
    }

    private void assertValidValue(int value) {
        if(value < 0 || value > 9) {
            throw new IllegalArgumentException("Field value must be in range 0-9");
        }
    }
}
