package figures;

import board.Board;
import colors.Color;
import move.Move;

import java.util.ArrayList;
import java.util.List;

import static move.MovesFactory.createMove;

public abstract class Figure {

    private Color color;
    private Board board;
    private int x;
    private int y;

    private List<Move> moves;

    Figure(Color color, Board board, int x, int y) {

        this.color = color;
        this.board = board;
        this.x = x;
        this.y = y;
    }

    public List<Move> moves(){
        moves = new ArrayList<>(8);
        addMoves();
        return moves;
    }

    protected abstract void addMoves();

    protected void addMove(int y, int x){
        if(figure(y, x).isAvailable(color()))
            moves.add(createMove(this, figure(y, x)));
    }

    protected void addMove(int y){
        addMove(y, 0);
    }

    protected boolean isAvailable(Color color){ // TODO overwrite in Block, NullFigure
        return !color().equals(color);
    }

    protected boolean isFree(){
        return false;
    }

    protected Figure figure(int y, int x){
        return board().figure(getX() + (color.equals(Color.WHITE) ? x : -x), getY() + (color.equals(Color.WHITE) ? y : -y));
    }

    protected Figure figure(int y){
        return figure(y, 0);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    protected Board board(){
        return board;
    }

    protected Color color(){
        return color;
    }

}
