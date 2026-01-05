package Day1617;

import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int empIds[]=new int[7];
		System.out.println("Enter 6 employeeIds");
		for(int i=0;i<empIds.length;i++) {
			empIds[i]=sc.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<empIds.length;i++) {
			System.out.println(empIds[i]);
		}
		insertionSort(empIds);
		
	}

	private static void insertionSort(int[] empIds) {
		int n=empIds.length;
		
		for(int i=1;i<n;i++) {
			int key=empIds[i];
			int j=i-1;
			
			while(j>=0 && (empIds[j]>key)) {
				empIds[j+1]=empIds[j];
				j=j-1;
			}
			empIds[j+1]=key;
		}
		
	}


}
