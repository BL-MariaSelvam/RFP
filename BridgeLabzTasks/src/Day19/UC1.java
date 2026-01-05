package Day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter FirstName");
		String firstName=sc.next();
		
		String pattern="^[A-Z]{1}+[a-z]{2,}$";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(firstName);
		
		if(m.find()) {
			System.out.println("Entered userName is valid");
		}
		else {
			System.out.println("Username should have minimum 3 chars and starts with capital");
		}

	}

}
