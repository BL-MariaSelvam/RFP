package Day6;

import java.util.Scanner;

public class FibonacciTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of terms for Fibonacci Series");
		int terms=sc.nextInt();
		int i,num1=0,num2=1,num3;
		System.out.println("Fibonacci Series");
		System.out.println(num1);
		System.out.println(num2);
		for(i=1;i<=terms;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
		
	}

}
