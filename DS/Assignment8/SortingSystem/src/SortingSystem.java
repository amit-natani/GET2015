import java.util.LinkedList;

public class SortingSystem {
	
	/** This Method performs Comparison Sort 
	 * Internally this method can invoke one of the two methods
	 * bubbbleSort() or QuickSort() according to the size of itemArray
	 * if size of itemArray is less than or equal to 10, then bubbleSort() will be called, 
	 * otherwise quickSort will be called
	 * 
	 * @param itemArray : input array of elements
	 * @return sorted array
	 */
	public int[] comparisonSorting(int[] itemArray) {
		
		/* If itemArray is null or length of itemArray is zero
		 * then return null 
		 */
		if(itemArray == null || itemArray.length == 0)
			return null;
		
		/* If size of itemArray is less than or equal to 10, 
		 * then bubbleSort() will be used
		 */
		else if(itemArray.length <= 10) 
			return bubbleSort(itemArray);
		
		/* If size of itemArray is greater than 10, 
		 * then quickSort() will be used
		 */
		else {
			System.out.println("------ Sorting using Quick Sort ------");
			return quickSort(itemArray, 0, itemArray.length-1);
		}
		
	}
	
	/** This Method performs Linear Sort 
	 * Internally this method can invoke one of the two methods
	 * countingSort() or radixSort() according to the maximum number is itemArray
	 * if maximum element of itemArray is less than or equal to 99, then countingSort() will be called, 
	 * otherwise radixSort() will be called
	 * 
	 * @param itemArray : input array of elements
	 * @return sorted array
	 */
	public int [] linearSorting(int[] itemArray) {
		
		/* If itemArray is null or length of itemArray is zero
		 * then return null 
		 */
		if(itemArray == null || itemArray.length == 0)
			return null;
		
		else {
			
			/* maximumElement will store maximum element from the itemArray */
			int maximumElement = findMax(itemArray);
			/* If maximum number of array temp is less than or equal to 99, 
			 * then countingSort() will be used.
			 */
			if(maximumElement <= 99) 
				return countingSort(itemArray);
			
			/* If maximum number of array temp is greater than 99, 
			 * then radixSort() will be used
			 */
			else 
				return radixSort(itemArray);
		}
	}
	
	/** This method sort the itemArray in Ascending order
	 * 
	 * @param itemArray : input array 
	 * @param maximumElement : maximum number in itemArray
	 * @return Sorted Array
	 */
	public int[] countingSort(int[] itemArray) {
		
		/* If itemArray is null or length of itemArray is zero
		 * then return null 
		 */
		if(itemArray == null || itemArray.length == 0)
			return null;
		
		/* If item Array contains negative data, then return null */
		if(checkNegative(itemArray ) == -1){
			return null;
		}
		
		/* maximumElement holds the maximum element of the array */
		int maximumElement = findMax(itemArray);

		/* arrayLength holds the length of input itemArray */
		int arrayLength = itemArray.length;
		
		/* bucket in array of size 1 more than maximumElement */
		int[] bucket = new int[maximumElement+1];
		
		/*bucketLength holds the length of bucket array */
		int bucketLength = bucket.length;
		
		/* loop to fill the bucket according to the numbers in itemArray */
		for(int count = 0; count < arrayLength; count++) {
			bucket[itemArray[count]] = bucket[itemArray[count]] + 1;
		}
		
		/* for loop to fill the itemArray with sorted order of elemetns
		 * by using the bucket
		 */
		for(int count = 0, j = 0; count < bucketLength;) {
			if(bucket[count] != 0) {
				itemArray[j] = count;
				j++;
				bucket[count] = bucket[count] - 1;
			}
			else
				count++;
		}
		System.out.println("------ Sorting using Counting Sort ------");
		/* itemArray is returned in sorted form */
		return itemArray;
	}
	
	/** This method sort the itemArray in Ascending order
	 * 
	 * @param itemArray : input array 
	 * @param maximumElement : maximum number in itemArray
	 * @return Sorted Array
	 */
	public int[] radixSort( int[] itemArray)
	{
		
		/* If itemArray is null or length of itemArray is zero
		 * then return null 
		 */
		if(itemArray == null || itemArray.length == 0)
			return null;
		
		/* If item Array contains negative data, then return null */
		if(checkNegative(itemArray ) == -1){
			return null;
		}
		
		/* maximumElement holds the maximum element of the array */
		int maximumElement = findMax(itemArray);
		int i, j, countMaximumLength = 0, k;
		int temp = maximumElement, count = 1, temp1, temp2;
		
		/* loop to find number of digits in the maximumElement*/
		while( temp != 0 )
		{
			countMaximumLength++;
			temp = temp/10;
		}
		
		/* queue is an Array of type Queue */
		@SuppressWarnings("unchecked")
		LinkedList<Integer>[] listArray = new LinkedList[10];
		
		/* Initializing every element of array queueArray with a LinkedList */
		for(i=0; i<10; i++)
		{
			listArray[i] = new LinkedList<Integer>();
		}
		
		/* Loop to be executed countMaximumLength times */
		for(i=0; i<countMaximumLength; i++)
		{
			/* for loop to insert numbers in queue in every interation */
			for(j=0; j<itemArray.length; j++)
			{
				temp1 = itemArray[j]/count;
				temp2 = temp1%10;
				listArray[temp2].add(itemArray[j]);
			}
			count = count*10;
			k = 0;
			
			/* Loop to transfer elements from queue to itemArray */
			for(j=0; j<listArray.length; j++)
			{
				while( listArray[j].size() != 0 )
				{
					itemArray[k++] = (int)listArray[j].poll();
				}
			}
		}
		System.out.println("------ Sorting using Radix Sort ------");
		return itemArray;
	}
	
