/**
 * # CS611 - Assignment 1
 * ## Tic Tac Toe and other variants
 * <Student Name:  Haoxuan Sun   >
 * <Student Email: hs4379@bu.edu >
 * <Student BUID:  U58198360     >
 *
 * GameList class
 * stores the games, easier to add or delete games from game library
 */

public enum GameList {
	TicTacToe("1", "Tic Tac Toe"), 
	OrderAndChaos("2", "Order And Chaos"), 
	Exit("3", "Exit"),
	Show_Developer_Info("4", "Show Game Developer Info");
	
    private final String gameNum;
    private final String gameName;
	
    GameList(String number, String name) {
        gameNum = number;
        gameName = name;
    }
    
    public String getGameName() {
        return gameName;
    }
    
	public String getGameNum() {
        return gameNum;
    }
    
    //override toString method in Enum class
    public String toString() {
        return "               " + gameNum + ": " + gameName;
    }
}
