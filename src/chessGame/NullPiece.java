package chessGame;

public class NullPiece extends Piece{
	int id =-1;
	int x;
	int y;
	public  boolean move(int destX, int destY){
		return false;
	}
	public  void attack(){}
	public  int checkID(){
		return this.id;
	}

}
