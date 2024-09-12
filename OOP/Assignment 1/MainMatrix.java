/**
 * 
 */
import java.util.*;
/**
 * @author Amit
 *
 */
public class MainMatrix {

	public static void main(String[] args) {
		Scanner sc = null;
		
		/* Exception Handling */
		try
		{
			sc = new Scanner(System.in);
			
			/* matrix object created */
			Matrix matrix1 = new Matrix(2,3);
			
			/* input in matrix using for loop */
			for(int i = 0; i < 2 ; i++)
			{
				for(int j = 0; j < 3 ; j++)
				{
					matrix1.addElements(i , j , sc.nextInt());
				}	
			}
			
			matrix1.show();
			Matrix matrix2 = matrix1.transpose(); // function call to transpose a matrix
			matrix2.show();
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			sc.close();
			return;
		}
	}

}
