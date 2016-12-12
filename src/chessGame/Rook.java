package chessGame;

public class Rook extends Piece{
	public static final int id = 3;
	byte color = 0;
	public Rook(byte team){
		this.color = team;
	}
	public boolean move(int destX, int destY){
		return false;
		
	}
	public void attack(){
		
	}
	public int checkID(){
		return this.id;
	}


}