	/** This method sort the itemArray in Ascending order
	 * 
	 * @param itemArray : input array 
	 * @return Sorted Array
	 */
	public int[] bubbleSort(int[] itemArray) {
		
		/* If itemArray is null or length of itemArray is zero
		 * then return null 
		 */
		if(itemArray == null || itemArray.length == 0)
			return null;
		
		boolean swapped = false;
		
		/* lastUnsortedIndex is set to 1 less than length of itemArray */
		int lastUnsortedIndex = itemArray.length - 1;
		
		/* do while loop to be executed until sorted is true */
		do
		{
			swapped = false;
			
			/* for loop to traverse elements of itemArray */
			for(int i = 0; i < lastUnsortedIndex; i++) {
				
				/* If left element is greater than it's right adjecent element 
				 * than swapping is performed between both the elements and 
				 * swapped will be set to true 
				 */
				if(itemArray[i] > itemArray[i+1]) {
					swap(itemArray, i, i+1);
					swapped = true;
				}
			}
			
			/* decreasing lastUnsortedIndex each time one element is sorted */
			lastUnsortedIndex--;
		}while(swapped);
		System.out.println("------ Sorting using Bubble Sort ------");
		return itemArray;
	}
	
	/** This recursive method sort the itemArray in Ascending order
	 * 
	 * @param itemArray : 
	 * 					Input Array
	 * @param lowerBound :
	 * 					 lower Bound
	 * @param upperBound :
	 * 					 upper Bound
	 * @return
	 */
	public int[] quickSort(int[] itemArray, int lowerBound, int upperBound) {
		
		
		/* If itemArray is null or length of itemArray is zero
		 * then return null 
		 */
		if(itemArray == null || itemArray.length == 0)
			return null;
		
		/* base case */
		if (upperBound - lowerBound <= 0) 
		{
			return itemArray;
		}
		
		/* Recursive Case */
		else 
		{
			/* method partition is invoked with parameters itemArray, left index and right index */
			int border = partition(itemArray, lowerBound, upperBound);	
			
			/* recursive method QuickSort is invoked with parameters itemArray, leftIndex and border-1 index */
			quickSort(itemArray, lowerBound, border-1);		
			
			/* recursive method recQuickSort is invoked with parameters itemArray, border+1 index */
			quickSort(itemArray, border+1, upperBound);		
		
			/* returning sorted item array at completion of sorting */
			return itemArray;									
		}
	}
	
	/* This method performs partition of the array as elements less than pivot and
	 * elements greater than pivot.
	 */
	private int partition(int itemArray[], int left, int right)
	{
		/* set at the left border of the range */
		int low = left;  
		/* set at the right border where the pivot sits */
		int high = right; 

		/* set element at right index of array as pivot element */
		int pivot = itemArray[right];
		while(low < high) 					
		{	
			/* this code will be executed till low index is less than high index*/
			if (itemArray[low] < pivot) 
			{
				low++;
			}
			else 
			{
				high--;
				/* calling swap function to swap two elements of itemArray */
				swap(itemArray, low, high);
			}
		}
		/* put the pivot on the border by swapping */
		swap(itemArray, high, right); 
		return high;
	}
	
	/** This method swaps tow values of item array at index i and j
	 * 
	 * @param itemArray : Input Array
	 * @param i : index
	 * @param j : index
	 */
	private void swap(int[] itemArray, int i, int j) {
		/* temp is temporary variable used for sorting */
		int temp;
		temp = itemArray[i];
		itemArray[i] = itemArray[j];
		itemArray[j] = temp;
	}

	/** Method to find maximum Element from an array
	 * 
	 * @param itemArray : input array
	 * @return : Maximum element of that array 
	 */
	public int findMax(int[] itemArray) {
		if(itemArray == null || itemArray.length == 0) {
			return -1;
		}
		/* maximumElement will store maximum element from the itemArray */
		int maximumElement = -1;
		/* Traversing array using for each loop */
		for(int a : itemArray) {
			if(a > maximumElement)
				maximumElement = a;
		}
		return maximumElement;
	}
	
	public int checkNegative(int[] itemArray) {
		for(int a : itemArray) {
			if(a < 0) 
				return -1;
		}
		return 0;
	}
}
