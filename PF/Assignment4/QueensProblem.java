/**
 *Program Title: N-queens Problem
 *Date: 12 Aug 2015
 */
import java.util.*;			// package imported to use Scanner class

/**
 * @author Amit
 *
 */
public class QueensProblem 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		Scanner sc = null;
		try
		{
			System.out.println("Enter queens");
	    	sc=new Scanner(System.in);							
	    	int noOfQueens=sc.nextInt();
	    	if(noOfQueens < 4)
	    	{
	    		System.out.println("can't be possible for less than 4 queens");
	    		System.out.println("Enter queens again");
	    		noOfQueens = sc.nextInt();
	    	}
	    	QueenProblemClass queenObject = new QueenProblemClass(noOfQueens); 	// class instantiation and queenObject hods the object of class
	        queenObject.callplaceNqueens();										// method invocation on behalf of object
	        sc.close();  														// closing scanner object
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			sc.close();
			return;
		}
	}
}
	
class QueenProblemClass
{
	int resultArray[][];
	int check[];
	public QueenProblemClass(int numOfQueens) 
	{
        check = new int[numOfQueens];		// Array definition with size as noOFQueens
    }
	
	/* this method print the queens in respective places */
	public int[][] printQueens(int[] itemArray) 
	{
        int noOfQueens = itemArray.length;
        int tempResult[][] = null;
        try
        {
        	tempResult= new int[noOfQueens][noOfQueens]; //temp result stores the 2D array for representation of queens
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        for (int i = 0; i < noOfQueens; i++) {
            for (int j = 0; j < noOfQueens; j++) {
                if (itemArray[i] == j) {
                   System.out.print(" 1 ");
                    tempResult[i][j]='1';
                } else 
                {
                    System.out.print(" 0 ");
                    tempResult[i][j]='0';
                }
            }
            System.out.println();
        }
      System.out.println();
       return tempResult;		// returning the 2-D array tempResult that contain the representation of queens
	}
	
	/* this method checks that any queen can be placed on a particular position or not */
	public boolean canPlaceQueen(int row, int column) 
	{
        /**
         * Returns TRUE if a queen can be placed in row and column .
         * Otherwise it returns FALSE. check[] is a global array whose first (row-1)
         * values have been set.
         */
        for (int i = 0; i < row; i++) {
            if (check[i] == column || (i - row) == (check[i] - column) ||(i - row) == (column - check[i])) 
            {
                return false;			
            }
        }
        return true;		
	}
	
	
	/* this method places the queens in proper row and column after checking */
	public int[][] placeNqueens(int row, int noOfQueens) 
	{
        /**
         * Using backtracking this method prints all possible placements of
         * noOfQueens queens on an noOfQueens x noOfQueens chessboard so that they are non-attacking.
         */
		try
		{
			for (int count = 0; count < noOfQueens; count++) 
	        {
	            if (canPlaceQueen(row, count)) 
	            {
	                check[row] = count;
	                if (row == noOfQueens - 1) 
	                {
	                    resultArray=printQueens(check);
	                    return resultArray;
	                    
	                  
	                } 
	                else 
	                {
	                    placeNqueens(row + 1, noOfQueens);
	                }
	            }
	        }
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
        return resultArray;
    }
	
    public int[][] callplaceNqueens() {
    	resultArray=placeNqueens(0, check.length);
        return resultArray;		// returning final 2-D array representing the queen representation 
        	
    }
	
}
