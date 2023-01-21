public class BankAccountTester
{
	public static void main(String args[])
	{
		BankAccount x=new BankAccount();
		x.deposit(2000);	
		x.withdraw(500);
		System.out.println(x.getBalance());
	}
}
