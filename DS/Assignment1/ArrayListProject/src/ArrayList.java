
public class ArrayList {
	int count = 0;
	Object array[] = new Object[10];
	Object arrayNew[];
	
	/** Method to add an item to list
	 * @param object : object to add to the list
	 * @return true if item is added successfully, false otherwise
	 */
	public boolean addItem(Object object)
	{
		try
		{
			int length = array.length;
			if(count < length) {
				array[count] = object;
				count++;
			}
			else 
			{
				arrayNew = new Object[length*2+2];
				for(int i = 0; i < array.length; i++)
					arrayNew[i] = array[i];
				array = arrayNew;
				array[count] = object;
				count++;
			}
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/** Method to add an item at specified index in the list
	 * 
	 * @param object : object to add
	 * @param index :  index at which the object to be add
	 * @return true if item is added successfully, false otherwise
	 */
	public boolean addItem(Object object, int index)
	{
		try
		{
			int length = array.length;
			
			/* If the index is greater than length or index is greater than number of elements inserted+1, then the number 
			 * will not be added to the list
			 */
			if(index > length || index > count)
			{
				System.out.println("Index value must by less than length of array."
						+ " currently length of array is: "+length);
			}
			else
			{
				if(count == length)
				{
					arrayNew = new Object[length*2+2];
					for(int i = 0; i < array.length; i++)
						arrayNew[i] = array[i];
					array = arrayNew;
				}
				
				for(int i = count; i > index ; i--)
				{
					array[i] = array[i-1];
				}
				array[index] = object;
				count++;
				return true;
			}
		}
		catch(Exception e)
		{
			return false;
		}
		return false;
	}
	
	/** Method to find the first occurrence of an item after the specified index
	 *  
	 * @param object : object whose occurrence to be found
	 * @param index : index after which occurrence to be found
	 * @return index at which the object is found, -1 if not found and -2 if exception occurs
	 */
	public int firstOcccurence(Object object, int index)
	{
		try
		{
			for(int i = index; i < count; i++)
			{
				if(object == array[i])
				{
					return i;
				}
			}
		}
		catch(Exception e)
		{
			return -2;
		}
		return -1;
	}
	
	/** Method to find the first occurrence of an item 
	 *  
	 * @param object : object whose occurrence to be found

	 * @return index at which the object is found, -1 if not found and -2 if exception occurs
	 */
	public int firstIndex(Object object)
	{
		try
		{
			for(int i = 0; i < count; i++)
			{
				if(object == array[i])
				{
					return i;
				}
			}
		}
		catch(Exception e)
		{
			return -2;
		}
		return -1;
	}
	
	/** Method to remove an item at specified index
	 * 
	 * @param index
	 * @return true if successfully removed , false otherwise
	 */
	public boolean removeByIndex(int index)
	{
		try
		{
			for(int i = (index + 1); i < count; i++)
			{
				array[i-1] = array[i];
			}
			count--;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/** Method to remove an item by value
	 * 
	 * @param object : which is to be removed
	 * @return true if removed successfully, false otherwise
	 */
	public boolean removeByItem(Object object)
	{
		try
		{
			int i;
			for(i = 0; i < count; i++)
			{
				if(array[i] == object)
					break;
			}
			for(int j = i; j < count; j++)
			{
				array[j] = array[j+1];
			}
			count--;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/** method to clear the list
	 * 
	 * @return true if cleared successfully, false otherwise
	 */
	public boolean clear()
	{
		try
		{
			arrayNew = new Object[10];
			array = arrayNew;
			count = 0;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/** MEthod to reverse the list
	 * 
	 * @return true if successfully reversed, false otherwise
	 */
	public boolean reverse()
	{
		try
		{
			arrayNew = new Object[count];
			int countArray = count-1;
			for(int i = 0; i < count; i++)
			{
				arrayNew[i] = array[countArray];
				countArray--;
			}
			array = arrayNew;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/** Method to merge two lists
	 * 
	 * @param arrayList : which is to be added to the invoking list 
	 * @return true if merged successfully, false otherwise
	 */
	public boolean merge(ArrayList arrayList)
	{
		try
		{
			
			int totalLength = this.count + arrayList.count;
			if(totalLength > this.array.length)
			{
				arrayNew = new Object[totalLength];
				for(int i = 0; i < this.count; i++)
				{
					arrayNew[i] = this.array[i];
				}
				this.array = arrayNew;
			}
			int secondArrayCount = 0;
			for(int i = this.count; i<totalLength; i++)
			{
				this.array[i] = arrayList.array[secondArrayCount];
				secondArrayCount++;
			}
			this.count = totalLength;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/** Method to sort a list
	 * 
	 * @return true if sorted successfully, false otherwise
	 */
	public boolean sort()
	{
		try
		{
			for(int i = 0; i < count; i++)
			{
				for(int j = i+1; j < count; j++)
				{
					Integer temp;
					if((Integer)array[i]>(Integer)array[j])
					{
						temp = (Integer)array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	 /** Method to show elements of a list*/
	public void show()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println(array[i]);
		}
	}
}
