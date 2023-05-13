/**
 * # CS611 - Assignment 1
 * ## Tic Tac Toe and other variants
 * <Student Name:  Haoxuan Sun   >
 * <Student Email: hs4379@bu.edu >
 * <Student BUID:  U58198360     >
 *
 * OrderAndChaosBoard Class
 * This class inherits from GENERALBOARD class.
 * A class that specially designed for OrderAndChaos's board.
 * OAC rules for win is implemented here.
 */

public class OrderAndChaosBoard extends GeneralBoard {
    private int size;
	
	public OrderAndChaosBoard(int size) {
        this.size = size;
        rowSize = size;
        colSize = size;
        board = new String[size][size];
    }

    
	@Override
	protected boolean win(int latestMove) {
		int latestMoveRow = super.getCellRow(latestMove);
		int latestMoveColumn = super.getCellCol(latestMove);
		String latestMoveValue = super.getCellValue(latestMove);
		
		//check row
		int numOa = 0;
		int numOb = 0;
		// check 'O' from this cell's upper cells 
		for (int i = latestMoveColumn-1; i > -1; i--) {
			if(board[latestMoveRow][i] == null) {break;}	//check null
			if(!board[latestMoveRow][i].equals(latestMoveValue)) {
				break;
	        } else {
	        	numOa++;
	        }
		}
		//check 'O' from this cell's lower cells
		for (int i = latestMoveColumn+1; i < size; i++) {
			if(board[latestMoveRow][i] == null) {break;}
			if(!board[latestMoveRow][i].equals(latestMoveValue)) {
				break;
	        } else {
	        	numOb++;
	        }
		}
		// if 5 continues 'O' in a row
		if (numOa + numOb == 4) {
			return true;
		}
        
        //check column
		numOa = 0;
		numOb = 0;
		// check 'O' from this cell's left cells
		for (int i = latestMoveRow-1; i > -1; i--) {
			if(board[i][latestMoveColumn] == null) {break;}
			if(!board[i][latestMoveColumn].equals(latestMoveValue)) {
				break;
	        } else {
	        	numOa++;
	        }
		}
		// check 'O' from this cell's right cells
		for (int i = latestMoveRow+1; i < size; i++) {
			if(board[i][latestMoveColumn] == null) {break;}
			if(!board[i][latestMoveColumn].equals(latestMoveValue)) {
				break;
	        } else {
	        	numOb++;
	        }
		}
		// if 5 continues 'O' in a column
		if (numOa + numOb == 4) {
			return true;
		}
        
        //check diagonal \
		numOa = 0;
		numOb = 0;
		// check 'O' from this cell's left-above cells
		for (int i = 1; i < Math.min(latestMoveRow, latestMoveColumn)+1; i++) {
			if(board[latestMoveRow-i][latestMoveColumn-i] == null) {break;}
			if(!board[latestMoveRow-i][latestMoveColumn-i].equals(latestMoveValue)) {
				break;
	        } else {
	        	numOa++;
	        }
		}
		// check 'O' from this cell's right-below cells
		for (int i = 1; i < Math.min(size-latestMoveRow-1, size-latestMoveColumn-1)+1; i++) {
			if(board[latestMoveRow+i][latestMoveColumn+i] == null) {break;}
			if(!board[latestMoveRow+i][latestMoveColumn+i].equals(latestMoveValue)) {
				break;
	        } else {
	        	numOb++;
	        }
		}
		// if 5 continues 'O' in diagonal
		if (numOa + numOb == 4) {
			return true;
		}
            
        //check anti-diagonal /
		numOa = 0;
		numOb = 0;
		// check 'O' from this cell's left-below cells
		for (int i = 1; i < Math.min(size-latestMoveRow-1, latestMoveColumn)+1; i++) {
			if(board[latestMoveRow+i][latestMoveColumn-i] == null) {break;}
			if(!board[latestMoveRow+i][latestMoveColumn-i].equals(latestMoveValue)) {
				break;
	        } else {
	        	numOa++;
	        }
		}
		// check 'O' from this cell's right-above cells
		for (int i = 1; i < Math.min(latestMoveRow, size-latestMoveColumn-1)+1; i++) {
			if(board[latestMoveRow-i][latestMoveColumn+i] == null) {break;}
			if(!board[latestMoveRow-i][latestMoveColumn+i].equals(latestMoveValue)) {
				break;
	        } else {
	        	numOb++;
	        }
		}
		// if 5 continues 'O' in anti-diagonal
		if (numOa + numOb == 4) {
			return true;
		}
		
		// no winner yet
		return false;
	}

}
