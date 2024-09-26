import java.util.*;
public class LongestSequence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int stringLength;
		System.out.println("Enter the length of String: ");
		stringLength=sc.nextInt();
		System.out.println("Enter an array");
		int inputString[]=new int[stringLength];
		for(int i=0;i<stringLength;i++)
		{
			inputString[i]=sc.nextInt();
		}
		LongestSequence1 one=new LongestSequence1();
		int longestSequence[]=one.longestSequence(inputString);
		int i;
		for(i=0;i<longestSequence.length;i++)
			System.out.print(longestSequence[i]);
		sc.close();

	}
	public int[] longestSequence(int input[])
	{
		int n=input.length;
		int buffer1[]=new int[n];
		int buffer2[]=new int[n];
		int count1=1,count2=1;
		int k=0;
		int i,j,l;
		buffer1[k]=input[0];
		for(i=0;i<n;)
		{
			k=0;
			buffer2[k++]=input[i];
			for(j=i;j<n-1;j++)
			{
				if(input[j]>=input[j+1])
				{
					
					break;
				}
				buffer2[k++]=input[j+1];
				count2++;
			}
			if(count2>count1)
			{
				for(l=0;l<count2;l++)
					buffer1[l]=buffer2[l];
				count1=count2;
			}
			i=i+count2;
			count2=1;
		}
		int longestSequence[]=new int[count1];
		for(i=0;i<count1;i++)
			longestSequence[i]=buffer1[i];
		return longestSequence;
	}
}
