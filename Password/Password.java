import java.util.Scanner;
public class Password
{
	public Password(String p)
	{
		pass=p;
	}

	public static Password insert(Scanner a)
	{
		System.out.print("Inserisci Password");
		String p=a.next();
		System.out.print("Reinserisci Password");
		String q=a.next();
		if(p.equals(q))
			return new Password(p);
		else
			return new Password("error");
	}

	public void verifica1()
	{
		if(pass.length()>=8)
			test1=true;
		else
			test2=false;
	}

	public void verifica2()
	{
		int i=0;
		while(i<pass.length())
		{		
			char c=pass.charAt(i);
			if(Character.isUpperCase(c))
			{	
				test2=true;
				break;
			}
			else
				test2=false;
		i++;
		}
	}

	public void verifica3()
	{
		int i=0;
		while(i<pass.length())
		{		
			char c=pass.charAt(i);
			if(Character.isDigit(c))
			{	
				test3=true;
				break;
			}
			else
				test3=false;
		i++;
		}
	}

	public void verifica4()
	{
		int i=0;
		while(i<pass.length())
		{		
			char c=pass.charAt(i);
			if(Character.isLowerCase(c))
			{	
				test4=true;
				break;
			}
			else
				test4=false;
		i++;
		}
	}

	public int result()
	{
		verifica1();
		verifica2();
		verifica3();
		verifica4();
		if(!test1 || !test2 || !test3 || !test4)
			return 0;
		else 
			return 1;
	}

	private boolean test1,test2,test3,test4;
	private String pass;
}
