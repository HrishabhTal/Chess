package chess.Entities;
import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece{

    private final int MIN_POSITION = 1;
    private final int MAX_POSITION = 8;
    private List<Location> possibleLocations = new ArrayList<>();
 
    public Queen(Location initialPosition){
       this.position = initialPosition;
     }

     private Boolean validateAndAddPosition(int x, int y){
        if(x > MIN_POSITION && x < MAX_POSITION && y > MIN_POSITION && y < MAX_POSITION){
          possibleLocations.add(new Location(x, y));
          return true;
        }
        return false;
     }

     public List<Location> getPossibleMoves(){

        int currentX = position.getLocation1();
        int currentY = position.getLocation2();
   
        int[] directionX = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] directionY = {-1, -1, -1, 0, 0, 1, 1, 1};

        for (int directionIndex = 0; directionIndex < 8; directionIndex++) {
            int newX = currentX + directionX[directionIndex]; 
            int newY = currentY + directionY[directionIndex];

            while(validateAndAddPosition(currentX + directionX[directionIndex], currentY + directionY[directionIndex])){

                newX += directionX[directionIndex];
                newY += directionY[directionIndex];

            }
        }
        return possibleLocations;

    }
}
    
    
