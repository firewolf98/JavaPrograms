public class SodaMachine
{
	public SodaMachine()
	{
		cans=0;	
		tokens=0;
	}

	public SodaMachine (int initialCans,int initialTokens)
	{
		cans=initialCans;
		tokens=initialTokens;
	}

	public void addCans (int amount)
	{
		int newCans=cans+amount;
		cans=newCans;
	}

	public void insertTokens()
	{
		int newCans=cans-1;
		cans=newCans;
		int newTokens=tokens+1;
		tokens=newTokens;
	}
	
	public int getCans()
	{
		return cans;
	}

	public int getTokens()
	{
		return tokens;
	}

	private int cans;
	private int tokens;
}
