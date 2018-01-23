package figures;

import board.Board;
import colors.Color;

public class King extends Figure {
    King(Color color, Board board, int x, int y) {
        super(color, board, x, y);
    }

    @Override
    protected void addMoves() {
        addMove(1);
        addMove(-1);
        addMove(0, 1);
        addMove(0, -1);
        addMove(1, 1);
        addMove(1, -1);
        addMove(-1, -1);
        addMove(-1, 1);
    }
}
