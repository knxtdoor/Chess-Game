package chessGame;

public class Board {
	Piece[][] board = new Piece[8][8];
	public Board(){
		
	}
	public void newGame(){
		//Fill White side second row (1) with pawns
		for(int x=0;x<8;x++){
			board[1][x] = new Pawn((byte) 1, 1, x);
		}
		//Fill Black side second row (6) with pawns
		for(int y=0;y<8;y++){
			board[1][y] = new Pawn((byte) 0, 1, y);
		}
		
		//Create white knights
		board[0][1] = new Knight((byte) 1);
		board[0][6] = new Knight((byte) 1);
		
		//Create black knights
		board[7][1] = new Knight((byte) 0);
		board[7][6] = new Knight((byte) 0);
		
		//Create white bishops
		board[0][2] = new Bishop((byte) 1);
		board[0][5] = new Bishop((byte) 1);
		
		//Create black bishops
		board[7][2] = new Bishop((byte) 0);
		board[7][5] = new Bishop((byte) 0);
		
		//Create white rooks
		board[0][0] = new Rook((byte) 1);
		board[0][7] = new Rook((byte) 1);
		
		//Create black rooks
		board[7][0] = new Rook((byte) 0);
		board[7][7] = new Rook((byte) 0);
		
		//Create white queen
		board[0][3] = new Queen((byte) 1);
		
		//Create black queen
		board[7][4] = new Queen((byte) 0);
		
		//Create white king
		board[0][4] = new King((byte) 1);
		
		//Create black king
		board[7][3] = new King((byte) 0);
				
		
	}
	public int[] pieceFind(int ID, int destX, int destY){
		int[] num = new int[2];
		for(int a = 1; a<8; a++){
			for(int b = 0; b<8; a++){
				System.out.println(board[a][b]);
				if(ID == board[a][b].checkID()){
					if (board[a][b].move(destX, destY)){
						num[0] = a;
						num[1] = b;
						return num;
					}
				}
			}
		}
		num[0] = -1;
		num[1] = -1;
		return num;
	}
	public void move(int posX, int posY, int destX, int destY){
		board[destX][destY] = board[posX][posY];
		board[destX][destY].x = destX;
		board[destX][destY].y = destY;
		board[posX][posY] = null;

	}
}