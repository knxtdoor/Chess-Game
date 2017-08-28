package chessGame;

public class Board {
	Piece[][] board = new Piece[8][8];
	public Board(){
		
	}
	public void newGame(){
		
		//Fill whole board with Null pieces
		for(int x=0;x<8;x++){
			for(int y = 0;y <8; y++){
				board[x][y] = new NullPiece();
			}
		}
		
		
		//Fill White side second row (1) with pawns
		for(int x=0;x<8;x++){
			board[1][x] = new Pawn((byte) 1, 1, x);
		}
		System.out.println("Id at creation: " + board[1][0].checkID());
		//Fill Black side second row (6) with pawns
		for(int y=0;y<8;y++){
			board[6][y] = new Pawn((byte) 0, 6, y);
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
		for(int a = 0; a<8; a++){
			for(int b = 0; b<8; b++){
			//	System.out.println(a+ " " + b);				
		//		System.out.println("Piece Id: " + board[a][b].checkID());
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
		board[posX][posY] = new NullPiece();
		System.out.println("Id at old Pos: "+ board[posX][posY].checkID());
		System.out.println("Id at new Pos, "+destX+" "+destY+" :"+ board[destX][destY].checkID());

	}
	public int GetPieceSquare(int PosX, int PosY){
		return this.board[PosX][PosY].checkID();
	}
}