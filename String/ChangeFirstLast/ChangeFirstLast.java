public class ChangeFirstLast
{
	public static void main(String[] args)
	{
		String s="Pallone";
		String s1=s.substring(0,1);
		String s2=s.substring(6,7);
		s=s2.concat(s.substring(1,6)).concat(s1);
		System.out.println(s);
	}
}
