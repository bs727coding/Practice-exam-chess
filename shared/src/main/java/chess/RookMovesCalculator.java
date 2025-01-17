package chess;

import java.util.Collection;
import java.util.ArrayList;

public class RookMovesCalculator implements ChessMovesCalculator {
    @Override
    public Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition position) {
        final int r = position.getRow();
        final int c = position.getColumn();
        final ChessGame.TeamColor color = board.getPiece(position).getTeamColor();
        final ChessPosition originalPosition = new ChessPosition(r, c);
        Collection<ChessMove> moveList = new ArrayList<>();
        int i = r;
        int j;
        for (j = c + 1; j < 9; j++) {
            ChessPosition newPosition = new ChessPosition(i, j);
            if (board.getPiece(newPosition) == null) {
                moveList.add(new ChessMove(originalPosition, newPosition, null));
            } else if (color == board.getPiece(newPosition).getTeamColor()) {
                break;
            } else {
                moveList.add(new ChessMove(originalPosition, newPosition, null));
                break;
            }
        }
        for (j = c - 1; j > 0; j--) {
            ChessPosition newPosition = new ChessPosition(i, j);
            if (board.getPiece(newPosition) == null) {
                moveList.add(new ChessMove(originalPosition, newPosition, null));
            } else if (color == board.getPiece(newPosition).getTeamColor()) {
                break;
            } else {
                moveList.add(new ChessMove(originalPosition, newPosition, null));
                break;
            }
        }
        j = c;
        for (i = r - 1; i > 0; i--) {
            ChessPosition newPosition = new ChessPosition(i, j);
            if (board.getPiece(newPosition) == null) {
                moveList.add(new ChessMove(originalPosition, newPosition, null));
            } else if (color == board.getPiece(newPosition).getTeamColor()) {
                break;
            } else {
                moveList.add(new ChessMove(originalPosition, newPosition, null));
                break;
            }
        }
        for (i = r + 1; i < 9; i++) {
            ChessPosition newPosition = new ChessPosition(i, j);
            if (board.getPiece(newPosition) == null) {
                moveList.add(new ChessMove(originalPosition, newPosition, null));
            } else if (color == board.getPiece(newPosition).getTeamColor()) {
                break;
            } else {
                moveList.add(new ChessMove(originalPosition, newPosition, null));
                break;
            }
        }
        return moveList;
    }
}
