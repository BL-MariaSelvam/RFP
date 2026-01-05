package Day6;

import java.util.Scanner;

public class PrimeNumberTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find prime number");
		int num=sc.nextInt();
		int i,count=0;
		int[] num1=new int[100];
		
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				for(int k=0;k<i;k++) {
					num1[k]=i;
				}
			}
		}
		if(count>2) {
			System.out.println(num+" is not prime number");
		}
		else {
			System.out.println(num+" is the prime number");
		}
		
	}

}
