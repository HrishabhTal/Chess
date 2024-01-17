package chess.Entities;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Position {
    
    public Pawn(Location position){
        this.position = position;
    }
    
    public Location getAllPossibleSqaures(){
        if(position.getLocation2() == 8){
            return new Location(0,0); 
        }
        Integer value1 = position.getLocation1(); 
        Integer value2 = position.getLocation2();
        
        if(value2 == 2){
            value1 = value1++;
        }

        value2 = value2++; 
        
        position.setLocation1(value1);
        position.setLocation2(value2); 
        
        return position;
    }
    
    
    
    
}
