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
			
			
			move = input(team, mainBoard);
			
			destX = Character.getNumericValue(move.charAt(3));
			destY = Character.getNumericValue(move.charAt(4));
			if(move.charAt(0)=='p') ID = 0;
			if(move.charAt(0)=='n') ID = 1;
			
			//int[] target = mainBoard.pieceFind(ID, destX, destY);
			//posX = target[0];
			//posY = target[1];
			posX = Character.getNumericValue(move.charAt(1));
			posY = Character.getNumericValue(move.charAt(2));
			//	if(posX == -1|| posY== -1) error();
			if(mainBoard.GetPiece(posX, posY) != ID) { 
				System.out.println("Invalid!");
				move  = input(team, mainBoard); 
			}
			else{
			mainBoard.move(posX, posY, destX, destY);
			}
				
			
			
		}
		
	}
	
	
	public String input(byte team, Board mainBoard){
		String move ="";
		if(team == 1){
			System.out.println("White's Turn");
		}
		if(team == 0){
			System.out.println("Black's Turn");
		}
		System.out.println("Do you want to (M)ove a piece or (E)xamine the board?");
		move = in.nextLine();
		if(move.equalsIgnoreCase("m")){
			System.out.println("What is your move?");
			move = in.nextLine();
			return move;			
		}
		if(move.equalsIgnoreCase("e")){
			System.out.println("What space do you want to examine?");
			move = in.nextLine();
			System.out.println("The piece at "+Character.getNumericValue(move.charAt(0))+", "+Character.getNumericValue(move.charAt(1))+" is "+mainBoard.GetPiece(Character.getNumericValue(move.charAt(0)), Character.getNumericValue(move.charAt(1))));
			input(team, mainBoard);
		}
		return move; 
	}
	
	public void error(){
		System.out.println("Something went wrong!");
		System.exit(0);
	}

}
