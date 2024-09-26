
public class MainSortingSystem {

	public static void main(String[] args) {
		
		/* Initialization */
		SortingSystem sortingSystemObj = null;
		try
		{
			/* Instantiation */
			int numberOfElements, choice, repeatChoice;
			sortingSystemObj = new SortingSystem();
			do
			{
				System.out.println("Enter Number of Elements to be sorted");
				
				/* Inputting number of elements */
				numberOfElements = Validation.isInteger();
				
				/* length of array itemArray will be equal to numberOfElements */
				int[] itemArray = new int[numberOfElements];
				
				/* Inputting Numbers for Sorting */
				for(int i = 0; i < numberOfElements; i++) {
					System.out.println("Enter Number "+(i+1));
					do {
						itemArray[i] = Validation.isInteger();
					} while(itemArray[i] < 0);
				}
				
				/* Taking user's choice whether he wants to sort using comparison sort
				 * or linear Sort
				 */
				System.out.println("Enter choice: ");
				System.out.println("1. Comparison Sorting");
				System.out.println("2. Linear Sorting");
				System.out.println("3. Exit");
				do {
					System.out.println("(Enter positive integer less than 4)");
					choice = Validation.isInteger();
				} while(choice <= 0 || choice >= 4);
				
				/* Switch case based on user's choice */
				switch(choice) {
				 
					/* If choice is 1, then comparison sorting will be performed */
					case 1:
						itemArray = sortingSystemObj.comparisonSorting(itemArray);
						break;
						
					/* If choice is 2, then linear sorting will be performed */
					case 2:
						itemArray = sortingSystemObj.linearSorting(itemArray);
						break;
						
					/* If choice is 3, then system will be closed */
					case 3:
						System.out.println("System Closed");
						System.exit(0);
						break;
					
					/* default Case */
					default:
						System.out.println("Enter Correct Choice");
				}
				
				/* Printing Sorted array */
				System.out.println("Sorted array is: ");
				for(int a: itemArray)
					System.out.println(a);
				System.out.println("Press 1 to continue and any other number to exit");
				repeatChoice = Validation.isInteger();
			} while(repeatChoice == 1);
			
			if(repeatChoice != 1) {
				System.out.println("System Closed");
				System.exit(0);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
