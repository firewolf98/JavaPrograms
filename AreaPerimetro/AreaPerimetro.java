import java.awt.Rectangle;
public class AreaPerimetro
{
	public static void main (String args[])
	{
		Rectangle box= new Rectangle(5,10,20,30);
		int area=20*30;
		int perimetro=20*2+30*2;
		System.out.print("L'area è: ");
		System.out.println(area);
		System.out.print("Il perimetro è: ");
		System.out.println(perimetro);
	}
}
