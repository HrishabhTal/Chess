package chess.Repository;
import java.util.ArrayList;
import java.util.List;

import chess.Location;
public class BoardRepository implements IBoardRepository {

    private final String message = "Board is set";
    private final List<Square> chessboard;
    

    public BoardRepository(){
        chessboard = new ArrayList<Square>();
    }

    public BoardRepository(List<Square> chessboard){
        this.chessboard = chessboard;
    }

    
    public void setPawn(Square pawn){

        for(int start = 8; start < 16; start++){
            chessboard.set(start, pawn);
        }

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






    
}
