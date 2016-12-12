package chessGame;

public class Pawn extends Piece{
	public static final int id = 0;
	
	
	byte color = 0;
	int x = 0;
	int y = 0;
	boolean isFirst = true;
	public Pawn(byte team, int posX, int posY){
		this.color = team;
		this.x = posX;
		this.y = posY;
	}
	public boolean move(int destX, int destY){
		if(isFirst = true){
			if(destX==(this.x)+2){
				isFirst= false;  
				return true;
			}
		}
		if(destX==(this.x)+1){
			isFirst = false;
			return true;
		}
		return false;
		
	}
	public void attack(){
		
	}
	public int checkID(){
		return this.id;
	}

}
