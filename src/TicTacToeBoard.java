/**
 * # CS611 - Assignment 1
 * ## Tic Tac Toe and other variants
 * <Student Name:  Haoxuan Sun   >
 * <Student Email: hs4379@bu.edu >
 * <Student BUID:  U58198360     >
 *
 * TicTacToeBoard class
 * This class inherits from GENERALBOARD class.
 * A class that specially designed for TicTacToe board.
 * TTT rules for win is implemented here.
 * 
 */

public class TicTacToeBoard extends GeneralBoard {
    private int size;

    public TicTacToeBoard(int size) {
        this.size = size;
        rowSize = size;
        colSize = size;
        board = new String[size][size];
    }

    
    public int getSize() {
        return size;
    }

    
	@Override
	protected boolean win(int latestMove) {
		int latestMoveRow = super.getCellRow(latestMove);
		int latestMoveColumn = super.getCellCol(latestMove);
		String latestMoveValue = super.getCellValue(latestMove);
		
		//check row
        for(int i = 0; i < size; i++){
            if(board[latestMoveRow][i] != latestMoveValue )
                break;
        	// all cells in this row is in same mark
            if(i == size-1){
            	//System.out.println("Detect Victory! On row " + latestMoveRow);
                return true; 
            }
        }
        
        //check column
        for(int i = 0; i < size; i++){
            if(board[i][latestMoveColumn] != latestMoveValue )
                break;
        	// all cells in this column is in same mark
            if(i == size-1){
            	//System.out.println("Detect Victory! On Column " + latestMoveColumn);
                return true; 
            }
        }
        
        //check diagonal \
        if(latestMoveRow == latestMoveColumn){
            for(int i = 0; i < size; i++){
            	// check whether in the line of diagonal
                if(board[i][i] != latestMoveValue)
                    break;
            	// all cells in this diagonal is in same mark
                if(i == size-1){
                   //System.out.println("Detect Victory! On diagonal");
                   return true;
                }
            }
        }
            
        //check anti-diagonal /
        if(latestMoveRow + latestMoveColumn == size - 1){
            for(int i = 0; i < size; i++){
            	// check whether in the line of anti-diagonal
                if(board[i][(size-1)-i] != latestMoveValue)
                    break;
            	// all cells in this anti-diagonal is in same mark
                if(i == size-1){
                    //System.out.println("Detect Victory! On anti-diagonal");
                	return true;
                }
            }
        }
        //no winner yet
		return false;
	}
	
	
}
