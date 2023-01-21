public class SearchChar
{
	public static void main(String[] args)
	{
		String s=args[0];
		int i=s.length();
		int n=s.substring(1,i).indexOf(s.substring(0,1));
		System.out.println(n+1);
	}
}
