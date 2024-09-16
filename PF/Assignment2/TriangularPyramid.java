import java.util.Scanner;


public class TriangularPyramid {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfRows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Max Element: ");
		noOfRows=sc.nextInt();
		TriangularPyramid objOne=new TriangularPyramid();
		String pyramid[]=objOne.printWholePyramid(noOfRows);
		for(int i=0;i<noOfRows;i++){
			System.out.println(pyramid[i]);
		}
		sc.close();
	}
	
	public String space(int row,int n)
	{
		char c[]=new char[row-1];
		for(int i=0;i<row-1;i++)
		{
			c[i]=' ';
		}
		
		String resultSpace=new String(c);
		return resultSpace;
	}
	
	public String number(int row,int n)
	{
		int i;
		String s="";
		for(i=1;i<=n-row+1;i++)
		{
			s=s+i;
		}
		return s;
	}
	
	public String[] printWholePyramid(int n)
	{
		String pyramid[]=new String[n];
		String rowString="";
		for(int i=1;i<=n;i++)
		{
			rowString=rowString+space(i,n);
			rowString=rowString+number(i,n);
			pyramid[i-1]=rowString;
			rowString="";
		}
		return pyramid;
	}
}
