package chess;

/**
 * Represents moving a chess piece on a chessboard
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessMove {

    private final ChessPosition startPosition;
    private final ChessPosition endPosition;
    private final ChessPiece.PieceType promotionPiece;

    public ChessMove(ChessPosition startPosition, ChessPosition endPosition,
                     ChessPiece.PieceType promotionPiece) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.promotionPiece = promotionPiece;
    }

    public boolean equals(Object thatMove) {
        if (this == thatMove) {
            return true;
        } else if (thatMove == null || this.getClass() != thatMove.getClass()) {
            return false;
        }
        ChessMove that = (ChessMove) thatMove;
        if (that.promotionPiece == null) {
            if (this.promotionPiece != null) {
                return false;
            }
        }
        if (this.promotionPiece == null) {
            if (that.promotionPiece != null) {
                return false;
            }
        }
        if (that.promotionPiece == null) {
            return this.startPosition.equals(that.startPosition) && this.endPosition.equals(that.endPosition);
        } else {
            return this.startPosition.equals(that.startPosition) && this.endPosition.equals(that.endPosition)
                    && this.promotionPiece.equals(that.promotionPiece);
        }
    }

    public String toString() {
        if (promotionPiece == null) {
            return startPosition.toString() + ", " + endPosition.toString();
        } else {
            return startPosition.toString() + ", " + endPosition.toString() +
                    ". Promotion piece = " + promotionPiece.toString();
        }
    }

    public int hashCode() {
        if (promotionPiece == null) {
            return startPosition.hashCode() * 3 + 4 * endPosition.hashCode();
        } else {
            return startPosition.hashCode() * 3 + 4 * endPosition.hashCode() + promotionPiece.hashCode();
        }
    }

    /**
     * @return ChessPosition of starting location
     */
    public ChessPosition getStartPosition() {
        return startPosition;
    }

    /**
     * @return ChessPosition of ending location
     */
    public ChessPosition getEndPosition() {
        return endPosition;
    }

    /**
     * Gets the type of piece to promote a pawn to if pawn promotion is part of this
     * chess move
     *
     * @return Type of piece to promote a pawn to, or null if no promotion
     */
    public ChessPiece.PieceType getPromotionPiece() {
        return promotionPiece;
    }
}
