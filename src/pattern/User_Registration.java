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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email to Check");
		String email = sc.nextLine();
		boolean mail = Pattern.matches("^([a-zA-Z]{3,}([+_.-][a-z])*)+@[a-z]+.co[+.in]*$", email);
		if (mail == true) {
			System.out.println("Valid Email\n");
		} else {
			System.out.println("Invalid Email\n");
		}
		
		Scanner ph = new Scanner(System.in);
		System.out.println("Enter the Phone number");
		String num = ph.nextLine();
		boolean number = Pattern.matches("^[+91]{2}\\s{1}([789]{1}[0-9]{9})$", num);
		if (number == true) {
			System.out.println("Valid PhoneNumber\n");
		} else {
			System.out.println("Invalid PhoneNumber\n");
		}
		
		Scanner ps = new Scanner(System.in);
		System.out.println("Enter the Password");
		String pc = ps.nextLine();
		boolean codepc = Pattern.matches("^((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$&%]).{8,})$", pc);
		if (codepc == true) {
			System.out.println("Valid Password\n");
		} else {
			System.out.println("Invalid Password\n");
		}

	}

}
