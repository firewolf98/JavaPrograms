public class ScarafaggiTester
{
	public static void main(String[] args)
	{
		Scarafaggi s=new Scarafaggi(500);
		System.out.println(s.getPopolo());
		s.raddPop();
		s.dimPop();
		System.out.println(s.getPopolo());
	}
}
