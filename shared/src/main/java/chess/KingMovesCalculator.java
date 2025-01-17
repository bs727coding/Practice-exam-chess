package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KingMovesCalculator implements ChessMovesCalculator {
    @Override
    public Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition position) {
        final int r = position.getRow();
        final int c = position.getColumn();
        final ChessGame.TeamColor color = board.getPiece(position).getTeamColor();
        final ChessPosition originalPosition = new ChessPosition(r, c);
        Collection<ChessMove> moveList = new ArrayList<>();
        int i = r;
        int j = c + 1;
        if (j < 9) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }
        i = r - 1;
        if (j < 9 && i > 0) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }
        i = r + 1;
        if (j < 9 && i < 9) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }
        j = c;
        if (i < 9) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }
        i = r - 1;
        if (i > 0) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }
        j = c - 1;
        if (j > 0 && i > 0) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }
        i = r;
        if (j > 0) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }
        i = r + 1;
        if (j > 0 && i < 9) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }
        return moveList;
    }
}
