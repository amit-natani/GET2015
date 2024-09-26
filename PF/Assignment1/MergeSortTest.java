import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MergeSortTest {

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
	public void test() {
		MergeSort test1=new MergeSort();
		int c[]=new int[10];;
		c=test1.join(new int[]{1,2,3,9,10},5,new int[]{4,5,6,7,8},5,c);
		assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10},c);
		
		//fail("Not yet implemented");
	}

}
