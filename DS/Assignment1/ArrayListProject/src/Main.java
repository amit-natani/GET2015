import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) {
		
		/*Initialization*/ 
		Scanner sc = null;
		int choice = 0, number, resultIndex, index, repeatChoice = 0;
		boolean result;
		ArrayList arrayListObj = new ArrayList();
		try
		{
			do
			{
				sc = new Scanner(System.in);
				
				/* Printing Menu */
				System.out.println("Menu: ");
				System.out.println("Press 1 to add a number to the list");
				System.out.println("Press 2 to add item at an specified index");
				System.out.println("Press 3 to find the first occurence of an element after given index");
				System.out.println("Press 4 to find the first index of a element in the list");
				System.out.println("Press 5 to remove an element by index value");
				System.out.println("Press 6 tp remove an element by element value");
				System.out.println("Press 7 to sort the list");
				System.out.println("Press 8 to reverse the list");
				System.out.println("Press 9 to show the list");
				System.out.println("Press 10 to clear the List");
				System.out.println("Press 11 to merge two lists");
				System.out.println("Press 12 to exit");
				
				do {// Validation
					System.out.println("(Enter Positive Number)");
					while (!sc.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					sc.next(); // this is important!
					}
					choice = sc.nextInt();
					} while (choice <= 0);
				switch(choice)
				{
					/* Case for adding an element to the list */
					case 1:
						System.out.println("Enter number to insert in the list: ");
						do {// Validation
							System.out.println("(Enter Positive Number)");
							while (!sc.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							sc.next(); // this is important!
							}
							number = sc.nextInt();
							} while (number < 0);
						result = arrayListObj.addItem(number);
						if(result)
							System.out.println("Number added Successfully");
						else
							System.out.println("Number is not added Successsfully");
						break;
						
						/* Case for adding an element to the list at specified index */
					case 2:
						System.out.println("Enter Number to insert in the list: ");
						do {// Validation
							System.out.println("(Enter Positive Number)");
							while (!sc.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							sc.next(); // this is important!
							}
							number = sc.nextInt();
							} while (number < 0);
						System.out.println("Enter index at which you want to insert the number: ");
						do {// Validation
							System.out.println("(Enter Positive Number)");
							while (!sc.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							sc.next(); // this is important!
							}
							index = sc.nextInt();
							} while (index < 0);
						result = arrayListObj.addItem(number, index);
						if(result)
							System.out.println("Number added Successfully");
						else
							System.out.println("Number is not added Successsfully");
						break;
						
						/* case for find first occurrence of an element after specified index */
					case 3:
						System.out.println("Enter the number whose first occurence to be searched: ");
						do {// Validation
							System.out.println("(Enter Positive Number)");
							while (!sc.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							sc.next(); // this is important!
							}
							number = sc.nextInt();
							} while (number < 0);
						System.out.println("Enter the index value after which number to be searched: ");
						do {// Validation
							System.out.println("(Enter Positive Number)");
							while (!sc.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							sc.next(); // this is important!
							}
							index = sc.nextInt();
							} while (index < 0);
						resultIndex = arrayListObj.firstOcccurence(number, index);
						if(resultIndex >= 0)
							System.out.println("Number is found in the list at index "+resultIndex);
						else if(resultIndex == -2)
							System.out.println("Some Problem Occurred");
						else
							System.out.println("Numebr is not found in the list");
						break;
						
						/* case for find first occurrence of an element */
					case 4:
						System.out.println("Enter the number whose first index to be searched: ");
						do {// Validation
							System.out.println("(Enter Positive Number)");
							while (!sc.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							sc.next(); // this is important!
							}
							number = sc.nextInt();
							} while (number < 0);
						resultIndex = arrayListObj.firstIndex(number);
						if(resultIndex >= 0)
							System.out.println("Number is found in the list at Index "+resultIndex);
						else if(resultIndex == -2)
							System.out.println("Some Problem Occurred");
						else
							System.out.println("Numebr is not found in the list");
						break;
						
						/* case for removing a number at particular index*/
					case 5:
						System.out.println("Enter the index value at which the number to be removed: ");
						do {// Validation
							System.out.println("(Enter Positive Number)");
							while (!sc.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							sc.next(); // this is important!
							}
							index = sc.nextInt();
							} while (index < 0);
						result = arrayListObj.removeByIndex(index);
						if(result)
							System.out.println("Number removed Successfully");
						else
							System.out.println("Number is not removed Successsfully");
						break;
						
						/* case of removing a number*/
					case 6:
						System.out.println("Enter the number which is to be removed: ");
						do {// Validation
							System.out.println("(Enter Positive Number)");
							while (!sc.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							sc.next(); // this is important!
							}
							number = sc.nextInt();
							} while (number < 0);
						result = arrayListObj.removeByItem(number);
						if(result)
							System.out.println("Number removed Successfully");
						else
							System.out.println("Number is not removed Successsfully");
						break;
						
						/* case of sorting a list */
					case 7:
						result = arrayListObj.sort();
						if(result)
							System.out.println("list is sorted successfully");
						else
							System.out.println("list is not sorted Successsfully");
						break;
						
						/* case of reversing a list */
					case 8:
						result = arrayListObj.reverse();
						if(result)
							System.out.println("list is reveresed successfully");
						else
							System.out.println("list is not reversed Successsfully");
						break;
						
						/* case of showing a list */
					case 9:
						arrayListObj.show();
						break;
						
						/* case of clearing a list */
					case 10:
						result = arrayListObj.clear();
						if(result)
							System.out.println("list is cleared successfully");
						else
							System.out.println("list is not cleared Successsfully");
						break;
						
						/* case of merging two lists */
					case 11:
						ArrayList arrayListObj2 = new ArrayList();
						System.out.println("Enter Elements of Second List: ");
						while(true)
						{
							System.out.println("Enter Element: (Enter negative number to finish with second list)");
								while (!sc.hasNextInt()) {
								System.out.println("That's not a number!Please enter again");
								sc.next(); // this is important!
								}
								number = sc.nextInt();

							if(number < 0)
								break;
							arrayListObj2.addItem(number);
							
						}
						arrayListObj.merge(arrayListObj2);	
						break;
						
						/* case of exit */
					case 12:
						System.out.println("System Exited");
						System.exit(0);
						break;
						
					default:
						System.out.println("Enter correct Choice");

				} 
				System.out.println("Do you want to continue press 1 for YES and any other number for NO");
	
					System.out.println("Enter Positive Number");
					while (!sc.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					sc.next(); // this is important!
					}
					repeatChoice = sc.nextInt();
					
			} while(repeatChoice == 1);
			
		}
		catch(Exception e)
		{
		}
		if(repeatChoice != 1)
		{
			System.out.println("System Exited");
			System.exit(0);
		}
		sc.close();
	}

}

