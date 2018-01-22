package figures;

import board.Board;
import colors.Color;
import move.Move;

import java.util.List;

public class Horse extends Figure {

    Horse(Color color, Board board, int x, int y) {
        super(color, board, x, y);
    }

    @Override
    protected void addMoves() {
        addMove(-2, -1);
        addMove(-2, 1);
        addMove(-1, -2);
        addMove(-1, 2);
        addMove(-1, -2);
        addMove(-1, 2);
        addMove(2, -1);
        addMove(2, 1);
    }

}
