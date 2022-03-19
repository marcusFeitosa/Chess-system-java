package boardGame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Constructors
	public Board() {
	}
	public Board(int rows, int columns) {
		if (rows<1||columns<1)
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		this.rows = rows;
		this.columns = columns;
		pieces=new Piece[rows][columns];
	}
	
	// Getters and Setters
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
		
	//Methods (no implemetation)
	public Piece piece(int row, int column) {
		if(!positionExists(row, column))
			throw new BoardException("position not on the board!");
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position))
			throw new BoardException("position not on the board!");
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) 
			throw new BoardException("There is already a piece on position "+position);
		pieces[position.getRow()][position.getColumn()]=piece;
		piece.position=position;
	}
	
	public Piece removePiece(Position position) {
		return pieces[0][0];
	}
	
	private boolean positionExists(int row, int column) {
		return row>=0 && row<rows && column>=0 && column>=0 && column<columns;
	}
	
	public Boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}
	
	public Boolean thereIsAPiece(Position position) {
		if(!positionExists(position))
			throw new BoardException("position not on the board!");
		return piece(position)!=null;
	}
	
	
	
}
