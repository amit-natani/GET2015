import java.util.*;							// Package imported to use Scanner class
public class QuickSort {

	public static void main(String[] args) {
		/* Initialization */
		Scanner sc = null;
		try
		{
			sc = new Scanner(System.in);	
			int noOfElements;					
			System.out.println("Enter no of elements: ");		
			noOfElements=sc.nextInt();						// In this line total no of elements are takes as input and assigned to variable noOfElements
			if(noOfElements<=0)
			{
				System.out.println("Enter positive no of elements: (>0)");	// This message will be printed if the no of elements is zero or negative
			}
			else
			{
				int itemArray[]=new int[noOfElements];		
				System.out.println("Enter items of Array: ");
				for(int i=0;i<noOfElements;i++)
				{
					itemArray[i]=sc.nextInt();				// input elements of array using Scanner class object sc
				}
				QuickSortClass quickSortObj=new QuickSortClass();							
				
				/*	method invocation with parameters itemArray, left index and right index and the method will return
				 *	a sorted Array that will be stored in itemArray
				 **/
				itemArray=quickSortObj.recQuickSort(itemArray, 0, noOfElements-1);
				System.out.println("Sorted Array is: ");
				for(int i=0;i<noOfElements;i++)
				{
					System.out.println(itemArray[i]);			// printing the sorted array 
				}
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			sc.close();
			return;
		}
	}
}

class QuickSortClass
{
	/* this recursive method takes itemArray[], left index and right index as input 
	 * and returns the sorted array
	 **/
	public int[] recQuickSort(int[] itemArray,int left ,int right)
	{	
		// base case
		if (right - left <= 0) 
		{
			return itemArray;
		}
		
		// recursive case
		else 
		{
			int border = partition(itemArray, left, right);	// recursive method partition is invoked with parameters itemArray, left index and right index
			recQuickSort(itemArray, left, border-1);		// recursive method recQuickSort is invoked with parameters itemArray, leftIndex and border-1 index
			recQuickSort(itemArray, border+1, right);		// recursive method recQuickSort is invoked with parameters itemArray, border+1 index
			return itemArray;								// return itemArray as sorted array at completion of sorting	
		}
	}
	
	
	/* this method performs partition of the array as elements less than pivot and
	 * elements greater than pivot.
	 */
	public int partition(int itemArray[], int left, int right)
	{
		int low = left; // set at the left border of the range
		int high = right; //set at the right border where the pivot sits

		int pivot = itemArray[right];		// set element at right index of array as pivot element
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
				swap(itemArray, low, high);		// swap function to swap two elements of itemArray
			}
		}
		swap(itemArray, high, right); // put the pivot on the border
		return high;
	}
	
	/*this method will swap two values of itemArray */
	public void swap(int itemArray[], int low, int high)
	{
		int temp;			// temporary variable used for swapping
		temp=itemArray[low];
		itemArray[low]=itemArray[high];
		itemArray[high]=temp;
	}

}
