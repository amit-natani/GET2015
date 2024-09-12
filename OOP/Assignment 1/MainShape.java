/**
 * 
 */

/**
 * @author Amit
 *
 */
public class MainShape {

	public static void main(String[] args) {
		try
		{
			/* Initialization */
			Circle circleObj = new Circle(7);
			Square squareObj = new Square(6);
			
			/* Printing area of shapes */
			System.out.println(circleObj.getArea());	// getArea() returns area of circle;
			System.out.println(squareObj.getArea());	// getArea() returns area of Square
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
