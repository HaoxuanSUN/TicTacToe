/**
 * # CS611 - Assignment 1
 * ## Tic Tac Toe and other variants
 * <Student Name:  Haoxuan Sun   >
 * <Student Email: hs4379@bu.edu >
 * <Student BUID:  U58198360     >
 *
 * Game Library Class
 * The home page of this program. When run the game for the 
 * first time, or exit a game, user will back to game library for further 
 * operation.  
 */


import java.util.Scanner;

public class GameLibrary {

	// start game
    public static void start() {
	    System.out.println();
	    System.out.println();
	    System.out.println();
    	System.out.println("----------------------------------------------------------");
	   	System.out.println("                  Welcome to Game Library                 ");
	   	System.out.println("----------------------------------------------------------");
	    System.out.println();
	   	printGameList();
	    System.out.println();
	   	System.out.println("Enter number to start game or exit:");

	   	
        while (true) {
    	    String selectnumber = new Scanner(System.in).nextLine();
    	    // Choose EXIT
		    if (selectnumber.equals(GameList.Exit.getGameNum())) {
		    	System.out.println("Leaving game...Thank you! Hope you come back soon!");
		        break;
		    // choose Show_Developer_Info
		    } else if (selectnumber.equals(GameList.Show_Developer_Info.getGameNum())) {
		    	System.out.println("Haoxuan Sun ~ U58198360 ~ hs4379@bu.edu");
		    	System.out.println("Enter number to start game or exit:");
		    	continue;
		    } else {
	    		GeneralGame creategame = createGame(selectnumber);
	            if (creategame == null) {
	                System.out.println("Please enter valid number.");
	            } else {
	            	creategame.getPlayerNamePieceType();
	            	creategame.startGame();
	            }
	        }
        }
    }

    // print game list
	private static void printGameList() {
		GameList[] gamelistvalue = GameList.values();
        for(GameList eachgamelistvalue : gamelistvalue){
            System.out.println(eachgamelistvalue);
        }
	}
	
	// create a game instance base on what game the user just choose
	public static GeneralGame createGame(String number){
		if(number.equals(GameList.TicTacToe.getGameNum())){
			return new TicTacToeGame();
		} else if (number.equals(GameList.OrderAndChaos.getGameNum())){
			return new OrderAndChaosGame();
	    } else {
	        return null;
	    }
	}
	
}
