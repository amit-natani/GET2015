/**
 *Program Title: to find permutations of a given string using Recursion
 *Date: 12 Aug 2015
 */
import java.util.*;	// package imported to use Scanner Class

/**
 * @author Amit
 *
 */
public class Permutation 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/* initialization */
		Scanner sc = null;
		String inputString;			
		try
		{
			sc = new Scanner(System.in);		
			System.out.println("Enter a String: ");
			inputString = sc.next();			
			StringPermutation stringPermutationObject=new StringPermutation();		
			stringPermutationObject.permute(inputString);		// permute method invocation with parameter inputString
			sc.close();											// sc object closed
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			sc.close();
			return;
		}
	}
}

class StringPermutation
{
	
	/* this method takes input string as argument and call other method named doPermute with parameters 
	 * char array inputArray.  List Object Result, boolean array Used, length of input as inputLength
	 * level and outputString as StringBuilder 
	 */
	List<String> permute(String inputString)
	{
	  int inputLength = inputString.length();	
	  StringBuilder outputString = new StringBuilder();	
	  boolean[ ] Used = new boolean[ inputLength ];	// boolean array with size equal to inputLength
	  List<String> Result = new ArrayList<String>();			
	  char[ ] inputArray = inputString.toCharArray( );			// this will convert input string in character array
	  
	  
	  /* the result of doPermute will be stored in List named result */
	  Result = doPermute ( inputArray, Result, Used, inputLength, 0, outputString);
	  
	  /* Printing all values stored in the List Result */
	  for(String s : Result)
	  {
		  System.out.println(s);
	  }
	  return Result;		// Returning the list Result 

	}
	
	/* recursive method with parameters 
	 * char array inputArray.  List Object Result, boolean array Used, length of input as inputLength
	 * index and outputString as StringBuilder */
	List<String> doPermute ( char[] inputArray, List<String> Result, boolean[] Used, int inputLength, int index, StringBuilder outputString)
	{
		boolean flag = false;
		
		/* checking for the duplicate strings */
		try
		{
			if( index == inputLength) 
			{
				for(String tempString : Result)
				{
					if(tempString.equals(new String(outputString)))
					{
						flag = true;
						break;
					}
				}
				if(flag == false)
					/* this code will be executed if the permutation is not repeated */
					Result.add(outputString.toString());		// Add permutations to List Result
				return Result;			// returning the List Result
			}
			
			for( int i = 0; i < inputLength; ++i )
			{       
		
				if( Used[i] ) 
					continue;		// continue if character is already traced
				
				outputString.append( inputArray[i] );      // append the next character to outputArray
				Used[i] = true;       
				doPermute( inputArray, Result, Used, inputLength, index + 1, outputString); // recursive calling with increased index
				Used[i] = false;       			
				outputString.setLength(outputString.length() - 1 );	// decrementing length of outputString by 1 for next different character
			}
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
			System.exit(0);
		}
		return Result;  				// returning the List Result
	}
}




