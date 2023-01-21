import java.util.Scanner;
public class GiocoTester
{
	public static void main(String[] args)	
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double sum=in.nextDouble();
		
		Gioco l=new Gioco();
		l.scommetti(n,sum);
	}
}	
		
