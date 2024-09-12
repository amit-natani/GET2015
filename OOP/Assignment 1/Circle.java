
/**
 * @author Amit
 *
 */
public class Circle implements Shape {

	
	private int radius;
	
	/* parameterized constructor to create objects of this class */
	public Circle(int radius) {

		this.radius = radius;
	}

	/* Overridden method from shape class */
	@Override
	public void draw() {

		System.out.println("This will draw a circle");
	}

	/* Overridden method from shape class to calculate area of Circle */
	@Override
	public double getArea() {

		return ((22/7.0)*radius*radius);
	}

}
