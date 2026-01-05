package Day10;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageTask1 {

	public static final int wagePerhour=20;
	public static final int fullDayHour=8;
	public static final int partDayHour=4;
	public static final int fullTime=1;
	public static final int partTime=2;
	public static final int workinghoursperMonth=100;
	public static final int workingDayperMonth=20;
	public static int calculateWage(int wagePerhour, int DayHour) {
		int salary=wagePerhour*DayHour;
		return salary;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Wage Computation System");
		System.out.println("Enter which option you want");
		System.out.println("1.FullTime");
		System.out.println("2.PartTime");
		int option=sc.nextInt();
		Random random=new Random();
		
		int salary,dayCount=0,workingHours=0,totaldays=0;
		
		while((totaldays<workingDayperMonth) && (workingHours<workinghoursperMonth)) {
//		for(int i=1;i<=workingDayperMonth;i++) {
			int present=random.nextInt(2);
			totaldays++;
			
		switch(option){
		case 1:
			
			if(present==1) {
				dayCount++;
				workingHours+=fullDayHour;
				
			}
			break;
		case 2:
			if(present==1) {
				dayCount++;
				workingHours+=partDayHour;
			}
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		}
		System.out.println("Total No of Days: "+totaldays);
		System.out.println("No of Days Present: "+dayCount);
		System.out.println("No of Hours Working: "+workingHours);
		salary=calculateWage(wagePerhour,workingHours);
		System.out.println("Salary is "+salary);
		
	}
}
