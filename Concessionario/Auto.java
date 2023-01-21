public class Auto 
{
	public Auto (String name,String marca,String targa,int km,int serbatoio)
	{
		nome=name;
		marca=marca;
		targa=targa;
		this.km=km;
		this.serbatoio=serbatoio;
	}

	public int autonomia ()
	{
		durata=km*serbatoio;
		return durata;
	}

	private String nome,marca,targa;
	private int serbatoio,km,durata;
}
