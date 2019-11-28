package boardgame;

public class Piece {
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


}
