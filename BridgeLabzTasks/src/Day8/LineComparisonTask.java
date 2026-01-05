package Day8;

import java.util.Scanner;

class Point{
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

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}
class Line{
	private Point p1;
	private Point p2;
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Line(Point p1, Point p2) {
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
public class LineComparisonTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Coordinates of x1 and y1");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		System.out.println("Enter the Coordinates of x2 and y2");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		
		Point p1=new Point(x1,y1);
		Point p2=new Point(x2,y2);
		
		Line l1=new Line(p1,p2);
		System.out.println("The Length of a Line is"+l1.getLength());
		

	}

}
