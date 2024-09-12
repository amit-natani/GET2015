
/**
 * @author Amit
 *
 */
public class Matrix {
	private int data[][];
	private int noRows;
	private int noCols;
	
	/* parameterized constructor that takes row and col as arguments and creates objects
	 * with specific no of rows and columns
	 */
	public Matrix(int row, int col)
	{
		this.noRows = row;
		this.noCols = col;
		data = new int[row][col];
	}
	
	/* mentod to add an element to array at specified row and column */
	public void addElements(int row, int col, int value)
	{
		data[row][col]=value;
	}
	
	/* method to get specific element at specified row and column */ 
	public int getElement(int row, int col)
	{
		return this.data[row][col];
	}
	
	/* method to get no of rows of a matrix object*/ 
	
	public int getNoRows()
	{
		return this.noRows;
	}
	
	/* method to get no of columns of a matrix object*/
	public int getNoCols()
	{
		return this.noCols;
	}
	
	/*  Method to transpose a matrix. this method returns a matrix that is transpose of 
	 * the matrix that has called the method */
	public Matrix transpose()
	{
		Matrix transposeMatrix = null;
		try
		{
			transposeMatrix = new Matrix(this.noCols, this.noRows);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return transposeMatrix;
		}
		for(int i = 0 ; i < noRows ; i++)
		{
			for(int j = 0; j < noCols ; j++)
			{
				transposeMatrix.data[j][i] = data[i][j];
			}
		}
		return transposeMatrix;
	}
	
	/* method to show the elements of a matrix */
	public void show()
	{
		for(int i = 0;i < noRows; i++)
		{
			for(int j = 0;j < noCols; j++)
			{
				System.out.println(this.data[i][j]);
			}
		}
	}
}
