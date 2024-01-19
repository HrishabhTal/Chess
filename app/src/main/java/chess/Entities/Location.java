package chess.Entities;
import java.util.ArrayList;
import java.util.List;
public class Location {

    private Integer xcoordinate;
    private Integer ycoordinate;

    public Location(Integer location1, Integer location2){
        this.xcoordinate = location1;
        this.ycoordinate = location2;

    }

    public void setXcoordinate(Integer location){
        
        xcoordinate = location;
    
    }

    public void setYcoordinate(Integer location){

        ycoordinate = location;

    }
    public Integer getXcoordinate(){

        return xcoordinate;

    }
    
    public Integer getYcoordinate(){

        return ycoordinate;

    }

}
