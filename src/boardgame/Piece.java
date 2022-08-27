package boardgame;

public class Piece {

	protected Position position;//Não é a posição no xadrez é uma posição simples de matriz
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;//inicialmente a peça ainda não foi colocada no tabuleiro por isso recebe null
	}

	protected Board getBoard() {
		return board;
	}
}
