/**
 * 
 */

/**
 * @author Amit
 *
 */
public class Square implements Shape {

	
	private int side;
	
	/* parameterized constructor to create objects of this class */
	public Square(int side) {
		
		this.side = side;
	}

	/* Overridden method from shape class */
	@Override
	public void draw() {
	
		System.out.println("This will draw a Circle");
	}

	/* Overridden method from shape class to calculate area of Square */
	@Override
	public double getArea() {
		
		return (side*side);
	}

}
