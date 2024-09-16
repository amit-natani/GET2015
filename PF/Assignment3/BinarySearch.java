/**
 @Program: To search a number in an array using Binary Search
 @Date: 10/08/2015
 */

/**
 * @author Amit
 *
 */
import java.util.*;								// Package imported to use Scanner class
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 /* Initialization */
		Scanner sc = null;
		try
		{
			sc=new Scanner(System.in);				
			BinarySearchClass binarySearchObj=new BinarySearchClass();			
			int noOfElements=0, result, searchNumber;			
			System.out.println("Enter No of Elements: ");	
			noOfElements = sc.nextInt();
			if(noOfElements<=0)
			{
				System.out.println("No of Elements should be Positive(>0)");	// This message will be printed if the no of elements is zero or negative
			}
			else
			{	 
				int[] itemArray = new int[noOfElements];			// Array creation with size = noOFElements
				System.out.println("Enter elements of Array: ");
				for(int i=0; i < noOfElements; i++)
				{
					itemArray[i] = sc.nextInt();					// input elements of array using Scanner class object sc
				}
				System.out.println("Enter number to be searched: ");
				searchNumber=sc.nextInt();							// input a number to be searched
				
				/*	method invocation with parameters itemArray, searchNumber, min index and max index */
				result = binarySearchObj.binarySearch(itemArray, searchNumber, 0, noOfElements-1);	
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
			sc.close();
			System.out.println(e.getMessage());
		}
	}
}
class BinarySearchClass
{
	/* this recursive method takes itemArray[], searchNumebr, min index and max index as input and returns the index at which the searchNumber
	 is found in the itemArray and returns -1 if the number is not found*/
	public int binarySearch(int[] itemArray, int searchNumber, int min, int max)
	{
		if(max<min)
			return -1;		// return -1 if value of max is less than value of min

		int mid = (max + min) / 2;			// calculate mid index value 

		try
		{
			if(searchNumber == itemArray[mid])		
				return mid;			// return value of mid if searchNumber and the item at mid index of itemArray are equal
			
			else if(searchNumber < itemArray[mid])																						
				return binarySearch(itemArray, searchNumber, min, mid-1);	
																			
			else															
				return binarySearch(itemArray, searchNumber, mid+1, max);	

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return -1;
		}
	}
}															

