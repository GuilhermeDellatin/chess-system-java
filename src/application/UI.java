package application;

import chess.ChessPiece;

public class UI {
    //Método para imprimir o formato tabuleiro
    public static void printBoard(ChessPiece[][] pieces){
        for(int i = 0; i < pieces.length; i++){
            //Para imprimir de 8 em diante
            System.out.print((8 - i) + " ");
            for(int j = 0; j < pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    //Método auxiliar para imprimir uma peça
    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print("-");
        }
        else{
            System.out.print(piece);
        }
        //Imprimir um espaço em branco para que as peças não fiquem grudadas umas nas outras
        System.out.print(" ");
    }

}
