package Day20;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner sc=new Scanner(System.in);

	public boolean testFirstName() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter FirstName");
		String firstName=sc.next();
		
		String pattern="^[A-Z]{1}+[a-z]{2,}$";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(firstName);
		
		if(m.find()) {
			System.out.println("Entered userName is valid");
			return true;
		}
		else {
			System.out.println("Username should have minimum 3 chars and starts with capital");
			return false;
			
		}
	}
	
	public boolean testLastName() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter LastName");
		String lastName=sc.next();
		
		String pattern="^[A-Z]{1}+[a-z]{2,}$";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(lastName);
		
		if(m.find()) {
			System.out.println("Entered user Last Name is valid");
			return true;
		}
		else {
			System.out.println("User lastname should have minimum 3 chars and starts with capital");
			return false;
			
		}
	}
	
	
	public boolean testEmail(String email) {
		
		String pattern="^[a-z0-9\\+]+([\\.\\-a-z0-9]+)?@[a-z0-9]+\\.[a-z]+([\\.a-z]{4}+)?$";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(email);
		
		if(m.find()) {
			System.out.println("Entered email is valid");
			return true;
		}
		else {
			System.out.println("Entered email is not valid");
			return false;
		}
	}

	
	public boolean testMobile() {
		System.out.println("Enter the mobile No");
		String mobile=sc.nextLine().trim();
		String pattern="^91\\s[6-9][0-9]{9}$";
		Pattern p=Pattern.compile(pattern);
		
		
		if(mobile.matches(pattern)) {
			System.out.println("Entered mobile No is valid");
			return true;
		}
		else {
			System.out.println("Entered  mobile No is not valid");
			return false;
		}

	}
	
	public boolean testPassword() {
		System.out.println("Enter the password");
		String password=sc.next().trim();
		String pattern ="^(?=.*[A-Z])(?=.*[0-9])(?=(?:[^&*^%$#!]*[&*^%$#!]){1}[^&*^%$#!]*$)[A-Za-z0-9&*^%$#!]{8,}$";
	Pattern p=Pattern.compile(pattern);
		
		
		if(password.matches(pattern)) {
			System.out.println("Entered password is valid");
			return true;
		}
		else {
			System.out.println("Entered  password is not valid");
			return false;
		}

	}
	
}
