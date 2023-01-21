import java.util.ArrayList;
public class Purse
{
	public Purse()
	{
		coins = new ArrayList<Coin>();
	}

	public void add(Coin aCoin)
	{
		coins.add(aCoin);
	}

	public double getTotal()
	{
		double total = 0;
		for(int i = 0; i < coins.size(); i++)
		{
			Coin aCoin = coins.get(i);
			total = total + aCoin.getValue();
		}
		return total;
	}

	public boolean find(Coin aCoin)
	{
		for(Coin c: coins)
		{
			if(c.equals(aCoin))
				return true;
		}
		return false;
	}

	public int count(Coin aCoin)
	{
		int matches=0;
		for(Coin c:coins)
		{
			if(c.equals(aCoin))
				matches++;
		}
		return matches;
	}

	public Coin getMaxinum()
	{
		Coin max=coins.get(0);
		for(Coin c:coins)
		{
			if (c.getValue()>max.getValue())
				max=c;
		}
		return max;
	}

	public Coin getMininum()
	{
		if(coins.size()==0)
			return null;
		Coin min=coins.get(0);
		for(Coin c:coins)
		{
			if(c.getValue()<min.getValue())
				min=c;
		}
		return min;
	}

	private ArrayList<Coin> coins;
}
