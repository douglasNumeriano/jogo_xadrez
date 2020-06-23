package boardgame;

//Classe Pe�a
public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

//Este m�todo � de uso somente da camada referente, por isso vamos deixa-lo como protected
	protected Board getBoard() {
		return board;
	}

}
