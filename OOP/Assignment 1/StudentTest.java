import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Amit
 *
 */
public class StudentTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getStudentIdTest() {
		
		Student StudentObj = new Student(23456789, "Amit", 101);
		assertEquals("",101, StudentObj.getStudentId());
	}
	
	@Test
	public void toStringTest() {
		
		Student StudentObj = new Student(23456789, "Amit", 101);
		assertEquals("", "Name: "+StudentObj.getName()+", uid: "+StudentObj.getUid() +", StudentId: "+StudentObj.getStudentId(), StudentObj.toString());
	}

}
