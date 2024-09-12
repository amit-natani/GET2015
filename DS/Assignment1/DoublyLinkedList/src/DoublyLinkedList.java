/**
 * @author Amit
 *
 */
public class DoublyLinkedList {

	int nodeValue;
	DoublyLinkedList previous;
	DoublyLinkedList next;
	static DoublyLinkedList first = null;
	static int count = 0;
	
	/** Constructor to create an object of  DoublyLinkedList class */
	public DoublyLinkedList()
	{
		nodeValue = 0;
		previous = null;
		next = null;
	}
	
	/** Method to add an item at the front of the list 
	 * 
	 * @param item : item is to be inserted
	 */
	public void addAtFirst(int item)
	{
		DoublyLinkedList newNode = new DoublyLinkedList();
		newNode.nodeValue = item;
		newNode.next = first;
		newNode.previous = null;
		if( first != null)
		{
			first.previous = newNode;
		}
		first = newNode;
		count++;
	}
	
	/** Method to add an item at an specified location in list
	 * 
	 * @param location :  location at which element is to be inserted
	 * @param item : item is to be inserted
	 */
	public void addAtLocation(int location, int item)
	{
		if( location < count )
		{
			DoublyLinkedList newNode = new DoublyLinkedList();
			newNode.nodeValue = item;
			int i;
			DoublyLinkedList tempNode = first;
			if( location == 0 )
			{
				newNode.next = tempNode;
				newNode.previous = null;
				first.previous = newNode;
				first = newNode;
				count++;
			}
			else
			{
				for(i=0; i<(location-1); i++)
				{
					tempNode = tempNode.next;
				}
				newNode.next = tempNode.next;
				newNode.previous = tempNode;
				tempNode.next.previous = newNode;
				tempNode.next = newNode;
				count++;
			}
		}
		
		/* if location is not found then else part is executed */
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	
	/** Method to remove an item from the linked list by its value
	 * 
	 * @param item : item to be removed from the linked list
	 */
	public void remove(int item)
	{
		try
		{
			DoublyLinkedList previousNode = first;
			DoublyLinkedList currNode = first;
			while( currNode != null )
			{
				if( currNode.nodeValue == item )
				{
					break;
				}
				previousNode = currNode;
				currNode = currNode.next;
			}
			if( currNode == null )
			{
				System.out.print("\n Item Not Found ");
			}
			else
			{
				previousNode.next = currNode.next;
				currNode.next.previous = previousNode;
				currNode.next = null;
				currNode.previous = null;
				count --;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/** Method to remove item at an specified location 
	 * 
	 * @param location :  location at which the item is to be deleted
	 */
	public void removeAtIndex(int location)
	{
		if( location < count )
		{
			int i;
			DoublyLinkedList previousNode = first;
			DoublyLinkedList currNode = first;
			for(i=0; i<location; i++)
			{
				previousNode = currNode;
				currNode = currNode.next;
			}
			previousNode.next = currNode.next;
			currNode.next.previous = previousNode;
			currNode.next = null;
			currNode.previous = null;
			count --;
		}
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	
	/** Method to retrieve element at particular location
	 * 
	 * @param location : location from which element is to be reterived
	 */
	public void retrievel(int location)
	{
		if( location < count )
		{
			int i;
			DoublyLinkedList currNode = first;
			for(i=0; i<location; i++)
			{
				currNode = currNode.next;
			}
			System.out.print("\n Item at "+location+"th location is "+currNode.nodeValue);
		}
		else
		{
			System.out.print("\n Location not found ");
		}
	}
	
	/** Method to remove a linked list */
	public void reverse()
	{
		try
		{
			DoublyLinkedList tempNode1 = first, tempNode2 = null, tempNode3;
			while( tempNode1 != null )
			{
				tempNode3 = tempNode2;
				tempNode2 = tempNode1;
				tempNode1 = tempNode1.next;
				tempNode2.next = tempNode3;
				tempNode2.previous = tempNode1;
			}
			first = tempNode2;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	} 
	
	/** Method to sort a linked list */
	public void sort()
	{
		DoublyLinkedList tempNode1 = first, tempNode2;
		int temp;
		/* Sorting using temporary node */
		while( tempNode1 != null )
		{
			tempNode2 = first;
			while( tempNode2.next != null )
			{
				if( tempNode2.nodeValue > tempNode2.next.nodeValue )
				{
					temp = tempNode2.nodeValue;
					tempNode2.nodeValue = tempNode2.next.nodeValue;
					tempNode2.next.nodeValue = temp;
				}
				tempNode2 = tempNode2.next;
			}
			tempNode1 = tempNode1.next;
		}
	}
	
	/** Method to display elements of linked list 
	 * this method will show the elements in both the directions
	 */
	public void display()
	{
		try
		{
			DoublyLinkedList currNode = first;
			System.out.print("\n Linked list is : ");
			
			/* Displaying in forward direction */
			while( currNode.next != null )
			{
				System.out.print(currNode.nodeValue+" ");
				currNode = currNode.next;
			}
			System.out.print(currNode.nodeValue);
			System.out.print("\n Linked list is : ");
			
			/* Displaying in reverse direction */
			while(currNode.previous != null )				
			{
				System.out.print(currNode.nodeValue+" ");
				currNode = currNode.previous;
			}
			System.out.print(currNode.nodeValue);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
