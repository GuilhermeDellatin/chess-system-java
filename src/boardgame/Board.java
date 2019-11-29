package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if(rows< 1 || columns  < 1){ //Programação Defensiva
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    //Retirar esse método para que não deixe ser alterado a quantidade de linhas
    /*
    public void setRows(int rows) {
        this.rows = rows;
    }*/

    public int getColumns() {
        return columns;
    }
    //Retirar esse método para não deixar ser alterado a quantidade de colunas
    /*
    public void setColumns(int columns) {
        this.columns = columns;
    }*/

    public Piece piece(int row, int column){
        if(!positionExists(row, column)){//Programação defensiva
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position){
        if(!positionExists(position)){//Programação defensiva
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    //Ele vai ter que ir na matriz de peças do tabuleiro e vai ter que atribuir a essa posição
    // a peça que veio como argumento
    public void placePiece(Piece piece, Position position){
        //Ao invés de acrescentar o positionExists aqui, vamos implementar no thereIsAPiece
        if(thereIsAPiece(position)){//Programação Defensiva
            throw new BoardException("There is already a piece on position "+ position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        //Peça é acessivel diretamente porque colocamos protected, e estamos no mesmo pacote
        piece.position = position;
    }

    private boolean positionExists(int row, int column){
        return row >= 0 && row < rows && column >=0 && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if(!positionExists(position)){//Programação defensiva
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }
}