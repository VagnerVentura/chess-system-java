package boardGame;

public class Piece {
	protected Position position;
	private Board board;
	
	
	public Piece(Position position, Board board) {
		super();
		this.board = board;
		position = null;
	}


	protected Board getBoard() {
		return board;
	}


	
	
	
	
}
