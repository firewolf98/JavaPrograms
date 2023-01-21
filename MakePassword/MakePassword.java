public class MakePassword
{ 
	public static void main(String[] args)
	{ 
		String firstName = "Harold";
		String middleName = "Joseph";
		String lastName = "Hacker";
		// estrai l'iniziale 
		String initials = firstName.substring(0, 1) + middleName.substring(0, 1) + 			lastName.substring(0, 1);
		// aggiungi l'età
		int age = 19; 
		// età dell'utente
		String password = initials.toLowerCase() + age;
		System.out.println("Your password is " + password);
	}
}
