import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StudentSortingTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	/** Test case to test method inorder() */
	@Test
	public void inorderTestPositiveCase() {
		
		int numberOfStudents = 10;
		List<Integer> sortedListExpected = new ArrayList<Integer>();
		for(int i = 0; i < numberOfStudents; i++) {
			sortedListExpected.add(i+1);
		}
		TreeSortStudent treeSortStudentObj = new TreeSortStudent();
		treeSortStudentObj.insert(10);
		treeSortStudentObj.insert(9);
		treeSortStudentObj.insert(8);
		treeSortStudentObj.insert(7);
		treeSortStudentObj.insert(6);
		treeSortStudentObj.insert(5);
		treeSortStudentObj.insert(4);
		treeSortStudentObj.insert(3);
		treeSortStudentObj.insert(2);
		treeSortStudentObj.insert(1);
		treeSortStudentObj.inorder(treeSortStudentObj.getRoot());
		assertEquals(sortedListExpected, treeSortStudentObj.getRollNumberListSorted());
		
	}
	
	/** Test case to test method inorder() */
	@Test
	public void inorderTestNegativeCase() {
		
		int numberOfStudents = 10;
		List<Integer> sortedListExpected = new ArrayList<Integer>();
		for(int i = 0; i < numberOfStudents; i++) {
			sortedListExpected.add(i);
		}
		TreeSortStudent treeSortStudentObj = new TreeSortStudent();
		treeSortStudentObj.insert(10);
		treeSortStudentObj.insert(9);
		treeSortStudentObj.insert(8);
		treeSortStudentObj.insert(7);
		treeSortStudentObj.insert(6);
		treeSortStudentObj.insert(5);
		treeSortStudentObj.insert(4);
		treeSortStudentObj.insert(3);
		treeSortStudentObj.insert(2);
		treeSortStudentObj.insert(1);
		treeSortStudentObj.inorder(treeSortStudentObj.getRoot());
		assertNotEquals(sortedListExpected, treeSortStudentObj.getRollNumberListSorted());
		
	}
	
	/** Test case to test method inorder() if tree is null*/
	@Test
	public void inorderNullTestPositove() {
		
		TreeSortStudent treeSortStudentObj = new TreeSortStudent();
		assertEquals(null, treeSortStudentObj.inorder(treeSortStudentObj.getRoot()));
		
	}
	
	/** Test case to test method inorder() if tree is null*/
	@Test
	public void inorderNullTestNegative() {
		
		TreeSortStudent treeSortStudentObj = new TreeSortStudent();
		assertNotEquals(0, treeSortStudentObj.inorder(treeSortStudentObj.getRoot()));
		
	}
	
	/** Test case to test method insert if item not inserted */
	@Test
	public void insertFailedTestPositive() {
		
		TreeSortStudent treeSortStudentObj = new TreeSortStudent();
		treeSortStudentObj.insert(10);
		assertEquals(-1, treeSortStudentObj.insert(10));
		
	}
	
	/** Test case to test method insert if item not inserted */
	@Test
	public void insertFailedTestNegative() {
		
		TreeSortStudent treeSortStudentObj = new TreeSortStudent();
		treeSortStudentObj.insert(10);
		assertNotEquals(6, treeSortStudentObj.insert(10));
		
	}
	
	/** Test case to test method insert if item is inserted */
	@Test
	public void insertDoneTestPositive() {
		
		TreeSortStudent treeSortStudentObj = new TreeSortStudent();
		treeSortStudentObj.insert(10);
		assertEquals(0, treeSortStudentObj.insert(9));
		
	}
	
	/** Test case to test method insert if item is inserted */
	@Test
	public void insertDoneTestNegative() {
		
		TreeSortStudent treeSortStudentObj = new TreeSortStudent();
		treeSortStudentObj.insert(10);
		assertNotEquals(-1, treeSortStudentObj.insert(9));
		
	}

}
