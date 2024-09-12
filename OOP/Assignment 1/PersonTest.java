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
public class PersonTest {

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

	/* tast case for getUid() */
	@Test
	public void getUidTest() {
		
		Person personObj = new Person(23456789, "Amit");
		assertEquals("",23456789, personObj.getUid());
	}
	
	/* tast case for getName() */
	@Test
	public void getNameTest() {
		
		Person personObj = new Person(23456789, "Amit");
		assertEquals("", "Amit", personObj.getName());
	}
	
	/* tast case for toString() */
	@Test
	public void toStringTest() {
		
		Person personObj = new Person(23456789, "Amit");
		assertEquals("", "Name: "+personObj.getName()+", uid: "+personObj.getUid() , personObj.toString());
	}
}
