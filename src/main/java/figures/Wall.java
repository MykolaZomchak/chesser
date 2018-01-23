package figures;

import colors.Color;

public class Wall extends Figure {
    Wall() {
        super(null, null, 0, 0);
    }

    @Override
    protected void addMoves() {}

    @Override
    protected boolean isAvailable(Color color) {
        return false;
    }

    @Override
    protected boolean isFree() {
        return false;
    }

    @Override
    protected boolean isEnemy(Figure figure) {
        return false;
    }
}
