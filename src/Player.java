/**
 * # CS611 - Assignment 1
 * ## Tic Tac Toe and other variants
 * <Student Name:  Haoxuan Sun   >
 * <Student Email: hs4379@bu.edu >
 * <Student BUID:  U58198360     >
 *
 * Player class
 * Stores player object that are playing the game.
 * each player has (name/No./team name/piece type/game has played/
 * game has won/game was ended in draw) properties.
 * 
 * Some operations methods are also in this class, they are all
 * used to interact a player. such as get game count / update count 
 * of win. 
 */


public class Player {
	
	private String playerName;
	private int playerNum;
	private String teamName;
	private String playerPieceType;
	private int gameCount;
	private int winCount;
	private int drawCount;
	
	public Player(String name, int num, String tName) {
		playerName = name;
		playerNum = num;
		teamName = tName;
		playerPieceType = "";
		gameCount = 0;
		winCount = 0;
		drawCount = 0;
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	
	
	
	public int getPlayerNum() {
		return playerNum;
	}
	
	
	public String getTeamName() {
		return teamName;
	}
	
	
	public String getplayerPieceType() {
		return playerPieceType;
	}
	
	public void setplayerPieceType(String type) {
		playerPieceType = type;
	}
	
	
	
	public int getGameCount() {
		return gameCount;
	}
	
	public void updateGameCount() {
		this.gameCount++;
	}
	
	
	
	public int getWinCount() {
		return winCount;
	}
	
	public void updateWinCount() {
		this.winCount++;
	}
	
	
	
	public int getDrawCount() {
		return drawCount;
	}
	
	public void updateDrawCount() {
		this.drawCount++;
	}
	
	
	
	public String toString() {
        return "\n Player '" + playerName + "'       plays piece: '" + playerPieceType
        		 + "'       Total game: " + gameCount 
        		 + "      Win: " + winCount +  "      Draw: " + drawCount ;
    }

}
