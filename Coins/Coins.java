import java.util.Scanner;
public class Coins
{
	public static void main(String[] args)
	{
		final double PENNY_VALUE = 0.01;
		final double NICKEL_VALUE = 0.05;
		final double DIME_VALUE = 0.1;
		final double QUARTER_VALUE = 0.25;
		Scanner in = new Scanner(System.in);
		System.out.println("Quanti penny hai?");
		int pennies = in.nextInt();
		System.out.println("Quanti nickel hai?");
		int nickels = in.nextInt();
		System.out.println("Quanti dime hai?");
		int dimes = in.nextInt();
		System.out.println("Quanti quarter hai?");
		int quarters = in.nextInt();
		double total = pennies * PENNY_VALUE + nickels * NICKEL_VALUE + dimes * DIME_VALUE 			+ quarters * QUARTER_VALUE;
		// valore totale delle monete
		System.out.println("Total value = " + total);
	} //chiude il corpo del main
} //chiude la definizione della classe
