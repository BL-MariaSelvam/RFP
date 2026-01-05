package Day10;

import java.util.Random;

public class EmpWageCalculatorTask2 {
	
	
	
	
	public static int calculateWage(int option,CompanyTask2 company) {
	
		
		Random random=new Random();
	
		int salary;
		int dayCount=0;
		int workingHours=0;
		int totaldays=0;
	
		while((totaldays<company.getWorkingDayperMonth()) && (workingHours<company.getWorkinghoursperMonth())) {

			int present=random.nextInt(2);
			totaldays++;
		
			switch(option){
			case 1:
				if(present==1) {
					dayCount++;
					workingHours+=company.getFullDayHour();
					}
				break;
			case 2:
				if(present==1) {
					dayCount++;
					workingHours+=company.getPartDayHour();
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
		System.out.println("Company Name: "+company.getCompanyName());
		System.out.println("Total No of Days: "+totaldays);
		System.out.println("No of Days Present: "+dayCount);
		System.out.println("No of Hours Working: "+workingHours);
		
		salary=company.getWagePerhour()*workingHours;
		return salary;
		
	}
}
