package sudoku.group;

import sudoku.board.SudokuField;

public abstract class SudokuGroup {
    private final SudokuField[] fields;

    public SudokuGroup(SudokuField[] fields) {
        this.fields = fields;
    }

    public boolean verify() {
        int[] counters = new int[10];
        for (SudokuField field : fields) {
            int value = field.getFieldValue();
            counters[value]++;
            if(value != 0 && counters[value] > 1)
                return false;
        }
        return true;
    }
}
