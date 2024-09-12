

@SuppressWarnings("hiding")
public class LinkedList<Integer> {
	
	int numberOfElements = 0;

	/** Method to create a linked list 
	 * 
	 * @param item1 : first item to be added
	 * @param item2 : second item to be added
	 * @return first : first node of the list
	 */
	public Node<Integer> createLinkedList(Integer item1, Integer item2) {
		Node<Integer> first = null, firstElement, secondElement;
		firstElement = new Node<Integer>(item1);
		secondElement = new Node<Integer>(item2);
		firstElement.next = secondElement;
		first = firstElement;
		return first;
	}

	/** Method to insert an element at specified position in the list 
	 * 
	 * @param position : position at which the element is to be inserted
	 * @param item : item to be inserted
	 * @param first : first node of the list
	 * @return first : first node of the list
	 */
	public Node<Integer> insertAtPosition(int position, Integer item, Node<Integer> first) {
		if(first == null)
		{
			return first;
		}
		if(position > numberOfElements)
		{
			System.out.println("Position is greater than current number of elements");
			return first;
		}

		Node<Integer> current = first;
		if (position == 0) {
			Node<Integer> newNode = new Node<Integer>(item);
			first = newNode;
			newNode.next = current;
			return first;

		} else if (position > 0) {
			for (int i = 1; i < position; i++) {
				current = current.next;
			}
			Node<Integer> newNode = new Node<Integer>(item);
			newNode.next = current.next;
			current.next = newNode;
		}
		return first;
	}

	/** Method to delete item at particular position
	 * 
	 * @param position : position at which the element is to be deleted
	 * @param first : first node of the list
	 * @return first : first node of the list
	 */
	public Node<Integer> deleteAtIndex(int position, Node<Integer> first)
	{
		if( position < numberOfElements )			// this method is same as previous method
		{
			int i;
			Node<Integer> previousnode = first;
			Node<Integer> currnode = first;
			for(i=0; i<position; i++)
			{
				previousnode = currnode;
				currnode = currnode.next;
			}
			previousnode.next = currnode.next;
			currnode.next = null;
			return first;
		}
		else
		{
			System.out.print("\n Location not found ");
			return first;
		}
		
	}

	/** Method to remove an element by its value 
	 * 
	 * @param item : item to be removed
	 * @param first : first node of the list
	 * @return first : first node of the list
	 */
	public Node<Integer> remove(Integer item, Node<Integer> first)
	{
		Node<Integer> previousnode = first;
		Node<Integer> currnode = first;
		while( currnode != null )
		{
			if( currnode.nodeValue == item )// go to that location in list where this node value is find
			{
				break;
			}
			previousnode = currnode;			// previous node holds node at location -1  
			currnode = currnode.next;			// current node holds node at that location
		}
		if( currnode == null )
		{
			System.out.print("\n Item Not Found ");
		}
		else
		{
			previousnode.next = currnode.next;		// now create link between previous node to next node  
			currnode.next = null;	// remove links of current node
			numberOfElements--;				// reduce the size of count
		}
		return first;
	}
	
	/** Method to retrieve element at particular position
	 * 
	 * @param position : position at from which element is to be retrieved 
	 * @param first : first node of the list
	 * @return element at the particular index
	 */
	public Integer retrieveAtPosition(int position, Node<Integer> first) {
		if(first == null)
		{
			return null;
		}
		if(position > numberOfElements)
		{
			System.out.println("Position is greater than current number of elements");
			return null;
		}
		Node<Integer> current = first;
		for (int i = 0; i < position; i++) {
			current = current.next;
		}
		return current.nodeValue;
	}

	/** MEthod to show the elements of the list */
	public void display(Node<Integer> first) {
		if(first == null)
		{
			System.out.println("List is empty");
			return;
		}
		Node<Integer> current = first;
		while (current != null) {
			System.out.println(current.nodeValue);
			current = current.next;

		}

	}
	
	/** Method to sort the list 
	 * 
	 * @param first :  first node of the list
	 * @return : first node of the list
	 */
	Node<Integer> sort(Node<Integer> first)
	{
		Node<Integer> tempNode1 = first, tempNode2;
		Integer temp;
		while( tempNode1 != null )  // apply simple sorting to sort the elements of Linked list
		{
			tempNode2 = first;
			while( tempNode2.next != null )
			{
				if((int)tempNode2.nodeValue > (int)tempNode2.next.nodeValue )
				{
					temp = tempNode2.nodeValue;
					tempNode2.nodeValue = tempNode2.next.nodeValue;
					tempNode2.next.nodeValue = temp;
				}
				tempNode2 = tempNode2.next;
			}
			tempNode1 = tempNode1.next;
		}
		return first;
	}

	/** Method to reverse the linked list 
	 * 
	 * @param first : first node of the list which is to be reversed
	 * @return first node of reversed list
	 */
	public Node<Integer> reverseLinkedList(Node<Integer> first) {  
		// For first node, previousNode will be null  
		Node<Integer> previousNode=null;  
		Node<Integer> nextNode;  
		while(first!=null) {  
			nextNode=first.next;  
			// reversing the list 
			first.next=previousNode;  
			// moving currentNode and previousNode by 1 node  
			previousNode=first;  
			first=nextNode;  
		}  
		return previousNode;  
	 }  
}

