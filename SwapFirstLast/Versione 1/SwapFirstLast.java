public class SwapFirstLast
{
	public static void main(String args[])
	{
		String word="CARATTERE";
		char first,last;
		first=word.charAt(0);
		int len=word.length();
		last=word.charAt(len-1);
		String word1=last+word.substring(1,len-1)+first;
		System.out.println(word1);
	}
}
	
