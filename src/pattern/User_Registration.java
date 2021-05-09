package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User_Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("..###..Welcome to User Registration program..###..");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name for email to Check");
		String email = sc.nextLine();
		boolean x = Pattern.matches("^([A-Z]{1}[a-zA-Z]{2,})$", email);
		if (x == true) {
			System.out.println("Valid Name");
		} else {
			System.out.println("Invalid Name");
		}
	}

}
