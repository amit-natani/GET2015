import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinearSearchTest {

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
	public void negativeTestCase() {
		try
		{
			LinearSearchClass linearSearchTestObj=new LinearSearchClass();
			assertEquals("", -1, linearSearchTestObj.linearSearch(new int[]{2,5,8,9,10,77,55}, 88, 0));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
	
	@Test
	public void tpositiveTestCase() {
		try
		{
			LinearSearchClass linearSearchTestObj=new LinearSearchClass();
			assertEquals("", 5, linearSearchTestObj.linearSearch(new int[]{2,5,8,9,10,77,55,11}, 77, 0));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
	
	@Test
	public void nullArraytestCase() {
		try
		{
			LinearSearchClass linearSearchTestObj=new LinearSearchClass();
			assertEquals("",-1, linearSearchTestObj.linearSearch(new int[]{}, 77, 0));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
	

}
