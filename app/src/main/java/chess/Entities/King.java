package chess.Entities;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

   private final int MIN_POSITION = 1;
   private final int MAX_POSITION = 8;
   private List<Location> possibleLocations = new ArrayList<>();

   public King(Location initialPosition){
      this.position = initialPosition;
    }

    private void validateAndAddPosition(int x, int y){
      if(x > MIN_POSITION && x < MAX_POSITION && y > MIN_POSITION && y < MAX_POSITION){
      possibleLocations.add(new Location(x, y));
    }
   }

   public List<Location> getPossibleMoves(){
     int currentX = position.getXcoordinate();
     int currentY = position.getYcoordinate();

     int[] directionX = {-1, 0, 1, -1, 1, -1, 0, 1};
     int[] directionY = {-1, -1, -1, 0, 0, 1, 1, 1};

     for (int directionIndex = 0; directionIndex < 8; directionIndex++) {
       validateAndAddPosition(currentX + directionX[directionIndex], currentY + directionY[directionIndex]);
     }

     return possibleLocations;
    }

}
