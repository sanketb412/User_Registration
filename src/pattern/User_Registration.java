package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User_Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("..###..Welcome to User Registration program..###..");
		@SuppressWarnings("resource")
		Scanner fn = new Scanner(System.in);
		System.out.println("Enter the First Name to Check");
		String firstname = fn.nextLine();
		boolean x = Pattern.matches("^([A-Z]{1}[a-zA-Z]{2,})$", firstname);
		if (x == true) {
			System.out.println("Valid Name\n");
		} else {
			System.out.println("Invalid Name\n");
		}
		@SuppressWarnings("resource")
		Scanner ln = new Scanner(System.in);
		System.out.println("Enter the Last Name to Check");
		String lastname = ln.nextLine();
		boolean y = Pattern.matches("^([A-Z]{1}[a-zA-Z]{2,})$", lastname);
		if (y == true) {
			System.out.println("Valid Name\n");
		} else {
			System.out.println("Invalid Name\n");
		}
		
	}

}
