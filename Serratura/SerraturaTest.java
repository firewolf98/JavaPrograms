import java.util.Scanner;
public class SerraturaTest
{
	public static void main(String[] args) throws Exception
	{
		int ris;
		Serratura r=new Serratura("pollo");
		do
		{
			System.out.print("Inserisci password");
			Scanner in=new Scanner(System.in);
			r.setPosition(in);
			System.out.print("Vuoi continuare? (1=si,0=no)");
			ris=in.nextInt();
		}
		while(ris==1);
	}
}
