package boardgame;

//Classe Peça
public class Piece {
	
	protected Position position;
	private Board boarde;
	
	public Piece(Board boarde) {
		this.boarde = boarde;
		position = null;
	}

//Este método é de uso somente da camada referente, por isso vamos deixa-lo como protected
	protected Board getBoarde() {
		return boarde;
	}

}
