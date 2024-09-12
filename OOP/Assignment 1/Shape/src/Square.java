/**
 * 
 */

/**
 * @author Amit
 *
 */
public class Square implements Shape {

	/* Instance variable declaration */
	private int side;
	
	/** parameterized constructor to create objects of this class 
	 * @param side : Side of Square 
	 */
	public Square(int side) {
		
		this.side = side;
	}

	/** Overridden method from shape class 
	 */
	@Override
	public void draw() {
	
		System.out.println("This will draw a Square");
	}

	/** Overridden method from shape class to calculate area of Square
	 *@return Area of Square 
	 */
	@Override
	public double getArea() {
		
		return (side*side);
	}

}
