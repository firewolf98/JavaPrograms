import java.util.Scanner;
import java.io.*;

public class BankAccountTester
{
	public static void main(String args[]) throws Exception 
	{
		BankAccount x=new BankAccount();
		x.deposit(2000);	
		x.withdraw(500);
		System.out.println(x.getBalance());
		Scanner sf=new Scanner(System.in);
		File f=new File("conto.txt");
		PrintStream ps=new PrintStream(f);
		x.print(ps);
		Scanner s2=new Scanner(System.in);
		BankAccount x1;
		x1=BankAccount.read(s2);
		x1.print(ps);
	}
}
