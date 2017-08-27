package chessGame;

import java.util.Scanner;

public class Game {
	Scanner in = new Scanner(System.in);
	public Game(){
		Board mainBoard = new Board();
		mainBoard.newGame();
		mainLoop(mainBoard);
	}
	public void mainLoop(Board mainBoard){
		System.out.println("Begin Loop");
		int destX,destY,posX,posY,ID = 0;
		byte team = 1;
		String move = "";
		while (true){
			
			
			move = input(team);
			
			destX = Character.getNumericValue(move.charAt(1));
			destY = Character.getNumericValue(move.charAt(2));
			if(move.charAt(0)=='p') ID = 0;
			if(move.charAt(0)=='n') ID = 1;
			
			int[] target = mainBoard.pieceFind(ID, destX, destY);
			posX = target[0];
			posY = target[1];
			if(posX == -1|| posY== -1) error();
			mainBoard.move(posX, posY, destX, destY);
			
				
			
			
		}
		
	}
	
	
	public String input(byte team){
		String move ="";
		if(team == 0){
			System.out.println("White's Turn: ");
			move = in.nextLine();
		}
		if(team == 1){
			System.out.println("Black's Turn: ");
			move = in.nextLine();
		}
		return move;
		
	}
	public void error(){
		System.out.println("Something went wrong!");
		System.exit(0);
	}

}
