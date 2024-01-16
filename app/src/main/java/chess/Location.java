package chess;
import java.util.ArrayList;
import java.util.List;
public class Location {

    private Integer location1;
    private Integer location2;

    public Location(Integer location1, Integer location2){
        this.location1 = location1;
        this.location2 = location2;

    }

    public void setLocation1(Integer location){
        
        location1 = location;
    
    }

    public void setLocation2(Integer location){

        location2 = location;

    }
    public Integer getLocation1(){

        return location1;

    }
    
    public Integer getLocation2(){

        return location2;

    }

}
