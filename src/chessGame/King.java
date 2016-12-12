package chessGame;

public class King extends Piece{
	public static final int id = 5;
	
	byte color = 0;
	public King(byte team){
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
