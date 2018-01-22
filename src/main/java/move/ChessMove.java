package move;

import figures.Figure;

public class ChessMove implements Move {

    private Figure from;
    private Figure to;

    ChessMove(Figure from, Figure to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Figure from() {
        return null;
    }

    @Override
    public Figure to() {
        return null;
    }
}
