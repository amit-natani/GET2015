
/**
 * @author Amit
 *
 */
public class Matrix {
	private int data[][];
	private int noRows;
	private int noCols;
	
	/** parameterized constructor to creates objects
	 * @param row : number of rows in matrix
	 * @param column : Number of columns in matrix
	 */
	public Matrix(int row, int col)
	{
		this.noRows = row;
		this.noCols = col;
		data = new int[row][col];
	}
	
	/** mentod to add an element to array 
	 * @param row : row number where to enter element
	 * @param col : comumn number where to enter element
	 * @param value : value to be inserted in matrix at position specified by row and col
	  */
	public void addElements(int row, int col, int value)
	{
		data[row][col]=value;
	}
	
	/** method to get an element from matrix
	 * @param row : row number
	 * @param col : column number
	 * @return Value at specified row and col
	 */ 
	public int getElement(int row, int col)
	{
		return this.data[row][col];
	}
	
	/** method to get no of rows of a Matrix
	 * @return noRows : Number of rows of a matrix
	 */ 
	public int getNoRows()
	{
		return this.noRows;
	}
	
	/** method to get no of columns of a Matrix
	 * @return noCols : Number of columns of a matrix
	 */ 
	public int getNoCols()
	{
		return this.noCols;
	}
	
	/**  Method to transpose a matrix. 
	 * @return transposed matrix */
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
	
	/** method to show the elements of a matrix */
	public void show()
	{
		for(int i = 0;i < noRows; i++)
		{
			for(int j = 0;j < noCols; j++)
			{
				System.out.print(this.data[i][j]);
			}
			System.out.println();
		}
	}
}
