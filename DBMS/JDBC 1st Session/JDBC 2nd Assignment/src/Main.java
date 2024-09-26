import com.metacube.jdbc.helper.Helper;

/**
 * @author Amit
 */

public class Main {

	public static void main(String args[]){
		
		String bookName = "Basics of C";
		String memberName = "Amit Natani";
		/* flag indicates whether the book has been issued or not */
		boolean flag = Helper.issueBook(bookName, memberName);
		if(flag == false)
			System.out.println("Book has been issued successfully");
		else
			System.out.println("Book is not issued");
	}
}
