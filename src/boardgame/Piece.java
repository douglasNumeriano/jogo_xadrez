package boardgame;

//Classe Pe�a
public class Piece {
	
	protected Position position;
	private Board boarde;
	
	public Piece(Board boarde) {
		this.boarde = boarde;
		position = null;
	}

//Este m�todo � de uso somente da camada referente, por isso vamos deixa-lo como protected
	protected Board getBoarde() {
		return boarde;
	}

}
