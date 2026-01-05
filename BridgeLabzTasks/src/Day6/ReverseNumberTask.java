package Day6;

import java.util.Scanner;

public class ReverseNumberTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find Reverse number");
		int num=sc.nextInt();
		int temp=num;
		int reverse=0,rem;
		while(num>0) {
			rem=num%10;
			reverse=(reverse*10)+rem;
			num=num/10;
		}

		System.out.println("The reverse of a number "+temp+" is "+reverse);
	}

}
