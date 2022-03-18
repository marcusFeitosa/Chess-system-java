package boardGame;

public class Piece {
	protected Position position;
	private Board board;
	
	// Constructors
	public Piece() {
		
	}
	public Piece(Board board) {
		this.board = board;
	}
	
	
	//Getters and Setters
	protected Board getBoard() {
		return board;
	}
		
	//Methods
	public Boolean PossibleMoves() {
		return false;
	}
	
	public Boolean PossibleMove(Position position) {
		return false;
	}
	
	public Boolean IsThereAnyPossibleMove() {
		return false;
	}
	
	
	
}
