public class Scarafaggi
{
	public Scarafaggi()
	{	
		popolo=0;
	}
	
	public Scarafaggi(int initialPopolo)
	{
		popolo=initialPopolo;
	}

	public void raddPop()
	{
		popolo=popolo*2;
	}

	public void dimPop()
	{
		popolo=popolo-popolo/10;
	}

	public int getPopolo()
	{
		return popolo;
	}

	private int popolo;
}
