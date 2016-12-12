package chessGame;

public class Bishop extends Piece{
	public static final int id = 2;
	
	byte color = 0;
	public Bishop(byte team){
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
