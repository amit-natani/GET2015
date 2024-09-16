import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class UniqueCounterTest {

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
	public void testUniqueCounterPositive() {
		
		UniqueCounter uniqueCounterObj = new UniqueCounter();
		int actual = uniqueCounterObj.countUniqueCharacters("anght4@ddasd");
		int expected = 9;
		assertEquals(expected, actual);
	}

	@Test
	public void testUniqueCounterNegative() {
		
		UniqueCounter uniqueCounterObj = new UniqueCounter();
		int actual = uniqueCounterObj.countUniqueCharacters("anght4@ddasd");
		int expected = 8;
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testUniqueCounterNullStringPositive() {
		
		UniqueCounter uniqueCounterObj = new UniqueCounter();
		int actual = uniqueCounterObj.countUniqueCharacters(null);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void testUniqueCounterNullStringNegative() {
		
		UniqueCounter uniqueCounterObj = new UniqueCounter();
		int actual = uniqueCounterObj.countUniqueCharacters(null);
		int expected = 1;
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testUniqueCounterEmptyStringPositive() {
		
		UniqueCounter uniqueCounterObj = new UniqueCounter();
		int actual = uniqueCounterObj.countUniqueCharacters("");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testUniqueCounterEmptyStringNegative() {
		
		UniqueCounter uniqueCounterObj = new UniqueCounter();
		int actual = uniqueCounterObj.countUniqueCharacters("");
		int expected = 1;
		assertNotEquals(expected, actual);
	}
}
