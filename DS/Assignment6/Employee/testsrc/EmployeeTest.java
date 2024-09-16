import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class EmployeeTest {

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
	public void equalsTestPositive() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		Employee employeeObj2 = new Employee(102, "Sanjay", "Adarsh Nagar");
		boolean result = employeeObj1.equals(employeeObj2);
		assertEquals(true, result);
	}
	
	@Test
	public void equalsTestNegative() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		Employee employeeObj2 = new Employee(102, "Sanjay", "Adarsh Nagar");
		boolean result = employeeObj1.equals(employeeObj2);
		assertNotEquals(false, result);
	}

	@Test
	public void equalsTestNullPositive() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		Employee employeeObj2 = null;
		boolean result = employeeObj1.equals(employeeObj2);
		assertEquals(false, result);
	}
	
	@Test
	public void equalsTestNullNegative() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		Employee employeeObj2 = null;
		boolean result = employeeObj1.equals(employeeObj2);
		assertNotEquals(true, result);
	}
	
	@Test
	public void equalsTestSameObjectPositive() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		boolean result = employeeObj1.equals(employeeObj1);
		assertEquals(true, result);
	}
	
	@Test
	public void equalsTestSameObjectNegative() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		boolean result = employeeObj1.equals(employeeObj1);
		assertNotEquals(false, result);
	}
	@Test
	public void comapreToTestPositive() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		Employee employeeObj2 = new Employee(102, "Sanjay", "Adarsh Nagar");
		int result = employeeObj1.compareTo(employeeObj2);
		assertEquals(0, result);
	}
	
	@Test
	public void comapreToTestNegative() {
		Employee employeeObj1 = new Employee(102, "Amit", "Jhotwara");
		Employee employeeObj2 = new Employee(102, "Amit", "Adarsh Nagar");
		int result = employeeObj1.compareTo(employeeObj2);
		assertNotEquals(1, result);
	}

	@Test
	public void comapreToTestNullPositive() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		Employee employeeObj2 = null;
		int result = employeeObj1.compareTo(employeeObj2);
		assertEquals(-1, result);
	}
	
	@Test
	public void comapreToTestNullNegative() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		Employee employeeObj2 = null;
		int result = employeeObj1.compareTo(employeeObj2);
		assertNotEquals(0, result);
	}
	
	@Test
	public void comapreToSameObjectPositive() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		int result = employeeObj1.compareTo(employeeObj1);
		assertEquals(0, result);
	}
	
	@Test
	public void comapreToTestSameObjectNegative() {
		Employee employeeObj1 = new Employee(102, "Sanjay", "Adarsh Nagar");
		int result = employeeObj1.compareTo(employeeObj1);
		assertNotEquals(1, result);
	}


}
