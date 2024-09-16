/**
 @Program: To find largest digit in a given number
 @Date: 10/08/2015
 */

/**
 * @author Amit
 *
 */
import java.util.*;
public class LargestDigit {
	
								
	public static void main(String[] args) {
		/* Initialization */
		int max = 0;
		Scanner sc = null;
		try
		{
			LargestDigitClass largestDigitObject = new LargestDigitClass();				
			sc = new Scanner(System.in);					
			long number, largestDigit;								
			System.out.println("Enter Number: ");					
			number = sc.nextLong();
			largestDigit=largestDigitObject.largestdigit(number, max);				// method invocation and result will be received in variable largestDigit
			if(largestDigit == -1)
				System.out.println("Exception Occurred");
			else
				System.out.println("Largest Digit is: "+largestDigit);
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			sc.close();
		}
	}
}

class LargestDigitClass
{
	
	/* this recursive method takes a number as argument and return the largest digit from that number*/
	public long largestdigit(long number, int max)		
	{
		if(number<0)
		{
			number=number*(-1);
		}
		if(number==0)								
		{
			return max;						// returning the max digit from the method
		}
		else
		{
			try
			{								
				int digit=(int)number%10;	// calculates the least significant digit of the number and assign it in variable digit
				
				if(digit>max)				
					max=digit;				// assign value of digit in variable max if value of digit is greater than value of max
				
				number=number/10;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				return -1;
			}
			return largestdigit(number, max);	// recursive calling of method largestdigit
		}	
	}

}
