package chess.Entities;

public class Position {

    private PieceColour pieceColour;
    private String piecename;

    public Position(PieceColour pieceColour, String piecename){
        this.pieceColour = pieceColour;
        this.piecename = piecename;
    }

    public void setWhite(){
        this.pieceColour = PieceColour.White;
    }

    public void setBlack(){
        this.pieceColour = PieceColour.Black;
    }

    public void setPieceName(String piecename){
        this.piecename = piecename;
    }

    public PieceColour getPieceColour(){
        return pieceColour;
    }

    public PieceColour getPieceName(){
        return pieceColour;
    }

}
