package boardGame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Constructors
	public Board() {
	}
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces=new Piece[rows][columns];
	}
	
	// Getters and Setters
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumn(int columns) {
		this.columns = columns;
	}
	
	//Methods (no implemetation)
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
	
	}
	
	public Piece removePiece(Position position) {
		return pieces[0][0];
	}
	
	public Boolean ExistsPiece(Position position) {
		return true;
	}
	
	public Boolean thereIsAPierce(Position position) {
		return true;
	}
	
	
	
}
