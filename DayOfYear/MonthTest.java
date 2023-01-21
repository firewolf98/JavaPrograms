import java.util.Scanner;
public class MonthTest
{
	public static void main(String[] args) throws Exception
	{
		Month m;
		Scanner in=new Scanner(System.in);
		m=Month.create(in);
		m.dayMonth();
		System.out.println(m.getMonth());
		System.out.println(m.getDays());
		System.out.println(m.getYear());
	}
}
