package chess.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


import java.util.*;

import chess.Entities.Location;
import chess.Entities.PieceColour;
import chess.Entities.Piece;
import chess.Entities.Position;
public class ChessBoardRepository{

    private final String message = "Board is set";
    private final String successful = "Successful";
    private final List<Position> chessboard;
    

    public ChessBoardRepository(){
        chessboard = Stream.generate(() -> new Position(null,null)).limit(10).collect(Collectors.toList());

    }

    public ChessBoardRepository(List<Position> chessboard){
        this.chessboard = chessboard;
    }

    
    public void setPawn(Position pawn){

        for(int start = 8; start < 16; start++){
            chessboard.set(start, pawn);
        }

    }

    public Integer convertPositionToIndex(Location position1){
        return position1.getYcoordinate() == 0 ? position1.getXcoordinate():(position1.getYcoordinate()-1) * 10 + position1.getXcoordinate();

    }

    public String setupBoard(){
        
        chessboard.set(0, new Position(PieceColour.White, "Rook"));
        chessboard.set(1, new Position(PieceColour.White, "Knight"));
        chessboard.set(2, new Position(PieceColour.White, "Bishop"));
        chessboard.set(3, new Position(PieceColour.White, "Queen"));
        chessboard.set(4, new Position(PieceColour.White, "King"));
        chessboard.set(5, new Position(PieceColour.White, "Bishop"));
        chessboard.set(6, new Position(PieceColour.White, "Knight"));
        chessboard.set(7, new Position(PieceColour.White, "Rook"));

        Position pawn = new Position(PieceColour.White, "Pawn");

        setPawn(pawn);

        return message;

    }

    public Boolean editPiecePosition(String piecename, Integer position1, Integer position2){
        
        chessboard.set(position2, chessboard.get(position1));
        chessboard.set(position1, null);
        return true;
        
    }







    
}
