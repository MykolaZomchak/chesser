package board;

import colors.Color;
import figures.Figure;
import move.Move;

import java.util.List;

public interface Board {

    void execute(Move move);
    Move unExecute();
    Figure figure(int x, int y);
    List<Figure> figures(Color color);

}
