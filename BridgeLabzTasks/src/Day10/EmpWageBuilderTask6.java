package Day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class EmpWageBuilderTask6 implements EmpWageInterface1{
	
	private List<CompanyTask4> companiesList;
	private Map<String, CompanyTask4> companyWage;
	public static final int fullTime=1;
	public static final int partTime=2;
	
		
	public EmpWageBuilderTask6() {
		companiesList=new ArrayList<>();
		companyWage=new HashMap<>();
			}

	@Override
	public void addCompanies(String companyName, int wagePerHour,int fullDayHour, int partDayHour,int workingDaysPerMonth, int workingHoursPerMonth) {
		
		CompanyTask4 companies=new CompanyTask4(companyName,wagePerHour,fullDayHour, partDayHour, workingDaysPerMonth,workingHoursPerMonth);
		companiesList.add(companies);
		companyWage.put(companyName, companies);
	}

	@Override	
	public void computewage() {
		System.out.println("Enter which option you want");
		System.out.println("1.FullTime");
		System.out.println("2.PartTime");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		
		for(CompanyTask4 company:companiesList) {
			computeCompanywage(company,option);
			System.out.println("Company name is: "+company.getCompanyName()+"Daily wage for that company is "+company.getDailyWages()+" TotalWages for that company is "+company.getTotalWages());
		}
		
	}
	
	@Override
	public int getTotalwage(String companyname) {
		// TODO Auto-generated method stub
		CompanyTask4 companylist=companyWage.get(companyname);
		
		if(companylist==null) {
			System.out.println("Company not found");
			return 0;
		}
		
		
		return companylist.getTotalWages();
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
		if((option==fullTime)) {
			int dailywages=companyTask4.getWagePerhour()*companyTask4.getFullDayHour();
			companyTask4.setDailyWages(dailywages);
			System.out.println("daily wages "+dailywages);
		}
		else {
			int dailywages=companyTask4.getWagePerhour()*companyTask4.getPartDayHour();
			companyTask4.setDailyWages(dailywages);
			System.out.println("daily wages "+dailywages);
		}
		
		
	}

	

	
	
	
	


}
