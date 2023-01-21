import java.util.Scanner;
public class Gioco
{
	public Gioco()
	{
		g=new BankAccount(1000);
		c=new BankAccount(100000);
		d=new Dado(6);
	}

	public void scommetti(int n,double sum)
	{
		Scanner ris=new Scanner(System.in);
		do
		{
			System.out.print("Vuoi giocare?");
			if(ris.nextLine().equals("si"))
			{
				if(n==d.lancia())
				{
					g.deposit(sum*5);
					c.withdraw(sum*5);
				}
				else
				{
					g.withdraw(sum);
					c.deposit(sum);
				}
			}	
			else
				break;
			System.out.print("Il vostro saldo è di: ");
			System.out.println(g.getBalance());
		}
		while(g.getBalance()>0 && (c.getBalance()/5)>0);
		System.out.print("Il vostro saldo è di: ");
		System.out.println(g.getBalance());
	}

	private BankAccount g,c;
	private Dado d;
}
		
