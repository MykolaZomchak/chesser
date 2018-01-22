package figures;

import colors.Color;

public class NullFigure extends Figure {
    NullFigure() {
        super(null, null, 0, 0);
    }

    @Override
    protected void addMoves() {}

    @Override
    protected boolean isAvailable(Color color) {
        return true;
    }

    @Override
    protected boolean isFree() {
        return true;
    }
}
