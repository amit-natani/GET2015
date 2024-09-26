import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		/* Initialization */
		TreeSortStudent treeSortStudentObj = null;
		Scanner scan = null;
		try
		{
			/*Instantiation */
			treeSortStudentObj = new TreeSortStudent();
			scan = new Scanner(System.in);
			
			/* numberOfStudents holds total number of students */
			int numberOfStudents;
			System.out.println("Enter number of students in class: ");
			do {// Validation
				System.out.println("(Enter Positive integer greater than zero)");
				while (!scan.hasNextInt()) {
				System.out.println("That's not a number!Please enter again");
				scan.next(); 
				}
				numberOfStudents = scan.nextInt();
				} while (numberOfStudents <= 0);
			
			int rollNumber;
			
			/* Inputting roll number of students using for loop
			 * roll number must be unique and less than total number
			 * of students
			 */
			for(int i = 0; i < numberOfStudents;) {
				System.out.println("Enter Roll Number of Student " + (i+1));
				do {// Validation
					System.out.println("Roll Number must be valid (should"
							+ " not be greater than number of students)");
					while (!scan.hasNextInt()) {
					System.out.println("That's not a number!Please enter again");
					scan.next(); 
					}
					rollNumber = scan.nextInt();
				} while (rollNumber <= 0 || rollNumber > numberOfStudents);
				
				/* Adding roll number to the tree 
				 * if result contains 0, then roll number is successfully added to tree
				 * and if roll number is repeated then result will contain -1
				 * and roll number will not be added in that case
				 */
				int result = treeSortStudentObj.insert(rollNumber);
				if(result == 0)
					i++;
				else 
					System.out.println("Roll Number already Exists");
			}
			
			/* Trversing inorder the tree to get roll numbers in ascending order */
			treeSortStudentObj.inorder(treeSortStudentObj.getRoot());
			System.out.println("Roll number in ascending order are : ");
			
			/* Printing roll numbers in ascending order */
			System.out.println(treeSortStudentObj.getRollNumberListSorted());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			scan.close();
		}
	}
}