import java.io.*;
import java.util.Scanner;
public class NumeriTast
{
	public static void main(String[] args) throws Exception 
	{
		File us= new File("Numeri");
		Scanner in=new Scanner(us);
		double a=in.nextDouble();
		double b=in.nextDouble();
		double c=in.nextDouble();

		if(a<b && b<c)
		{
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
		}
		else if(a<c && c<b)
		{
			System.out.print(a);
			System.out.print(c);
			System.out.print(b);
		}
		else if(b<a && a<c)
		{
			System.out.print(b);
			System.out.print(a);
			System.out.print(c);
		}
		else if(c<a && a<b)
		{
			System.out.print(c);
			System.out.print(a);
			System.out.print(b);
		}
		else if(b<c && c<a)
		{
			System.out.print(b);
			System.out.print(c);
			System.out.print(a);
		}
		else 
		{
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
		}
	}
}
