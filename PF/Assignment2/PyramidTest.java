import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PyramidTest {
	Pyramid objTest=new Pyramid();
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
	public void testSpace() {
		String actualResult=objTest.space(3, 5);
		assertEquals("  ",actualResult);
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testNumber() {
		String actualResult=objTest.number(3, 5);
		assertEquals("12321",actualResult);
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testprintWholePyramid() {
		
		String expected[]={"    1", "   121", "  12321", " 1234321", "123454321", " 1234321", "  12321",  "   121", "    1"};
		String actualResult[]=objTest.printWholePyramid(5);
		assertArrayEquals(expected,actualResult);
		
		//fail("Not yet implemented");
	}

}
