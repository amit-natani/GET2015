import java.util.Scanner;

/**
 * 
 */

/**
 * @author Amit
 *
 */
public class Payment {
	
	Scanner scan;
	public void payment()
	{
		try
		{
			scan = new Scanner(System.in);
			int payChoice;

			PaymentMenu paymentMenuObj = new PaymentMenu();
			paymentMenuObj.showMenu();
			payChoice = scan.nextInt();
			do
			{
				if(payChoice == 1)
				{
					creditCardPayment();
					break;
				}
				else if(payChoice == 2)
				{
					debitCardPayment();
					break;
				}
				else if(payChoice == 3)
				{
					walletPayment();
					break;
				}
				else if(payChoice == 4)
				{
					netBankingPayment();
					break;
				}
				else
					System.out.println("Enter correct Choice: ");
			}
			while(true);
					
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
	}
	
	private void creditCardPayment()
	{
		try
		{
			System.out.println("Enter Credit card Number: ");
			scan.next();
			System.out.println("Enter cvv number: ");
			scan.nextInt();
			System.out.println("Enter Pin of card: ");
			scan.nextInt();
			System.out.println("Payment Confirmed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
	}
		
	private void debitCardPayment()
	{
		try
		{
			System.out.println("Enter Debit card Number: ");
			scan.next();
			System.out.println("Enter cvv number: ");
			scan.nextInt();
			System.out.println("Enter Pin of card: ");
			scan.nextInt();
			System.out.println("Payment Confirmed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
	}
	
	private void walletPayment()
	{
		try
		{
			System.out.println("Enter user name of wallet");
			scan.next();
			System.out.println("Enter password of wallet: ");
			scan.next();
			System.out.println("Payment Confirmed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}	
	}
	
	private void netBankingPayment()
	{
		try
		{
			System.out.println("Enter user name of Net Banking: ");
			scan.next();
			System.out.println("Enter password of Net Banking: ");
			scan.next();
			System.out.println("Payment Confirmed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
	}
}

