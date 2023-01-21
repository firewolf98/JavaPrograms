import java.awt.Rectangle;
public class MoveTester
{
	public static void main (String args[])
	{
		Rectangle box= new Rectangle(5,10,20,30);
		box.add(0,0);
		System.out.print("x: ");
		System.out.println(box.getX());
		System.out.print("y: ");
		System.out.println(box.getY());
	}
}
