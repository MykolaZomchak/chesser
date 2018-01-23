package figures;

import board.Board;
import colors.Color;

public class Pawn extends Figure {
    Pawn(Color color, Board board, int x, int y) {
        super(color, board, x, y);
    }

    @Override
    protected void addMoves() {
        addMove(1);
        if(!hasMoved())
            addMove(2);
        if(figure(1, -1).isEnemy(this))
            addMove(1, -1);
        if(figure(1, 1).isEnemy(this))
            addMove(1, 1);
    }

    private boolean hasMoved(){
        return getY() == (color().equals(Color.WHITE) ? 1 : 6);
    }
}
