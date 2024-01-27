package Application;

import boardGame.Board;
import boardGame.Position;

public class Program {

	public static void main(String[] args) {
		
		Position position = new Position(2, 3);
		System.out.println(position);
		
		Board board = new Board(8, 8, 5);

	}

}
