package Day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile No");
		String mobile=sc.nextLine().trim();
		String pattern="^91\\s[6-9][0-9]{9}$";
		Pattern p=Pattern.compile(pattern);
		
		
		if(mobile.matches(pattern)) {
			System.out.println("Entered mobile No is valid");
		}
		else {
			System.out.println("Entered  mobile No is not valid");
		}

	}

}
