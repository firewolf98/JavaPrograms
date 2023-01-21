// Questo programma simula 10 lanci del dado
public class TestaDado
{
	public static void main(String[] args)
	{
		Dado d = new Dado(6);
		final int LANCI = 10;
		for(int i = 1; i <= LANCI; i++) 
		{
			int n =d.lancia();
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
