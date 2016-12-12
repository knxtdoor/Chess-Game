package chessGame;

public class Knight extends Piece{
	public static final int id = 1;
	
	
	byte color = 0;
	public Knight(byte team){
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
