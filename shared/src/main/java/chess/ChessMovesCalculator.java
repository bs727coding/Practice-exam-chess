package chess;

import java.util.Collection;

public interface ChessMovesCalculator {
    Collection<ChessMove> movesCalculator(ChessBoard board, ChessPosition position);
}
