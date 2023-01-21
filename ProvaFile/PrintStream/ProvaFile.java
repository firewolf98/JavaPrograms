import java.io.*;

public class ProvaFile
{
	public static void main(String args[]) throws Exception
	{
		File usFile;
		PrintStream usPS;
		usFile=new File("address.txt");
		usPS= new PrintStream(usFile);
		usPS.println("Università di Salerno");
		usPS.println("Facoltà di Scienze");
		usPS.println("Via Ponte don Melillo");
		usPS.println("84084 Fisciano(SA), Italia");
	}
}
