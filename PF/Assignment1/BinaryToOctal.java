import java.util.*;
public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryToOctal one=new BinaryToOctal();
		Scanner sc=new Scanner(System.in);
		int binaryNumber;
		System.out.println("Enter a Binary Number");
		binaryNumber=sc.nextInt();
		int octalNumber=one.convertBinaryToOctal(binaryNumber);
		System.out.println(octalNumber);
		sc.close();

	}
	
	public int convertBinaryToOctal(int binaryNumber)
	{
		int countDigits=0;
		int copy;
		int decNumber=0;
		copy=binaryNumber;
		while(binaryNumber!=0)
		{
			binaryNumber=binaryNumber/10;
			countDigits++;
		}
		for(int i=0;i<countDigits;i++)
		{
			decNumber=decNumber+(copy%10)*power(2,i);
			copy=copy/10;
		}
		int i=1;
		int octalNumber=0;
		while(decNumber!=0)
		{
			octalNumber=octalNumber+(decNumber%8)*i;
			decNumber=decNumber/8;
			i=i*10;
		}
		return octalNumber;
	}
	public int power(int x, int n)
	{
		int pow=1;
		for(int i=1;i<=n;i++)
		{
			pow=pow*x;
		}
		return pow;
	}

}
