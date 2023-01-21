import java.util.Scanner;
public class Month
{
	public Month(String s,int c,int d)
	{
		name=s;
		x=c;
		year=d;
	}

	public static Month create(Scanner in)
	{
		String n=new String();
		int c=in.nextInt();
		int d=in.nextInt();
		switch(c)
		{
			case 1: n="Gennaio"; break;
			case 2: n="Febbraio"; break;
			case 3: n="Marzo"; break;
			case 4: n="Aprile"; break;
			case 5: n="Maggio"; break;
			case 6: n="Giugno"; break;
			case 7: n="Luglio"; break;
			case 8: n="Agosto"; break;
			case 9: n="Settembre"; break;
			case 10: n="Ottobre"; break;
			case 11: n="Novembre"; break;
			case 12: n="Dicembre"; break;
			default: System.out.print("Mese non valido"); break;
		}
		return new Month(n,c,d);
	}

	public String getMonth()
	{
		return name;
	}

	public void dayMonth()
	{
		if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12)
			day=31;
		else if(x==4 || x==6 || x==9 || x==11)
			day=30;
		else if(x==2)
			day=28;
		else 
			System.out.print("Mese non valido");
	}
	
	public int getDays()
	{
		return day;
	}

	public int getYear()
	{
		return year;
	}	

	private int x,day,year;
	private String name;
}
