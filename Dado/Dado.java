import  java.util.Random;
public class Dado 
{
	//costruttore che costruisce un dado
	//con s facce
	
	public Dado(int s) 
	{
		facce = s;
		generatore = new Random();
	}

	public int lancia() 
	{
		return 1 + generatore.nextInt(facce);
	}

	private Random generatore;
	private int facce;
}
