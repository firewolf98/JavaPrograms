public class StudentAverageTester
{
	public static void main(String args[])
	{
		StudentAverage x=new StudentAverage();
		System.out.println(x.getAverage());
		x.addMark(30);
		System.out.println(x.getAverage());
		x.addMark(26);
		System.out.println(x.getAverage());	
	}
}
