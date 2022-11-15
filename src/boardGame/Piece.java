package boardGame;

public class Piece {
    //não é a posição de xadrez é apenas uma posição de matriz por isso não pode esta visivel
    protected Position position;
    private Board board;

    public Piece(Board board){
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
