/**
 @Program: To search a number in an array using Linear Search
 @Date: 10/08/2015
 */

/**
 * @author Amit
 *
 */

import java.util.*;									// Package imported to use Scanner class
public class LinearSearch {
	int count=0;
	public static void main(String[] args) {
	
		/* Initialization */
		int count  = 0;
		Scanner sc = null;
		try
		{
			LinearSearchClass linearSearchObject = new LinearSearchClass();			
			sc = new Scanner(System.in);				
			int noOfElements, result, searchNumber;																				
			System.out.println("Enter No of Elements: ");		
			noOfElements = sc.nextInt();
			
			if(noOfElements<=0)
			{
				System.out.println("No of Elements should be Positive(>0)");		// This message will be printed if the no of elements is zero or negative
			}
			else
			{
				int[] itemArray = new int[noOfElements];		// Array creation with size = noOFElements
				System.out.println("Enter elements of Array: ");
				for(int i=0; i < noOfElements; i++)
				{
					itemArray[i] = sc.nextInt();			// input elements of array using Scanner class object sc
				}
				System.out.println("Enter number to be searched: ");
				searchNumber=sc.nextInt();							
				result = linearSearchObject.linearSearch(itemArray, searchNumber,count);		// method invocation with parameters itemArray and the searchNumber
				if(result == -1)								 
				{
					System.out.println(searchNumber+" is not found in the list");	//Message to be printed if the no is not found in the list
				}
				else
				{
					System.out.println(searchNumber+" is found at "+result+" index");	// message shows the index on which the number is found
				}
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			sc.close();
		}
	}
}
	
class LinearSearchClass
{
	
	/* this recursive method takes itemArray[] and searchNumebr as input and returns the index at which the searchNumber
	 is found in the itemArray and returns -1 if the number is not found*/
	public int linearSearch(int[] itemArray, int searchNumber, int count)
	{
		/*Exception Handling for the Exceptions that may generat*/
		try
		{
			if(searchNumber == itemArray[count])	// Comparing the searchNumber with each element of itemArray until found
			{
				return count;				// this statement returns the index of itemArray at which the searchNumber is found in the array
			}
			else
			{
				count++;				
				return linearSearch(itemArray, searchNumber, count);	//recursive calling of method
			}
		}
		catch(Exception e)			
		{
			return -1;			
		}
	}

}
