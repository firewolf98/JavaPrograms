import java.util.Scanner;

/**
	Questo programma collauda la classe Tris chiedendo all'utente di selezionare posizioni 		sulla scacchiera e visualizzando il risultato.
*/

public class TrisTester
{
	public static void main(String[] args)
	{
		String player ="x";
		Tris game =new Tris();
		Scanner in = new Scanner(System.in);
		boolean done = false;
		while(!done) 
		{
			System.out.println(game.toString());
			System.out.println("Inserisci riga per" + player + "(-1 per uscire):");
			int riga = in.nextInt();
			if (riga < 0) 
				done= true;
			else
			{
				System.out.println("Inserisci colonna per " + player + ":");
				int colonna = in.nextInt();
				game.set(riga, colonna, player);
				if(player.equals("x")) 
					player = "o";
				else
					player = "x";	
			}
		}
	}
}
