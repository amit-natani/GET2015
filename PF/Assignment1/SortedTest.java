import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortedTest {

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
	public void testAscending() {
		Sorted test1=new Sorted();
		int output=test1.checkSorted(new int[]{1,2,3,4,5,6,7,8,9});
		assertEquals("",1,output);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testUnsorted() {
		Sorted test1=new Sorted();
		int output=test1.checkSorted(new int[]{1,2,3,9,4,5,6,7,8,9});
		assertEquals("",0,output);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDescending() {
		Sorted test1=new Sorted();
		int output=test1.checkSorted(new int[]{9,8,7,6,5,4,3,2,1});
		assertEquals("",2,output);
		//fail("Not yet implemented");
	}

}
