package chess.Exceptions;

public class PieceNotFoundException extends RuntimeException{
    public PieceNotFoundException()
    {
       super();
    }
    public PieceNotFoundException(String msg){
       super(msg);
    }   
       
   } 
