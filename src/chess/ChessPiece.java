package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;//Valor inteiro, por padrão começa com 0 então não há a necessidade de colocar no construtor para iniciar com 0

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    //Deixando só o get porque não quero que a cor de uma peça seja modificada
    //Ela só poderá ser acessada
    public Color getColor() {
        return color;
    }

    public int getMoveCount(){
        return moveCount;
    }

    public void increaseMoveCount(){
        moveCount++;
    }

    public void decreaseMoveCount(){
        moveCount--;
    }

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}
