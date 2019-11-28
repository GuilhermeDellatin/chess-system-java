package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        //Chamamos o initialSetup para testar
        initialSetup();
    }

    //Vamos retornar ChessPiece em vez de chess ou piece, porque estamos na camada de xadrez
    //Como estamos fazendo um desenvolvimento em camadas, o programa vai enxergar só as peças de xadrez
    //E não as peças internas...
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        //Vamos percorrer a matriz de peças do tabuleiro e para cada peça vamos fazer um downcasting pra chesspiece
        for(int i = 0; i < board.getRows(); i++){
            for(int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        //Esse 2,1 ta no position na camada de board e não na de xadrez, no caso é uma posição de matriz
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7 , 4));
    }
}
