import java.io.*;
import java.util.Scanner;
public class InputCheckerTest
{
	public static void main(String[] args) throws Exception
	{
		Scanner in=new Scanner(System.in);
		InputChecker a;
		a=InputChecker.create(in);
		a.result(System.out);
	}
}
