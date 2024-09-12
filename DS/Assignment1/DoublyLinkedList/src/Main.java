import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner scan = null;
		try
		{
			int choice, location, item;
			scan = new Scanner(System.in);
			DoublyLinkedList list = new DoublyLinkedList();
			do
			{
				System.out.print("\n 1. Add Element at First"
								+"\n 2. Add Element at locationation"
								+"\n 3. Removal of an item based on its value "
								+"\n 4. Removal of an item based on its index"
								+"\n 5. Retrieval of an item of particular index"
								+"\n 6. Reversal of linked list"
								+"\n 7. Sorting of linked list"
								+"\n 8. Display linked list"
								+"\n 9. Exit");
				System.out.print("\n Enter Your choice : ");
				do {// Validation
					System.out.println("Enter Positive Number");
					while (!scan.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					scan.next(); // this is important!
					}
					choice = scan.nextInt();
					} while (choice <= 0);
				switch(choice)
				{
					/* Case to enter a node at start */	
					case 1:
						System.out.print("\n Enter node value : ");
						
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							
							item = scan.nextInt();
						list.addAtFirst(item); 
						break;
						
						/* case to enter a node at specific location */
					case 2:
						System.out.print("\n Enter node value : ");
						while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							
							item = scan.nextInt();
						System.out.print("\n Enter locationation : ");
						do {// Validation
							System.out.println("Enter Positive Number");
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							location = scan.nextInt();
							} while (location < 0);
						list.addAtLocation(location, item); 
						break;
						
						/* case to remove a node */
					case 3:
						System.out.print("\n Enter node value : ");
						while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							
							item = scan.nextInt();
						list.remove(item); 
						break;
						
						/* case to remove a node at specified index */
					case 4:
						System.out.print("\n Enter locationation : ");
						do {// Validation
							System.out.println("Enter Positive Number");
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							location = scan.nextInt();
							} while (location < 0);
						list.removeAtIndex(location); 
						break;
						
						/* case to retrieve an element at specidied index */
					case 5:
						System.out.print("\n Enter locationation : ");
						do {// Validation
							System.out.println("Enter Positive Number");
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							location = scan.nextInt();
							} while (location < 0);
						list.retrievel(location); 
						break;
						
						/* case to reverse the linked list */
					case 6:
						list.reverse(); 
						break;
						 /* case to sort the linked list */
					case 7:
						list.sort(); 
						break;
						
						/* case to display the linked list */
					case 8:
						list.display(); 
						break;
						 /* exit case */
					case 9:
						System.exit(0);
						
					default:
						System.out.println("Enter right choice");
				}
				System.out.println("Press 1 to continue and any other number to exit");
				do {// Validation
					System.out.println("Enter Positive Number");
					while (!scan.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					scan.next(); // this is important!
					}
					choice = scan.nextInt();
					} while (choice < 0);
				
			}while(choice == 1);
			System.out.println("System.exited");
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}
