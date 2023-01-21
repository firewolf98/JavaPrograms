import java.util.Scanner;
import java.io.*;
public class InputChecker
{
	public InputChecker(String s)
	{
		ris=s;
	}

	public static InputChecker create(Scanner a)
	{
		String r;
		r=a.next();
		return new InputChecker(r);
	}

	public void result(PrintStream p)
	{
		if(ris.equals("s") || ris.equals("si") || ris.equals("ok") || ris.equals("certo") 			|| ris.equals("perche' no?"))	
			p.print("OK");
		else if(ris.equals("n") || ris.equals("no"))
			p.print("FINE");
		else
			p.print("DATO NON CORRETTO!");
	}

	private String ris;
}
