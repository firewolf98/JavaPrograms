import java.util.Scanner;
public class Serratura
{
	public Serratura(String set)
	{
		codice=set;
	}

	public boolean isOpen()
	{
		return lock;
	}
	
	public void lock()
	{
		lock=false;
	}

	public void setPosition(Scanner s)
	{	
		test=s.next();
		unLock();	
	}

	public void unLock()
	{
		if(test.equals(codice))
		{
			lock=true;
			newComb();
		}
		else
			lock=false;
	}

	public void newComb()
	{
		if(isOpen())
		{
			System.out.print("Setta la nuova password");
			Scanner d=new Scanner(System.in);
			codice=d.next();
			lock();
		}
	}

	private String codice,test;
	private boolean lock;
}
