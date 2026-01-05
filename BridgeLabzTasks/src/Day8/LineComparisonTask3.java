package Day8;

import java.util.Scanner;

public class LineComparisonTask3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of lines to compare");
		int num=sc.nextInt();
		Double[] arr=new Double[2];
		
		for(int i=0;i<num;i++) {
			System.out.println("Coordinates of Line"+num);
			System.out.println("Enter the Coordinates of x1 and y1");
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			System.out.println("Enter the Coordinates of x2 and y2");
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
		
		Point1 p1=new Point1(x1,y1);
		Point1 p2=new Point1(x2,y2);
		
		Line1 l1=new Line1(p1,p2);
		System.out.println("The Length of a Line"+num+" is"+l1.getLength());
		arr[i]=l1.getLength();
		}
		if((arr[0].compareTo(arr[1]))==0) {
			System.out.println("Both lines are equal");
		}
		else if((arr[0].compareTo(arr[1]))>0) {
			System.out.println("Line1 is greater");
		}
		else {
			System.out.println("Line2 is Greater");
		}
	}

}
