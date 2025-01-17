package chess;

import java.util.Collection;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {

    private ChessGame.TeamColor color;
    private ChessPiece.PieceType type;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        color = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    public boolean equals(Object otherPiece) {
        if (this == otherPiece) {
            return true;
        } else if (otherPiece == null || this.getClass() != otherPiece.getClass()) {
            return false;
        }
        ChessPiece that = (ChessPiece) otherPiece;
        return this.color == that.color && this.type == that.type;
    }

    public int hashCode() {
        if (color == ChessGame.TeamColor.WHITE) {
            return switch (type) {
                case BISHOP -> 453;
                case KNIGHT -> 43532;
                case KING -> 85934;
                case QUEEN -> 93054;
                case PAWN -> 25424;
                case ROOK -> 5432;
            };
        } else {
            return switch (type) {
                case BISHOP -> 25345;
                case KNIGHT -> 949594;
                case KING -> 2454;
                case QUEEN -> 52390;
                case PAWN -> 545781;
                case ROOK -> 96930;
            };
        }
    }

    public String toString() {
        if (color == ChessGame.TeamColor.WHITE) {
            return switch (type) {
                case BISHOP -> "B";
                case KNIGHT -> "N";
                case KING -> "K";
                case QUEEN -> "Q";
                case PAWN -> "P";
                case ROOK -> "R";
            };
        } else {
            return switch (type) {
                case BISHOP -> "b";
                case KNIGHT -> "n";
                case KING -> "k";
                case QUEEN -> "q";
                case PAWN -> "p";
                case ROOK -> "r";
            };
        }
    }
    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return color;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    public void setPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.type = type;
        this.color = pieceColor;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        return switch (type) {
            case KING -> {
                KingMovesCalculator calculator = new KingMovesCalculator();
                yield calculator.movesCalculator(board, myPosition);
            }
            case QUEEN -> {
                QueenMovesCalculator calculator = new QueenMovesCalculator();
                yield calculator.movesCalculator(board, myPosition);
            }
            case PAWN -> {
                PawnMovesCalculator calculator = new PawnMovesCalculator();
                yield calculator.movesCalculator(board, myPosition);
            }
            case ROOK -> {
                RookMovesCalculator calculator = new RookMovesCalculator();
                yield calculator.movesCalculator(board, myPosition);
            }
            case BISHOP -> {
                BishopMovesCalculator calculator = new BishopMovesCalculator();
                yield calculator.movesCalculator(board, myPosition);
            }
            case KNIGHT -> {
                KnightMovesCalculator calculator = new KnightMovesCalculator();
                yield calculator.movesCalculator(board, myPosition);
            }
        };
    }
}
