package chess.Entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    
    protected Location position;

    public abstract List<Location> getPossibleMoves();
    
}
