package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public abstract class ChessPiece extends Piece {
	private Color color;
	
	
	public ChessPiece(Board board, Color color) {
		super(board);// Esta linha chama o construtor da classe pai 
		this.color = color;
	}


	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOponnentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p!= null && p.getColor()!= color;
	}

		
	
	
}
