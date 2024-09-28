import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

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

	/** positive test case */
	@Test
	public void testLeftmost() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{1, 2, 2, 3, 3}, 3, 1);
		assertEquals("", 3, result);
	}
	
	/** Posotive test case with negative numbers in array */
	@Test
	public void testLeftmost2() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{-2, -1, 0, 0, 0, 3, 3}, 0, 1);
		assertEquals("", 2, result);
	}
	
	/** Positive test case with non existance of searchNumber in the array */
	@Test
	public void testLeftMost3() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{1, 2, 2, 3, 3}, 5, 1);
		assertEquals("", -1, result);
	}
	
	/** Negative test case */
	@Test
	public void testLeftMost4() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{1,2,2,3,3,4,4,5,5,5,5,6,6,6,6,6}, 6, 1);
		assertNotEquals("", 12, result);
	}
	
	/** Negative test case with negative numbers in array */
	@Test
	public void testLeftMost5() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{-1,-2,-2,-3,3,4,4,5,5,5,5,6,6,6,6,6}, 4, 1);
		assertNotEquals("", 8, result);
	}
	
	/** Positive test case with null array */
	@Test
	public void testLeftMost6() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(null, 5, 1);
		assertEquals("", -1, result);
	}
	
	/** Positive test case with empty array */
	@Test
	public void testLeftMost7() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{}, 6, 1);
		assertEquals("", -1, result);
	}
	
	/** Negative test case with non existance of searchNumber in the array */
	@Test
	public void testLeftMost8() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{-4,-4,-3,-3,-3,-3,-1, 0, 4 ,4}, -2, 1);
		assertNotEquals("", 6, result);
	}
	
	/** Negative test case with null array */
	@Test
	public void testLeftMost9() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(null, 5, 1);
		assertNotEquals("", 2, result);
	}
	
	/** Negative test case with empty array */
	@Test
	public void testLeftMost10() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{}, 6, 1);
		assertNotEquals("", 4, result);
	}
	
	/** positive test case */
	@Test
	public void testRightmost() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{1, 2, 2, 3, 3}, 3, 2);
		assertEquals("", 4, result);
	}
	
	/** Positive test case with negative numbers in array */
	@Test
	public void testRightmost2() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{-2, -1, 0, 0, 0, 3, 3}, 0, 2);
		assertEquals("", 4, result);
	}
	
	/** Positive test case with non existance of searchNumber in the array */
	@Test
	public void testRightMost3() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{1, 2, 2, 3, 3}, 5, 2);
		assertEquals("", -1, result);
	}
	
	/** Negative test case */
	@Test
	public void testRightMost4() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{1,2,2,3,3,4,4,5,5,5,5,6,6,6,6,6}, 6, 2);
		assertNotEquals("", 4, result);
	}
	
	/** Negative test case with negative numbers in array */
	@Test
	public void testRightMost5() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{-1,-2,-2,-3,3,4,4,5,5,5,5,6,6,6,6,6}, 4, 2);
		assertNotEquals("", 4, result);
	}
	
	/** Positive test case with null array */
	@Test
	public void testRightMost6() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(null, 5, 2);
		assertEquals("", -1, result);
	}
	
	/** Positive test case with empty array */
	@Test
	public void testRightMost7() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{}, 6, 2);
		assertEquals("", -1, result);
	}
	
	/** Negative test case with non existance of searchNumber in the array */
	@Test
	public void testRightMost8() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{-4,-4,-3,-3,-3,-3,-1, 0, 4 ,4}, -2, 2);
		assertNotEquals("", 6, result);
	}
	
	/** Negative test case with null array */
	@Test
	public void testRightMost9() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(null, 5, 2);
		assertNotEquals("", 2, result);
	}
	
	/** Negative test case with empty array */
	@Test
	public void testRightMost10() {
		BinarySearch binarySearchObj=new BinarySearch();
		int result = binarySearchObj.getOccurrenceIndex(new int[]{}, 6, 2);
		assertNotEquals("", 4, result);
	}
}
