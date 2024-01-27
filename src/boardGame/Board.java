package boardGame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns, Piece[][] pieces) {
		super();
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}

	int getRows() {
		return rows;
	}

	void setRows(int rows) {
		this.rows = rows;
	}

	int getColumns() {
		return columns;
	}

	void setColumns(int columns) {
		this.columns = columns;
	}

	Piece[][] getPieces() {
		return pieces;
	}

	void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}
	
	
	
}
