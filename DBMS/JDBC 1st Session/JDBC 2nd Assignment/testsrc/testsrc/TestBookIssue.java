package testsrc;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.jdbc.helper.Helper;

public class TestBookIssue {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIssueBookNullBook() {
		assertEquals(true, Helper.issueBook(null, "Amit Natani"));
	}
	
	@Test
	public void testIssueBookNullMember() {
		assertEquals(true, Helper.issueBook("Basics Of C", null));
	}
	
	@Test
	public void testIssueBookNullBoth() {
		assertEquals(true, Helper.issueBook(null, null));
	}
	
	@Test
	public void testIssueBookEmptyBookName() {
		assertEquals(true, Helper.issueBook("", "Amit Natani"));
	}
	
	@Test
	public void testIssueBookEmptyMemberName() {
		assertEquals(true, Helper.issueBook("Basics Of C", ""));
	}
	
	@Test
	public void testIssueBookEmptyBoth() {
		assertEquals(true, Helper.issueBook("", ""));
	}
}
