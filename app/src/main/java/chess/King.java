package chess;

import java.util.ArrayList;
import java.util.List;

public class King extends Position {


    private List<Location> allpossibles = new ArrayList<Location>();
    
    public King(Location position){
        this.position = position;
    }

    public void check(int pos1, int pos2, List<Location> allpossibles){

        if(pos1>0 && pos1<8 && pos2>0 && pos2<8){
            
            Location position = new Location(pos1, pos2);
            allpossibles.add(position);
        }


    }

    public List<Location> getAllpossibleSqaures(){


        Integer pos1 = position.getLocation1();

        Integer pos2 = position.getLocation2();

        check(pos1+1, pos2, allpossibles);
        check(pos1, pos2+1, allpossibles);
        check(pos1+1, pos2+1, allpossibles);
        check(pos1-1, pos2, allpossibles);
        check(pos1, pos2-1, allpossibles);
        check(pos1-1, pos2-1, allpossibles);
        check(pos1+1, pos2-1, allpossibles);
        check(pos1-1, pos2+1, allpossibles);

        return allpossibles;
    }
}
