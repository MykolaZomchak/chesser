package figures;

import board.Board;
import colors.Color;

public class Queen extends Figure {

    public Queen(Color color, Board board, int x, int y) {
        super(color, board, x, y);
    }

    private Figure bishop = new Bishop(color(), board(), getX(), getY());
    private Figure rook = new Rook(color(), board(), getX(), getY());

    protected void addMoves(){
        bishop.addMoves();
        rook.addMoves();
    }

}
