package chess;

import java.util.Collection;
import java.util.ArrayList;

public class KnightMovesCalculator implements ChessMovesCalculator {
    @Override
    public Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition position) {
        final int r = position.getRow();
        final int c = position.getColumn();
        final ChessGame.TeamColor color = board.getPiece(position).getTeamColor();
        final ChessPosition originalPosition = new ChessPosition(r, c);
        Collection<ChessMove> moveList = new ArrayList<>();
        int i = r + 1;
        int j = c + 2;
        if (i < 9 && j < 9) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }

        i = r + 2;
        j = c + 1;
        if (i < 9 && j < 9) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }

        i = r - 1;
        j = c + 2;
        if (i > 0 && j < 9) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }

        i = r - 2;
        j = c + 1;
        if (i > 0 && j < 9) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }

        i = r - 1;
        j = c - 2;
        if (i > 0 && j > 0) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }

        i = r - 2;
        j = c - 1;
        if (i > 0 && j > 0) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }

        i = r + 1;
        j = c - 2;
        if (i < 9 && j > 0) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }

        i = r + 2;
        j = c - 1;
        if (i < 9 && j > 0) {
            ChessPosition endPosition = new ChessPosition(i, j);
            if (board.getPiece(endPosition) == null ||
                    board.getPiece(endPosition).getTeamColor() != color) {
                moveList.add(new ChessMove(originalPosition, endPosition, null));
            }
        }

        return moveList;
    }
}
