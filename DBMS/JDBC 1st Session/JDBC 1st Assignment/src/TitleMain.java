import java.util.Iterator;
import java.util.List;

import com.metacube.jdbc.helper.TitleHelper;
import com.metacube.jdbc.model.Title;

/**
 * @author Amit
 */

public class TitleMain {

	public static void main(String args[]) {
		
		/* authorName holds the name of the author */
		String authorName = "Anurag";
		
		/* Method invocation to get the titles list
		 the returned list will be stored in titlelist */
		List<Title> titleList = TitleHelper.fetchBooks(authorName);
		
		/* If titleLIst is null that means some exception has been occurred */
		if(titleList == null) {
			System.out.println("Some Exception occurred");
			return;
		}
		
		/* If size of titleList is zero, then no books has been published by the author */
		else if(titleList.size() == 0) {
			System.out.println("No books have been published by the author");
			return;
		}
		
		/* If titleList has contain some data */
		else {
			System.out.println("Books Published are");
			
			/* titleListIterator iterates over the titleList */
			Iterator<Title> titleListIterator = titleList.iterator();
			while(titleListIterator.hasNext()) {
				System.out.println(titleListIterator.next().getTitleName());
			}
		}
		System.out.println("\nExiting . . .");
	}
}
