public class RegistratoreCassa
{
	public RegistratoreCassa()
	{
		prezzo=0;
		pagato=0;
	}

	public RegistratoreCassa(double prezzo,double pagato)
	{
		this.prezzo=prezzo;
		this.pagato=pagato;
	}

	public double getPrezzo()
	{
		return prezzo;
	}

	public double getPagato()
	{
		return pagato;
	}

	public double getResto()
	{
		return pagato-prezzo;
	}

	private  double prezzo,pagato;
}
		
