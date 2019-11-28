package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    //Converter uma rei para string, é o return "K"
    @Override
    public String toString(){
        return "K";
    }
}
