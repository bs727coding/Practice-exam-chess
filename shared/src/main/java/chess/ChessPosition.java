package chess;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPosition {
    private final int row;
    private final int col;

    public ChessPosition(int row, int col) {
        if (row < 9 && col < 9 && row > 0 && col > 0) {
            this.row = row;
            this.col = col;
        } else {
            throw new RuntimeException("Error: Invalid position");
        }
    }

    public int hashCode() {
        return row * row + col + 7 * col + row;
    }

    public String toString() {
        return "(" + row + "," + col + ")";
    }

    public boolean equals(Object otherPosition) {
        if (this == otherPosition) {
            return true;
        } else if (otherPosition == null || this.getClass() != otherPosition.getClass()) {
            return false;
        }
        ChessPosition that = (ChessPosition) otherPosition;
        return this.row == that.row && this.col == that.col;
    }

    /**
     * @return which row this position is in
     * 1 codes for the bottom row
     */
    public int getRow() {
        return row;
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    public int getColumn() {
        return col;
    }
}
