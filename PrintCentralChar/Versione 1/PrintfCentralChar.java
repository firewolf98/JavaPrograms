public class PrintfCentralChar 
{
	public static void main(String args[]) 
	{
		String word="CARATTERE";
		int centre;
		centre=word.length()/2;
		System.out.print("Il carattere centrale è: ");
		System.out.println(word.substring(centre,centre+1));
	}
}
