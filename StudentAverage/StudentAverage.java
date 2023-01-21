public class StudentAverage
{
	public StudentAverage()
	{
		mark=0;	
		average=0;
	}

	public StudentAverage (int initialAverage)
	{
		average=initialAverage;
	}

	public void addMark (int voto)
	{
		int newMark=mark+voto;
		mark=newMark;
		i=i+1;
		average=mark/i;
	}
	
	public int getAverage()
	{
		return average;
	}

	private int i;
	private int mark;
	private int average;
}
