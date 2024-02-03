package boardGame;

public class Position {

	private int row;
	private int column;
	
	public Position(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

	public int getColumn() {
		return column;
	}

	void setColumn(char column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	void setRow(int row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return row  + ", " + column;
	}
	
	
	
	
}
