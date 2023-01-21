public class RegistratoreCassaTester
{
	public static void main(String[] args)
	{
		RegistratoreCassa r=new RegistratoreCassa(30,50);
		System.out.print("Il prezzo del prodotto da pagare è: ");
		System.out.println(r.getPrezzo());
		System.out.print("Il cliente ha pagato importo: ");
		System.out.println(r.getPagato());
		System.out.print("Il resto da restituire è di: ");
		System.out.println(r.getResto());
	}
}
