/*
 * W.A.J.P. to create a custom exception if Customer withdraw amount
which is greater than account balance then program will show
custom exception otherwise amount will deduct from account
balance.
Account balance is:2000
Enter withdraw amount:2500
Sorry, insufficient balance, you need more 500 Rs.
To perform this transaction.
 */
package AssignmentModule3;


import java.util.Scanner;

class TException extends Exception
{
	double amount;
	public TException(double amount)
	{
		this.amount=amount;
	}
}
class ATM{
	double balance;
	public void deposite(double amount)
	{
		balance+=amount;//balance=balance+amount
		System.out.println("Your total balance is:: " +balance);
	}
	public void withdraw(double amount) throws TException, ArithmeticException
	{
		if (amount<balance) {
			balance-=amount;
			System.out.println("Your total balance is::" +balance);
			
		}
		else {
			double needs;
			needs=amount-balance;
			throw new TException(needs);
		}
	}
}
public class CustomExceptionPro30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
ATM atm = new ATM();
double amount;
System.out.println("Please enter amount to be deposited::");
amount= sc.nextDouble();
atm.deposite(amount);
System.out.println("Enter amount to be withdrawn::");
amount=sc.nextDouble();
try {
	atm.withdraw(amount);
} catch (ArithmeticException e) {
	// TODO: handle exception
	e.printStackTrace();
}
catch(TException e)
{
	System.out.println("Sorry, insufficient balance"
			+ " you need " +e.amount+" RS "+ " to perform this transaction of " +amount+" Rs");
}
	}

}
