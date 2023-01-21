public class ConcatIniz
{
	public static void main(String[] args)
	{
		String x,x1,x2;
		x=args[0];
		x1=args[1];
		x2=args[2];
		String s=x.substring(0,1).concat(x1.substring(0,1)).concat(x2.substring(0,1));
		System.out.println(s);
	}
}
