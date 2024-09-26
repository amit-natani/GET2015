
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstSortedArray=new int[5];
		int[] secondSortedArray=new int[5];
		MergeSort one=new MergeSort();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter elements of first sorted array: ");
		for(int i=0;i<5;i++)
		{
			firstSortedArray[i]=sc.nextInt();
		}
		System.out.println("Enter elements of second sorted array: ");
		for(int i=0;i<5;i++)
		{
			secondSortedArray[i]=sc.nextInt();
		}
		int mergedArray[]=new int[10];
		mergedArray=one.join(firstSortedArray,5,secondSortedArray,5,mergedArray);
		System.out.println("Joined array is: ");
		for(int i=0;i<10;i++)
		{
			System.out.println(mergedArray[i]);
		}
		sc.close();
	}
	public int[] join(int firstArray[], int firstArraySize, int secondArray[],int secondArraySize, int mergedArray[])
	{
		int k=0;
		for(int i=0;i<firstArraySize;)
		{
			for(int j=0;j<secondArraySize;)
			{
				if(firstArray[i]<secondArray[j])
				{
					mergedArray[k]=firstArray[i];
					i++;
					k++;
				}
				else
				{
					mergedArray[k]=secondArray[j];
					j++;
					k++;
				}
				if(i==firstArraySize)
				{
					for(int count=k;count<firstArraySize+secondArraySize;count++)
					{
						mergedArray[count]=secondArray[j];
						j++;
					}
				}
				else if(j==secondArraySize)
				{
					for(int count=k;count<firstArraySize+secondArraySize;count++)
					{
						mergedArray[count]=firstArray[i];
						i++;
					}
				}
			}
		}
		return mergedArray;
	}

}
