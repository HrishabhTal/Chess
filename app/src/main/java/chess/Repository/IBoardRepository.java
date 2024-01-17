package chess.Repository;

import chess.Entities.Location;
import chess.Entities.Position;

public interface IBoardRepository {
    public String startGame();
    public String movePiece(String piecename, Location position1, Location position2);
    
}
