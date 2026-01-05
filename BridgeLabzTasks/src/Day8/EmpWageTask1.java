package Day8;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

class Employee{
	private int empId;
	private String empName;
	private String doj;
	private double wagePerHour;
	private double fullDayperHour;
	public int workingDays=20;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public double getWagePerHour() {
		return wagePerHour;
	}
	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	public double getFullDayperHour() {
		return fullDayperHour;
	}
	public void setFullDayperHour(double fullDayperHour) {
		this.fullDayperHour = fullDayperHour;
	}
	public Employee(int empId, String empName, String doj, double wagePerHour,double fullDayperHour) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.doj = doj;
		this.wagePerHour = wagePerHour;
		this.fullDayperHour = fullDayperHour;
	}
	public Employee() {
		super();
	}
public void calculateWage() {
	int dayCount=0;
	System.out.println("Employee Id: "+empId);
	System.out.println("Employee Name: "+empName);
	System.out.println("Employee Doj: "+doj);
	Random random=new Random();
	for(int i=1;i<=workingDays;i++) {
	int num=random.nextInt(2);
	
	if(num==1)
	{
		dayCount++;
	}
	}
	System.out.println("The days present "+dayCount);
	System.out.println("Daily Wage:"+(dayCount*wagePerHour*fullDayperHour));
}
	
	
}
public class EmpWageTask1{
	public static int fullTime=1;
	public static int partTime=2;

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Select the option you want");
		System.out.println("1.FullTime work");
		System.out.println("2.PartTime work");
		int option=sc.nextInt();
		System.out.println("Enter the empId, empName and doj");
		int empId=sc.nextInt();
		String empName=sc.next();
		String doj=sc.next();
		if(option==fullTime) {
			System.out.println("Enter the wagePeryear,fullDayperHour");
			double wagePerHour=sc.nextDouble();
			double fullDayperHour=sc.nextDouble();
			Employee emp=new Employee(empId,empName,doj,wagePerHour,fullDayperHour);
			emp.calculateWage();
		}
		else if(option==partTime) {
			System.out.println("Enter the wagePeryear,fullDayperHour");
			double wagePerHour=sc.nextDouble();
			double fullDayperHour=sc.nextDouble();
			Employee emp1=new Employee(empId,empName,doj,wagePerHour,fullDayperHour);
			emp1.calculateWage();
		}
		else {
			System.out.println("No work");
		}
			
		
	}
}
	
