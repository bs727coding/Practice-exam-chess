package chess;

import java.util.Collection;
import java.util.ArrayList;

public class PawnMovesCalculator implements ChessMovesCalculator {
    @Override
    public Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition position) {
        final int r = position.getRow();
        final int c = position.getColumn();
        final ChessGame.TeamColor color = board.getPiece(position).getTeamColor();
        final ChessPosition originalPosition = new ChessPosition(r, c);
        Collection<ChessMove> moveList = new ArrayList<>();
        int i = r;
        int j = c;
        if (color == ChessGame.TeamColor.BLACK) {
            i = r - 1;
            ChessPosition newPosition1 = new ChessPosition(i, j);
            if (r == 7 && board.getPiece(newPosition1) == null) {
                ChessPosition newPosition2 = new ChessPosition(i - 1, j);
                if (board.getPiece(newPosition2) == null) {
                    moveList.add(new ChessMove(originalPosition, newPosition2, null));
                }
            }
            if (board.getPiece(newPosition1) == null) {
                if (r == 2) {
                    moveList.add(new ChessMove(originalPosition, newPosition1, ChessPiece.PieceType.QUEEN));
                    moveList.add(new ChessMove(originalPosition, newPosition1, ChessPiece.PieceType.ROOK));
                    moveList.add(new ChessMove(originalPosition, newPosition1, ChessPiece.PieceType.KNIGHT));
                    moveList.add(new ChessMove(originalPosition, newPosition1, ChessPiece.PieceType.BISHOP));
                } else {
                    moveList.add(new ChessMove(originalPosition, newPosition1, null));
                }
            }
            j = c - 1;
            if (j > 0) {
                ChessPosition newPosition = new ChessPosition(i, j);
                if (board.getPiece(newPosition) != null && board.getPiece(newPosition).getTeamColor() != color) {
                    if (r == 2) {
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moveList.add(new ChessMove(originalPosition, newPosition, null));
                    }
                }
            }
            j = c + 1;
            if (j < 9) {
                ChessPosition newPosition = new ChessPosition(i, j);
                if (board.getPiece(newPosition) != null && board.getPiece(newPosition).getTeamColor() != color) {
                    if (r == 2) {
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moveList.add(new ChessMove(originalPosition, newPosition, null));
                    }
                }
            }
        } else {
            i = r + 1;
            ChessPosition newPosition1 = new ChessPosition(i, j);
            if (r == 2 && board.getPiece(newPosition1) == null) {
                ChessPosition newPosition2 = new ChessPosition(i + 1, j);
                if (board.getPiece(newPosition2) == null) {
                    moveList.add(new ChessMove(originalPosition, newPosition2, null));
                }
            }
            if (board.getPiece(newPosition1) == null) {
                if (r == 7) {
                    moveList.add(new ChessMove(originalPosition, newPosition1, ChessPiece.PieceType.QUEEN));
                    moveList.add(new ChessMove(originalPosition, newPosition1, ChessPiece.PieceType.ROOK));
                    moveList.add(new ChessMove(originalPosition, newPosition1, ChessPiece.PieceType.KNIGHT));
                    moveList.add(new ChessMove(originalPosition, newPosition1, ChessPiece.PieceType.BISHOP));
                } else {
                    moveList.add(new ChessMove(originalPosition, newPosition1, null));
                }
            }
            j = c - 1;
            if (j > 0) {
                ChessPosition newPosition = new ChessPosition(i, j);
                if (board.getPiece(newPosition) != null && board.getPiece(newPosition).getTeamColor() != color) {
                    if (r == 7) {
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moveList.add(new ChessMove(originalPosition, newPosition, null));
                    }
                }
            }
            j = c + 1;
            if (j < 9) {
                ChessPosition newPosition = new ChessPosition(i, j);
                if (board.getPiece(newPosition) != null && board.getPiece(newPosition).getTeamColor() != color) {
                    if (r == 7) {
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.QUEEN));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.ROOK));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.KNIGHT));
                        moveList.add(new ChessMove(originalPosition, newPosition, ChessPiece.PieceType.BISHOP));
                    } else {
                        moveList.add(new ChessMove(originalPosition, newPosition, null));
                    }
                }
            }
        }
        return moveList;
    }
}
