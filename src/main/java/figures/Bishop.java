package figures;

import board.Board;
import colors.Color;

public class Bishop extends Figure {
    Bishop(Color color, Board board, int x, int y) {
        super(color, board, x, y);
    }

    @Override
    protected void addMoves() {
        int d = 1;
        do addMove(d, d); while(figure(d, d++).isFree());

        d = 1;
        do addMove(d, -d); while(figure(d, -d++).isFree());

        d = 1;
        do addMove(-d, d); while(figure(-d, d++).isFree());

        d = 1;
        do addMove(-d, -d); while(figure(-d, -d++).isFree());
    }
}
