package Day1617;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[7];
		System.out.println("Enter 7 students marks");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		bubbleSort(marks);
		
	}

	private static void bubbleSort(int[] marks) {
		int i,j,temp;
		for(i=0;i<marks.length;i++) {
			for(j=0;j<marks.length-i-1;j++) {
				if(marks[j]>marks[j+1]) {
					temp=marks[j];
					marks[j]=marks[j+1];
					marks[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int k=0;k<marks.length;k++) {
			System.out.println(marks[k]);
		}
		
	}

}
