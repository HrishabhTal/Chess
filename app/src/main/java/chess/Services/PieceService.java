package chess.Services;

import java.util.List;

import chess.Entities.King;
import chess.Entities.Location;
import chess.Entities.Position;
import chess.Exceptions.PieceNotFoundException;
import chess.Repository.ChessBoardRepository;

public class PieceService {

    private final String king = "King";
    private final String queen = "Queen";
    private final String pawn = "Pawn";
    
    public Boolean checkValidPiece(String pieceName){
        
        return pieceName.equals("Pawn") || pieceName.equals("King") || pieceName.equals("Queen") || pieceName.equals("Knight") 
        || pieceName.equals("Bishop") || pieceName.equals("Rook") ? true :false;
    }

    public 
    
    
    public List<Position> pieceMoves(String pieceName, ){

        return pieceName.equals(King) ? King.getPossibleMoves()

    }



    
    
    public String pieceMovements(String pieceName, String squarePosition) throws PieceNotFoundException{

        if(checkValidPiece(pieceName)){

            throw new PieceNotFoundException("INVALID PIECE");
            
        }

        List<Location> pieceMoves;
        
        pieceMoves = pieceMoves();

        



        

    }  


    
}
