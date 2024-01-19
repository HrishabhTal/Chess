package chess.Entities;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    
    private static final int INITIAL_LOCATION = 8;
    private static final int ADDITIONAL_MOVE = 2;

    private List<Location> possibleLocations = new ArrayList<>();

    public Pawn(Location initialPosition){
      this.position = initialPosition;
    }

    public List<Location> getPossibleMoves(){
      if(position.getYcoordinate() == INITIAL_LOCATION){
         possibleLocations.add(new Location(0,0));
         return possibleLocations; 
       }
       
      Integer currentLocation2 = position.getYcoordinate();
       
      if(currentLocation2 == ADDITIONAL_MOVE){
         possibleLocations.add(new Location(position.getXcoordinate(), position.getYcoordinate() + ADDITIONAL_MOVE));
       }
       
      possibleLocations.add(new Location(position.getXcoordinate(), position.getYcoordinate() + 1));
       
      return possibleLocations;
    
    }

}
