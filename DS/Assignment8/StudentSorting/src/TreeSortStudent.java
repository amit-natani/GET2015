import java.util.*;

public class TreeSortStudent {
	
	/** root is a reference variable of type node 
	 * that will point to the root of the tree*/
	private Node root;
	
	/** This list contains the rollNumbers of students */
	private List<Integer> rollNumberList = new ArrayList<Integer>();
	
	/** This list contains the inorder traversal of tree */
	private List<Integer> rollNumberListSorted = new ArrayList<Integer>();
	
	/** No Argument constructor to create object of class BinarySearchTree */
	public TreeSortStudent() {
		root = null;
	}
	
	/** Method to get root of tree
	 * 
	 * @return : root of tree
	 */
	public Node getRoot() {
		return root;
	}

	/** Method to set root of tree
	 * 
	 * @param root : root of tree
	 */
	public void setRoot(Node root) {
		this.root = root;
	}

	/** Method to get sortedlist
	 * 
	 * @return rollNumberListSorted : sorted list on basis of roll number
	 */
	public List<Integer> getRollNumberListSorted() {
		return rollNumberListSorted;
	}

	/** Method to insert data in the tree
	 * 
	 * @param data : Data to be inserted in the tree
	 */
	public int insert(int rollNumber) {
		
		if(contains(rollNumber))
			return -1;
		else {
			/* newNode will store the data to be added */
			Node newNode = new Node();
			newNode.setData(rollNumber);
			
			/* If root contains null, then 
			 * newNode will be assigned to root
			 */
			if (root == null)
				root = newNode;
			
			/* If root is not null, then this code will be executed */
			else {
				
				/* currentNode will hold root node */  
				Node currentNode = root;
				Node parentNode;
				while (true) {
					parentNode = currentNode;
					
					/* condition to compare the data to be inserted and data of currentNode */
					if (rollNumber < (Integer)currentNode.getData()) {
						
						/* if data is less than data of current node than
						 * left subtree is chosen
						 */
						currentNode = currentNode.getLeft();
						if (currentNode == null) {
							parentNode.setLeft(newNode);
							break;
						}
					}
					else {
						/* if data is greater than data of current node than
						 * right subtree is chosen
						 */
						currentNode = currentNode.getRight();
						if (currentNode == null) {
							parentNode.setRight(newNode);
							break;
						}
					}
				}
			}
			/* Adding roll number in list */
			rollNumberList.add(rollNumber);
			return 0;
		}
	}
	
	/** Method to traverse the tree in inorder
	 * 
	 * @param node : root node of the tree
	 */
	public Node inorder(Node node) {
		
		if (node != null) {
			inorder(node.getLeft());
			/* rollNumberListSorted contains roll numbers in ascending order*/
			rollNumberListSorted.add((Integer)node.getData());
			inorder(node.getRight());
			return node;
		}
		else
		{
			return null;
		}
	}
	
	public boolean contains(int rollNumber) {
		if(rollNumberList.contains((Integer)rollNumber)) {
			return true;
		}
		else 
			return false;
	}
}
