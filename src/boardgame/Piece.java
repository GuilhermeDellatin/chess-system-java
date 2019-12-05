package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    //Não é passado a peça, porque uma peça recem  criada é considerada como nula
    public Piece(Board board) {
        this.board = board;
        position = null; //Se não atribuirmos nada aqui o java por padrão atribui nulo
    }

    //Não vamos implementar o set para não permitir que nosso tabuleiro seja alterado
    //É protected para somente classes e subclasses do mesmo pacote pode acessar o tabuleiro de uma peça
    protected Board getBoard() {
        return board;
    }

    //Definindo operação de movimentos possíveis
    public abstract boolean[][] possibleMoves();

    //Hook methods, tenho um método concreto que está utilizando um método abstrato
    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
