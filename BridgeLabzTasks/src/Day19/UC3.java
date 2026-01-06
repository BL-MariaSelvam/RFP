package Day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email");
		String email=sc.next();
		String pattern="^[a-z0-9\\+]+([\\.\\-a-z0-9]+)?@[a-z0-9]+\\.[a-z]+([\\.a-z]{4}+)?$";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(email);
		
		if(m.find()) {
			System.out.println("Entered email is valid");
		}
		else {
			System.out.println("Entered email is not valid");
		}

	}

}
