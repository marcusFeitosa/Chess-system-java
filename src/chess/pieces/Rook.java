package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "R";
	}
	
	
	@Override // por padrão um novo boolean é instaciado com todos os valores falsos
	public boolean[][] possibleMoves() {
		boolean[][] mat= new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
	
}
