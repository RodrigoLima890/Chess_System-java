package boardgame;

public class Piece {

	protected Position position;//N�o � a posi��o no xadrez � uma posi��o simples de matriz
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;//inicialmente a pe�a ainda n�o foi colocada no tabuleiro por isso recebe null
	}

	protected Board getBoard() {
		return board;
	}
}
