package chessGame;

public abstract class Piece {
	int id =-1;
	int x;
	int y;
	public abstract boolean move(int destX, int destY);
	public abstract void attack();
	public abstract int checkID();

}
