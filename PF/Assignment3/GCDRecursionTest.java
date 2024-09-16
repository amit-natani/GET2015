import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GCDRecursionTest {

	
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
			GCDClass GCDTestObj=new GCDClass();
			assertEquals("", 2, GCDTestObj.gcd(2, 2));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
	
	@Test
	public void negativeTestCase() {
		try
		{
			GCDClass GCDTestObj=new GCDClass();
			assertEquals("", -1, GCDTestObj.gcd(98, -1));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}

	}
}
