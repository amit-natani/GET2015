import com.metacube.jdbc.helper.Helper;

public class Main {

	public static void main(String args[]) {

		int numberOfBooksDeleted = Helper.deleteBooks();
		System.out.println("Number of books deleted are : "+numberOfBooksDeleted);
	}
}
