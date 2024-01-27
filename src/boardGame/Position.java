package boardGame;

public class Position {

	private int row;
	private int column;
	
	public Position(int i, int row) {
		super();
		this.column = i;
		this.row = row;
	}

	int getColumn() {
		return column;
	}

	void setColumn(char column) {
		this.column = column;
	}

	int getRow() {
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
