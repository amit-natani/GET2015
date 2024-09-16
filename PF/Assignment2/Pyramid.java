import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxElement;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Max Element: ");
		maxElement=sc.nextInt();
		Pyramid objOne=new Pyramid();
		String pyramid[]=objOne.printWholePyramid(maxElement);
		for(int i=0;i<((2*maxElement)-1);i++){
			System.out.println(pyramid[i]);
		}
		sc.close();
	}
	
	public String space(int row,int n)
	{
		char c[]=new char[n-row];
		for(int i=0;i<(n-row);i++)
		{
			c[i]=' ';
		}
		
		String resultSpace=new String(c);
		return resultSpace;
	}
	
	public String number(int row,int n)
	{
		int i;
		String resultNumber="";
		for(i=1;i<=row;i++)
		{
			resultNumber=resultNumber+i;
		}
		for(;i<(2*row);i++)
		{
			resultNumber=resultNumber+((2*row)-i);
		}
		
		return resultNumber;
	}
	
	public String[] printWholePyramid(int n)
	{
		String pyramid[]=new String[2*n-1];
		String rowString="";
		for(int i=1;i<=n;i++)
		{
			rowString=rowString+space(i,n);
			rowString=rowString+number(i,n);
			pyramid[i-1]=rowString;
			rowString="";
		}
		int j=0;
		for(int i=n-1;i>=1;i--)
		{
			
			rowString=rowString+space(i,n);
			rowString=rowString+number(i,n);
			pyramid[n+j]=rowString;
			rowString="";
			j++;
		}
		return pyramid;
	}
}
