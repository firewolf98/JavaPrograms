import java.io.*;
import java.util.Scanner;

public class Cliente 
{
	public Cliente(BankAccount account,String name,String surname)
	{
		this.account=account;
		this.name=name;
		this.surname=surname;
	}
	
	public	static Cliente create(Scanner a)
	{
		BankAccount c=BankAccount.read(a);
		String one,two;
		one=a.next();
		two=a.next();
		return new Cliente(c,one,two);
	}	

	public String getName()
	{
		return this.name;
	}
	
	public String getSurname()
	{
		return this.surname;
	}
	
	public void print(PrintStream c)
	{
		c.println("Saldo del cliente " + this.name + " " + this.surname);
		account.print(c);
	}	
	
	private BankAccount account;
	private String name,surname;		
}
