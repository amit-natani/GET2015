import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortingSystemTest {

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

	@Test
	public void quickSortTest() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {32, 34, 54, 67, 21, -45, 76, 45, 43, 12, 43};
		int[] expextedSortedArray = {-45, 12, 21, 32, 34, 43, 43, 45, 54, 67, 76};
		assertArrayEquals(expextedSortedArray, sortingSystemObj.quickSort(inputArray, 0, (inputArray.length - 1)));
	}
	
	@Test
	public void quickSortTestEmptyArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {};
		assertArrayEquals(null, sortingSystemObj.quickSort(inputArray, 0, (inputArray.length - 1)));
	}
	
	@Test
	public void quickSortTestNullArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = null;
		assertArrayEquals(null, sortingSystemObj.quickSort(inputArray, 0, 0));
	}
	
	@Test
	public void bubbleSortTest() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {32, 34, -54, 67, 0, 45, 76, 45, 43, 12};
		int[] expextedSortedArray = {-54, 0, 12, 32, 34, 43, 45, 45, 67, 76};
		assertArrayEquals(expextedSortedArray, sortingSystemObj.bubbleSort(inputArray));
	}
	
	@Test
	public void bubbleSortTestEmptyArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {};
		assertArrayEquals(null, sortingSystemObj.bubbleSort(inputArray));
	}
	
	@Test
	public void bubbleSortTestNullArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = null;
		assertArrayEquals(null, sortingSystemObj.bubbleSort(inputArray));
	}
	
	@Test
	public void radixSortTest() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {132, 334, 554, 670, 21, 45, 7, 456, 0, 123, 43};
		int[] expextedSortedArray = {0, 7, 21, 43, 45, 123, 132, 334, 456, 554, 670};
		assertArrayEquals(expextedSortedArray, sortingSystemObj.radixSort(inputArray));
	}
	
	@Test
	public void radixSortTestEmptyArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {};
		assertArrayEquals(null, sortingSystemObj.radixSort(inputArray));
	}
	
	@Test
	public void radixSortTestNullArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = null;
		assertArrayEquals(null, sortingSystemObj.radixSort(inputArray));
	}
	
	@Test
	public void radixSortTestNegativeData() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {132, 334, -554, 670, 21, 45, 7, 456, 0, 123, 43};
		assertArrayEquals(null, sortingSystemObj.radixSort(inputArray));
	}
	
	@Test
	public void countingSortTest() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {32, 34, 54, 67, 21, 45, 76, 45, 43, 12, 43};
		int[] expextedSortedArray = {12, 21, 32, 34, 43, 43, 45, 45, 54, 67, 76};
		assertArrayEquals(expextedSortedArray, sortingSystemObj.countingSort(inputArray));
	}

	@Test
	public void countingSortTestEmptyArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {};
		assertArrayEquals(null, sortingSystemObj.countingSort(inputArray));
	}

	@Test
	public void countingSortTestNullArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = null;
		assertArrayEquals(null, sortingSystemObj.countingSort(inputArray));
	}
	
	@Test
	public void countingSortTestNegativeData() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {32, 34, 54, 67, -21, 45, 76, 45, 43, 12, 43};
		assertArrayEquals(null, sortingSystemObj.countingSort(inputArray));
	}
	
	@Test
	public void findMaxTest() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {32, 34, 54, 67, 21, 45, 76, 45, 43, 12, 43};
		assertEquals(76, sortingSystemObj.findMax(inputArray));
	}

	@Test
	public void findMaxTestEmptyArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = {};
		assertEquals(-1, sortingSystemObj.findMax(inputArray));
	}

	@Test
	public void findMaxTestNullArray() {
		
		SortingSystem sortingSystemObj = new SortingSystem();
		int[] inputArray = null;
		assertEquals(-1, sortingSystemObj.findMax(inputArray));
	}
}
