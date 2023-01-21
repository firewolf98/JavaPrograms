public class SodaMachineTester
{
	public static void main(String args[])
	{
		SodaMachine x=new SodaMachine(200,0);
		System.out.println(x.getCans());
		System.out.println(x.getTokens());
		x.addCans(200);
		System.out.println(x.getCans());
		System.out.println(x.getTokens());	
		x.insertTokens();
		System.out.println(x.getCans());
		System.out.println(x.getTokens());
	}
}
