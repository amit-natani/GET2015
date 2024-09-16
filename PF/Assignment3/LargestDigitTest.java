import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LargestDigitTest {


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
	public void positiveTestCase() {
		try
		{
			LargestDigitClass LargestDigitTestObj=new LargestDigitClass();
			assertEquals("",2,LargestDigitTestObj.largestdigit(2, 0));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
	
	@Test
	public void testCaseForZero() {
		try
		{
			LargestDigitClass LargestDigitTestObj=new LargestDigitClass();
			assertEquals("", 0, LargestDigitTestObj.largestdigit(000000, 0));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
	
	@Test
	public void NegativeNumberTestCase() {
		try
		{
			LargestDigitClass LargestDigitTestObj=new LargestDigitClass();
			assertEquals("", 8, LargestDigitTestObj.largestdigit(-5787464, 0));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}

}
