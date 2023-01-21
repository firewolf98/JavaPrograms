import java.io.*;
import java.util.Scanner;

public class BankAccount 
{
	public BankAccount()
	{
		balance=0;	
	}

	public BankAccount (double initialBalance)
	{
		balance=initialBalance;
	}

	public void deposit (double amount)
	{
		double newBalance=balance+amount;
		balance=newBalance;
	}

	public void withdraw(double amount)
	{
		double newBalance=balance-amount;
		balance=newBalance;
	}
	
	public double getBalance()
	{
		return balance;
	}

	public static BankAccount read(Scanner d)
	{
		double bal;
		bal=d.nextDouble();
		return new BankAccount(bal);
	}		

	public void print(PrintStream c)
	{
		c.println("Il saldo è: " + this.balance);
	}

	private double balance;
}
