package chessGame;

public class Queen extends Piece{
	public static final int id = 4;
	
	
	byte color = 0;
	public Queen(byte team){
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
