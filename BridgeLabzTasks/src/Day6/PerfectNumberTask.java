package Day6;

import java.util.Scanner;

public class PerfectNumberTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find perfect number");
		int num=sc.nextInt();
		int i,result=0;
		
		for(i=1;i<num;i++) {
			if(num%i==0) {
				result+=i;
			}
		}
		if(result==num) {
			System.out.println(num+" is the perfect number");
		}
		else {
			System.out.println(num+" is not perfect number");
		}

	}

}
