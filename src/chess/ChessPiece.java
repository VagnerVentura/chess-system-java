package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public class ChessPiece extends Piece {
	private Color color;
	
	
	public ChessPiece(Board board, Color color) {
		super(board);// Esta linha chama o construtor da classe pai 
		this.color = color;
	}


	public Color getColor() {
		return color;
	}


		
	
	
}
