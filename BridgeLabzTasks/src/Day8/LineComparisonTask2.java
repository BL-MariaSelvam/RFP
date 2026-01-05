package Day8;

import java.util.Scanner;

class Point1{
	private double x,y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point1(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}
class Line1{
	private Point1 p1;
	private Point1 p2;
	public Point1 getP1() {
		return p1;
	}
	public void setP1(Point1 p1) {
		this.p1 = p1;
	}
	public Point1 getP2() {
		return p2;
	}
	public void setP2(Point1 p2) {
		this.p2 = p2;
	}
	public Line1(Point1 p1, Point1 p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	public double getLength() {
		double x1=p1.getX();
		double y1=p1.getY();
		double x2=p2.getX();
		double y2=p2.getY();
		return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
	}
}
public class LineComparisonTask2 {

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
		if(arr[0].equals(arr[1])) {
			System.out.println("Both lines are equal");
		}
		else {
			System.out.println("Both lines are not equal");
		}
	}

}
