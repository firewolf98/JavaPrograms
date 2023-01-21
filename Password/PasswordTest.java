import java.util.Scanner;
public class PasswordTest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Password p;		
		do 
		{
			p=Password.insert(in);
		}
		while(p.result()==0);
	}
}
