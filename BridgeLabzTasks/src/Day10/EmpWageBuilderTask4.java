package Day10;

import java.util.Random;
import java.util.Scanner;

public class EmpWageBuilderTask4 implements EmpWageInterface{
	
	private CompanyTask4[] companies;
	private int noOfCompanies=0;
		
	public EmpWageBuilderTask4(int maxCompanies) {
		companies=new CompanyTask4[maxCompanies];
			}

	@Override
	public void addCompanywages(String companyName, int wagePerHour,int fullDayHour, int partDayHour,int workingDaysPerMonth, int workingHoursPerMonth) {
		
		companies[noOfCompanies]=new CompanyTask4(companyName,wagePerHour,fullDayHour, partDayHour, workingDaysPerMonth,workingHoursPerMonth);
		noOfCompanies++;
	}

	@Override	
	public void computeWage() {
		System.out.println("Enter which option you want");
		System.out.println("1.FullTime");
		System.out.println("2.PartTime");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		for(int i=0;i<noOfCompanies;i++) {
			computeCompanywage(companies[i],option);
			System.out.println("Company name is: "+companies[i].getCompanyName()+" Wages for that company is "+companies[i].getTotalWages());
		}
		
	}

	private void computeCompanywage(CompanyTask4 companyTask4,int option) {
		Random random=new Random();
		
		int salary;
		int dayCount=0;
		int workingHours=0;
		int totaldays=0;
	
		while((totaldays<companyTask4.getWorkingDayperMonth()) && (workingHours<companyTask4.getWorkinghoursperMonth())) {

			int present=random.nextInt(2);
			totaldays++;
		
			switch(option){
			case 1:
				if(present==1) {
					dayCount++;
					workingHours+=companyTask4.getFullDayHour();
					}
				break;
			case 2:
				if(present==1) {
					dayCount++;
					workingHours+=companyTask4.getPartDayHour();
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
		System.out.println("Company Name: "+companyTask4.getCompanyName());
		System.out.println("Total No of Days: "+totaldays);
		System.out.println("No of Days Present: "+dayCount);
		System.out.println("No of Hours Working: "+workingHours);
		
		salary=companyTask4.getWagePerhour()*workingHours;
		companyTask4.setTotalWages(salary);
	}
	
	
	
	
	

}
