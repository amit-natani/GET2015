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

	@Test
	public void negativeTestCase() 
	{
		try
		{
			BinarySearchClass binarySearchTestObj=new BinarySearchClass();
			assertEquals("",-1, binarySearchTestObj.binarySearch(new int[]{2,5,8,9,10,55,77}, 88, 0, 6));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
	
	@Test
	public void positiveTestCase() {
		try
		{
			BinarySearchClass binarySearchTestObj=new BinarySearchClass();
			assertEquals("",6, binarySearchTestObj.binarySearch(new int[]{2,5,8,9,10,55,77}, 77, 0, 6));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
	
	@Test
	public void nullArrayTestCase() {
		try
		{
			BinarySearchClass binarySearchTestObj=new BinarySearchClass();
			assertEquals("",-1, binarySearchTestObj.binarySearch(new int[]{}, 77, 0, 0));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
}
