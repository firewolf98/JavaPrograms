import java.util.Scanner;
import java.io.*;

public class ClienteTester
{
	public static void main(String args[]) throws Exception
	{
		Scanner in= new Scanner(System.in);
		Cliente a;
		a=Cliente.create(in);
		a.print(System.out);
	}
}
