
public class Node {

	/* Data Members */
	private Object data;
	private Node left;
	private Node right;
	
	/** Parameterized COnstructor to create objects of Node
	 * 
	 * @param data :  data to be stored in node
	 */
	public Node(Object data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	/** no argument constructor */
	public Node() {
		left = null;
		right = null;
	}
	
	/** Method to get left child
	 * 
	 * @return left : left node
	 */
	public Node getLeft() {
		return left;
	}

	/** Method to set left child of a node
	 * 
	 * @param left : left node
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/** Method to get right child of a node
	 * 
	 * @return right : right node
	 */
	public Node getRight() {
		return right;
	}

	/** Method to set right child of a node
	 * 
	 * @param right : right node
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/** Method to set Data on a node
	 * 
	 * @param data : data to be stored in node
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/** Method to get data of a node
	 * 
	 * @param data : data of node
	 */
	public Object getData() {
		return data;
	}
	
}
