package figures;

import board.Board;
import colors.Color;

public class Rook extends Figure {
    Rook(Color color, Board board, int x, int y) {
        super(color, board, x, y);
    }

    @Override
    protected void addMoves() {
        int d = 1;
        do addMove(d); while (figure(d++).isFree());

        d = 1;
        do addMove(-d); while (figure(-d++).isFree());

        d = 1;
        do addMove(0, -d); while (figure(0, -d++).isFree());

        d = 1;
        do addMove(0, d); while (figure(0, d++).isFree());

    }
}
