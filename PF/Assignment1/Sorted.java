import java.util.*;
public class Sorted {
	
	public static void main(String args[])
	{
		Sorted one=new Sorted();
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		System.out.println("Enter Elements of Array: ");
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
		}
		int result;
		result=one.checkSorted(array);
		System.out.println(result);
		sc.close();
	}
	
	public int checkSorted(int input[])
	{
		int j;
		int countAscending=0, countDescending=0;
		for(int i=0;i<input.length-1;i++)
		{
			j=i+1;
			if(input[i]<input[j])
			{
				countAscending++;
			}
			else
			{
				countDescending++;
			}
		}
		if(countAscending==input.length-1)
			return 1;
		else if(countDescending==input.length-1)
			return 2;
		else
			return 0;
	}

}
