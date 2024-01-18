package chess.Services;

import java.util.List;

import chess.Exceptions.PieceNotFoundException;
import chess.Repository.ChessBoardRepository;

public class ChessBoardService {
    
    private final ChessBoardRepository chessBoardRepository;

    public ChessBoardService(ChessBoardRepository chessBoardRepository){

        this.chessBoardRepository = chessBoardRepository;

    }

    public Boolean checkValidPiece(String pieceName){
        
        return pieceName.equals("Pawn") || pieceName.equals("King") || pieceName.equals("Queen") || pieceName.equals("Knight") 
        || pieceName.equals("Bishop") || pieceName.equals("Rook") ? true :false;
    }



    
    
    public String pieceMovements(String pieceName, String squarePosition) throws PieceNotFoundException{

        if(checkValidPiece(pieceName)){
            
        }

    }  


    
}
