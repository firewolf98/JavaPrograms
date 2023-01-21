import java.awt.Rectangle;
public class MoveSquare
{
	public static void main (String args[])
	{
		Rectangle box= new Rectangle(10,20,40,40);
		box.translate(10,0);
		System.out.print("x: ");
		System.out.println(box.getX());
		System.out.println("Expected: 20");
		System.out.print("y: ");
		System.out.println(box.getY());
		System.out.println("Expected: 20");
	}
}
