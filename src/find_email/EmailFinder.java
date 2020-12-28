package find_email;

import java.util.Scanner;

public class EmailFinder {

	public static void main(String[] args) {
		emaillList email = new emaillList(12);

	
		email.addEmail("write@yahoo.com");
		email.addEmail("Pepper@aol.com");
		email.addEmail("ac@gmail.com");
		email.addEmail("bobbywagner@yahoo.com");
		email.addEmail("msn@hotmail.com");
		email.addEmail("americaonline@aol.com");
		email.addEmail("google@gmail.com");
		email.addEmail("Drose@msn.com");
		email.addEmail("old@compuserve.com");
		email.addEmail("mjackson@gmail.com");
		email.addEmail("whouston@yahoo.com");
		email.addEmail("hello@gmail.com");

	System.out.println("Provide a email to search for");
	Scanner scan = new Scanner(System.in);
	String searchFor = scan.nextLine();
	
	boolean foundMatch =email.foundMatch(searchFor);
	if (foundMatch) {
		System.out.println(searchFor + " is in the database");
	}
	else {
		System.out.println(searchFor + " was not found");
	}
	
	}

}
