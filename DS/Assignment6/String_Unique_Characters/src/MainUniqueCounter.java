/**
 * This class creates Objects of class UniqueCounter and
 * invokes methods of that class on behalf of that object
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Amit
 *
 */
public class MainUniqueCounter {

	public static void main(String args[]) {
		
		/* scan will hold an Scanner object
		 * that will be used to take input */
		Scanner scan;
		
		/* bufferedReaderObj will hold object of BufferedRader
		 * that will take a string as input */
		BufferedReader bufferedReaderObj;
		
		String inputString;
		int uniqueCharacters, choice;
		UniqueCounter uniqueCounterObj;
		try
		{
			/* Instantiation */
			scan = new Scanner(System.in);
			uniqueCounterObj = new UniqueCounter();
			bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
			do
			{
				System.out.println("Enter a String: ");
				/* Inputting String through bufferedReaderObj */
				inputString = bufferedReaderObj.readLine();
				
				/* The method countUniqueCharacters will return number of unique characters 
				 * in inputString and stores that in uniqueCharacters
				 */
				uniqueCharacters = uniqueCounterObj.countUniqueCharacters(inputString);
				System.out.println("Number of Unique characters in " +
						inputString+" : " + uniqueCharacters);
				System.out.println("press 1 to continue and any other numebr for exit");
				while(!scan.hasNextInt()) {
					System.out.println("Please Enter a number only");
					scan.next();
				}
				choice = scan.nextInt();
			} while(choice == 1);
			if(choice != 1) {
				scan.close();
				bufferedReaderObj.close();
				System.out.println("System Exit");
				System.exit(0);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
	