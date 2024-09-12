import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		LinkedList<Integer> object = new LinkedList<Integer>();
		int index, repeatChoice;
		int input;
		int choice;
		Scanner scan = null;
		Node<Integer> second = null;
		int firstNode, secondNode;
		try
		{
			
			scan = new Scanner(System.in);
			do
			{
				System.out.println("Press 1 to create the list");
				System.out.println("Press 2 to insert a node");
				System.out.println("press 3 to delete a node from specified index");
				System.out.println("Press 4 to show the list");
				System.out.println("Press 5 to retrive a node from specified index");
				System.out.println("Press 6 to reverse the linked list");
				System.out.println("Press 7 to remove an item");
				System.out.println("Press 8 to sort");
				System.out.println("press 9 to exit");
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
					case 1:
						System.out.println("Enter two numbers to create a linked list");
						while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							firstNode = scan.nextInt();
						while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							secondNode = scan.nextInt();
						second = object.createLinkedList(firstNode, secondNode);
						if(second == null)
							System.out.println("Linked List is not created Successfully");
						else
							object.numberOfElements = object.numberOfElements + 2;
						break;
					
					case 2:
						System.out.println("Enter a number to be inserted");
						while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							input = scan.nextInt();
						System.out.println("Enter position at which the number to be inserted");
						do {// Validation
							System.out.println("Enter Positive Number");
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							index = scan.nextInt();
							} while (index < 0);
						second = object.insertAtPosition(index, input, second);
						if(second == null)
							System.out.println("Linked List is not created yet");
						else
							object.numberOfElements = object.numberOfElements + 1;
						break;
						
					case 3:
						System.out.println("Enter position of number to be deleted");
						do {// Validation
							System.out.println("Enter Positive Number");
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							index = scan.nextInt();
							} while (index < 0);
						second = object.deleteAtIndex(index, second);
						if(second == null)
							System.out.println("Linked List is not created yet");
						else
							object.numberOfElements = object.numberOfElements - 1;
						break;
						
					case 4:
						object.display(second);
						break;
						
					case 5:
						System.out.println("Enter position of number to be retrieved");
						do {// Validation
							System.out.println("Enter Positive Number");
							while (!scan.hasNextInt()) {
							System.out.println("That's not a number!Please enter again");
							scan.next(); // this is important!
							}
							index = scan.nextInt();
							} while (index <= 0);
						int retrievedNumber = object.retrieveAtPosition(index, second);
						System.out.println("Retrived Element: "+retrievedNumber);
						break;
						
					case 6:
						second = object.reverseLinkedList(second);
						break;
						
					case 7:
						second = object.remove(12, second);
						break;
						
					case 8:
						second = object.sort(second);
						break;
						
					case 9:
						System.out.println("System Exited");
						System.exit(0);
						
					default:
						System.out.println("Enter Correct Choice");
							
				}
				System.out.println("Press 1 to continue and any other number to exit");
				do {// Validation
					System.out.println("Enter Positive Number");
					while (!scan.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					scan.next(); // this is important!
					}
					repeatChoice = scan.nextInt();
					} while (repeatChoice <= 0);
			} while(repeatChoice == 1);
			
			System.out.println("System Exited");
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
