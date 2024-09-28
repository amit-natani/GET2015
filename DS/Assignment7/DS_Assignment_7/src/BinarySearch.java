
public class BinarySearch {
	
	/** This method finds the leftmots occurence of an element in a given array
	 * 
	 * @param itemArray : Array in which item is to be searched
	 * @param searchNumber : element to be searched
	 * @param choice : choice of user(1 for leftmost, 2 for rightmost)
	 * @return Returns index of the leftmost occurence of the element in the array,
	 * if the element is not fount then it returns -1
	 */
	public int getOccurrenceIndex(int[] itemArray, int searchNumber, int choice) {
		
		/* If itemArray is null or length of itemArray is zero
		 * then return -1
		 */
		if(itemArray == null || itemArray.length == 0)
			return -1;
		
		/* If length of itemArray is 1, and if searchNumber is equal to first element of array, 
		 * then return 0 */
		else if(itemArray.length == 1)
			if(itemArray[0] == searchNumber)
				return 0;
		/* Index stores the leftmost or rightmost index of the numebr in the array
		 * in number is not found the it will contain default value 
		 * that is set to -1*
		 */
		int lowerBound = 0, upperBound = itemArray.length-1;
		int index = -1;
		
		/* this loop will execute till lowerBound is less than or equal to upperBound */
		while (lowerBound <= upperBound) {
			
			/* mid is calculated using lowerBound and upperBound */
			int mid = (lowerBound + upperBound) / 2;
			
			/* If element at the mid index of the array is equal to search number,
			 * then value of mid is assigned to index and also (mid + 1) is assigned to upperBound
			 * ( in case of left most i.e choice is 1)
			 * and if choice is 2, that means in case of rightmost 
			 * the value (mid - 1) will be assigned to lowerBound
			 */
			if (itemArray[mid] == searchNumber) {
	           index = mid;
	           if(choice == 1)
	        	   upperBound = mid - 1;
	           else
	        	   lowerBound = mid + 1;
			}
			
			/* If element at the mid index of the array is less than search number,
			 * then lowerBound is updated with the value (mid + 1)
			 */
			else if (itemArray[mid] < searchNumber) {
	           lowerBound = mid + 1;
			}
			
			/* If element at the mid index of the array is greater than search number,
			 * then upperBound is updated with the value of mid
			 */
			else {
	           upperBound = mid - 1;
			}
		}
		
		/*index is returned as the leftmost index if number is found, otherwise index is -1*/
		return index;
	}
}
