package chess.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


import java.util.*;

import chess.Entities.Location;
import chess.Entities.PieceColour;
import chess.Entities.Position;
import chess.Entities.Square;
public class BoardRepository implements IBoardRepository {

    private final String message = "Board is set";
    private final String successful = "Successful";
    private final List<Square> chessboard;
    

    public BoardRepository(){
        chessboard = Stream.generate(() -> new Square(null,null)).limit(10).collect(Collectors.toList());
;
    }

    public BoardRepository(List<Square> chessboard){
        this.chessboard = chessboard;
    }

    
    public void setPawn(Square pawn){

        for(int start = 8; start < 16; start++){
            chessboard.set(start, pawn);
        }

    }

    public Integer convertPositionToIndex(Location position1){
        return position1.getLocation2() == 0 ? position1.getLocation1():(position1.getLocation2()-1) * 10 + position1.getLocation1();

    }

    @Override
    public String startGame(){
        
        chessboard.set(0, new Square(PieceColour.White, "Rook"));
        chessboard.set(1, new Square(PieceColour.White, "Knight"));
        chessboard.set(2, new Square(PieceColour.White, "Bishop"));
        chessboard.set(3, new Square(PieceColour.White, "Queen"));
        chessboard.set(4, new Square(PieceColour.White, "King"));
        chessboard.set(5, new Square(PieceColour.White, "Bishop"));
        chessboard.set(6, new Square(PieceColour.White, "Knight"));
        chessboard.set(7, new Square(PieceColour.White, "Rook"));

        Square pawn = new Square(PieceColour.White, "Pawn");

        setPawn(pawn);

        return message;

    }

    @Override 
    public String movePiece(String piecename, Location position1, Location position2){
        
        Square square1 = chessboard.get(convertPositionToIndex(position1));
        
        Square square2 = chessboard.get(convertPositionToIndex(position2));

        
        
        
        return successful;
        
    }







    
}
