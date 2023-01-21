public class FirstUpperChar
{
	public static void main(String[] args)
	{
		String x=args[0];
		int i=x.length();
		x=x.substring(0,1).toUpperCase().concat(x.substring(1,i));
		System.out.println(x);
	}
}
