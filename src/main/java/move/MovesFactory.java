package move;

import figures.Figure;

public class MovesFactory {

    public static Move createMove(Figure from, Figure to){
        return new ChessMove(from, to);
    }

}
