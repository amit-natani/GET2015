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
public class MatrixTest {

	
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
	public void setElementTest() {
		
		try
		{
			Matrix matrixObj = new Matrix(3,3);
			matrixObj.addElements(1, 2, 45);
			assertEquals("", 45, matrixObj.getElement(1,2));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
	}
	
	@Test
	public void getElementTest() {
		
		try
		{
			Matrix matrixObj = new Matrix(3,3);
			matrixObj.addElements(1, 2, 45);
			assertEquals("", 45, matrixObj.getElement(1,2));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
	}
	
	@Test
	public void transposeTest() {
		try
		{
			Matrix matrixTestObj = new Matrix(3,3);
			matrixTestObj.addElements(0, 0, 5);
			matrixTestObj.addElements(0, 1, 2);
			matrixTestObj.addElements(0, 2, 3);
			matrixTestObj.addElements(1, 0, 9);
			matrixTestObj.addElements(1, 1, 8);
			matrixTestObj.addElements(1, 2, 7);
			matrixTestObj.addElements(2, 0, 6);
			matrixTestObj.addElements(2, 1, 3);
			matrixTestObj.addElements(2, 2, 1);
			Matrix actual = matrixTestObj.transpose();
			Matrix expected = new Matrix(3, 3);
			expected.addElements(0, 0, 5);
			expected.addElements(0, 1, 9);
			expected.addElements(0, 2, 6);
			expected.addElements(1, 0, 2);
			expected.addElements(1, 1, 8);
			expected.addElements(1, 2, 3);
			expected.addElements(2, 0, 3);
			expected.addElements(2, 1, 7);
			expected.addElements(2, 2, 1);
			for(int i = 0; i < matrixTestObj.getNoRows(); i++)
			{
				for(int j = 0; j < matrixTestObj.getNoCols(); j++)
				{
					assertEquals("", expected.getElement(i, j), actual.getElement(i, j));
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
	}
}
