package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    //Deixando só o get porque não quero que a cor de uma peça seja modificada
    //Ela só poderá ser acessada
    public Color getColor() {
        return color;
    }

}
