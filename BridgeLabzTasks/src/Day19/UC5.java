package Day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		String password=sc.next().trim();
		String pattern ="^(?=.*[A-Z])(?=.*[0-9])(?=(?:[^&*^%$#!]*[&*^%$#!]){1}[^&*^%$#!]*$)[A-Za-z0-9&*^%$#!]{8,}$";
	Pattern p=Pattern.compile(pattern);
		
		
		if(password.matches(pattern)) {
			System.out.println("Entered password is valid");
		}
		else {
			System.out.println("Entered  password is not valid");
		}

	}

}
