import java.util.Arrays;
import java.util.Scanner;


public class MainBinarySearch {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		Scanner sc = null;
		try
		{
			/* Initialization */
			sc=new Scanner(System.in);				
			BinarySearch binarySearchObj=new BinarySearch();			
			int numberOfElements=0, result, searchNumber, choice;			
			do
			{
				System.out.println("Enter No of Elements: ");	
				/* Inputting numberof elements */
				do
				{
					System.out.println("(Enter Positive Integer(>0)");
					while(!sc.hasNextInt()) {
						System.out.println("Enter Integer only");
						sc.next();
					}
					numberOfElements = sc.nextInt();
				} while(numberOfElements <= 0);
				
				/* itemArray is array of numbers */
				int[] itemArray = new int[numberOfElements];			
				System.out.println("Enter elements of Array: ");
				
				/* for loop to insert elemets in itemArray */
				for(int i=0; i < numberOfElements; i++)
				{
					while(!sc.hasNextInt()) {
						System.out.println("Enter Integer only");
						sc.next();
					}
					itemArray[i] = sc.nextInt();					
				}
				
				/* Sorting the itemArray */
				Arrays.sort(itemArray);
				System.out.println("Enter number to be searched: ");
				
				/* Inputting the number to be searched */
				while(!sc.hasNextInt()) {
					System.out.println("Enter Integer only");
					sc.next();
				}
				searchNumber=sc.nextInt();							
				System.out.println("Enter Choice: ");
				System.out.println("1. Leftmost occurence");
				System.out.println("2. Rightmost occurence");
				/* Inputting choice of user */
				do
				{
					System.out.println("(Enter Positive Integer(>0 and <4)");
					while(!sc.hasNextInt()) {
						System.out.println("Enter Integer only");
						sc.next();
					}
					choice = sc.nextInt();
				} while(choice <= 0 || choice >= 3);

						
				/* result will contain leftmost or rightmost occurrence index of the searchNumber according to user's choice, -1 if not found */
				result = binarySearchObj.getOccurrenceIndex(itemArray, searchNumber, choice);	
				
				/* condition to check whether the result is -1 or not, if result is -1, 
				 * then number is not found in the list */
				if(result == -1) {
					System.out.println(searchNumber+" is not found in the list");	
				}
				
				/* If result is not -1, and choice was 1, then it will hold leftmost index of the searchNumber */ 
				else if(choice == 1) {
					System.out.println("Leftmost occurence of "+searchNumber+" is "+result+" index");	
				}
				
				/* If result is not -1, and choice was 2, then it will hold rightmost index of the searchNumber */ 
				else {
					System.out.println("Rightmost occurence of "+searchNumber+" is "+result+" index");	
				}

			} while(true);
		}
		catch(Exception e)
		{
			sc.close();
			System.out.println(e.getMessage());
		}
	}
}
