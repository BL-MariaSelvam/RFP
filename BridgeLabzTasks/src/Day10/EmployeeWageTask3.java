package Day10;

import java.util.Scanner;

public class EmployeeWageTask3 {

	public static void main(String[] args) {
		CompanyclsTask3 data=new CompanyclsTask3("TCS",20,8, 4, 1, 2, 100, 20);
		CompanyclsTask3 data1=new CompanyclsTask3("Infosys",30,8, 4, 1, 2, 100, 20);
		CompanyclsTask3 data2=new CompanyclsTask3("WIPRO",40,8, 4, 1, 2, 100, 20);
		
		System.out.println("Employee Wage Computation System");
		System.out.println("Enter which option you want");
		System.out.println("1.FullTime");
		System.out.println("2.PartTime");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		CompanyclsTask3[] companies= {data,data1,data2};
		for(CompanyclsTask3 company:companies) {
			
			company.calculateWage(option);
			System.out.println("My Company name is"+company.getCompanyName()+"  Salary is "+company.getTotalWage());
		}
	}

}
