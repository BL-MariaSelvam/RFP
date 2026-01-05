package Day10;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageTask2 {

	public static void main(String[] args) {
		CompanyTask2 data=new CompanyTask2("TCS",20,8, 4, 1, 2, 100, 20);
		CompanyTask2 data1=new CompanyTask2("Infosys",30,8, 4, 1, 2, 100, 20);
		CompanyTask2 data2=new CompanyTask2("WIPRO",40,8, 4, 1, 2, 100, 20);
		
		System.out.println("Employee Wage Computation System");
		System.out.println("Enter which option you want");
		System.out.println("1.FullTime");
		System.out.println("2.PartTime");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		CompanyTask2[] companies= {data,data1,data2};
		for(CompanyTask2 company:companies) {
			
			int salary=EmpWageCalculatorTask2.calculateWage(option,company);
			System.out.println("Salary is "+salary);
		}
			}
	}
