package Day10;

import java.util.Random;

public class CompanyclsTask3 {
	
	private String companyName;
	private int wagePerhour;
	private int fullDayHour;
	private int partDayHour;
	private int fullTime;
	private int partTime;
	private int workinghoursperMonth;
	private int workingDayperMonth;
	private int totalWage;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getWagePerhour() {
		return wagePerhour;
	}
	public void setWagePerhour(int wagePerhour) {
		this.wagePerhour = wagePerhour;
	}
	public int getFullDayHour() {
		return fullDayHour;
	}
	public void setFullDayHour(int fullDayHour) {
		this.fullDayHour = fullDayHour;
	}
	public int getPartDayHour() {
		return partDayHour;
	}
	public void setPartDayHour(int partDayHour) {
		this.partDayHour = partDayHour;
	}
	public int getFullTime() {
		return fullTime;
	}
	public void setFullTime(int fullTime) {
		this.fullTime = fullTime;
	}
	public int getPartTime() {
		return partTime;
	}
	public void setPartTime(int partTime) {
		this.partTime = partTime;
	}
	public int getWorkinghoursperMonth() {
		return workinghoursperMonth;
	}
	public void setWorkinghoursperMonth(int workinghoursperMonth) {
		this.workinghoursperMonth = workinghoursperMonth;
	}
	public int getWorkingDayperMonth() {
		return workingDayperMonth;
	}
	public void setWorkingDayperMonth(int workingDayperMonth) {
		this.workingDayperMonth = workingDayperMonth;
	}
	public int getTotalWage() {
		return totalWage;
	}
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	public CompanyclsTask3(String companyName, int wagePerhour, int fullDayHour, int partDayHour, int fullTime,
			int partTime, int workinghoursperMonth, int workingDayperMonth) {
		super();
		this.companyName = companyName;
		this.wagePerhour = wagePerhour;
		this.fullDayHour = fullDayHour;
		this.partDayHour = partDayHour;
		this.fullTime = fullTime;
		this.partTime = partTime;
		this.workinghoursperMonth = workinghoursperMonth;
		this.workingDayperMonth = workingDayperMonth;
	}
	public void calculateWage(int option) {
		// TODO Auto-generated method stub
		Random random=new Random();
		
		int salary;
		int dayCount=0;
		int workingHours=0;
		int totaldays=0;
	
		while((totaldays<workingDayperMonth) && (workingHours<workinghoursperMonth)) {

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
		System.out.println("Company Name: "+companyName);
		System.out.println("Total No of Days: "+totaldays);
		System.out.println("No of Days Present: "+dayCount);
		System.out.println("No of Hours Working: "+workingHours);
		
		totalWage=wagePerhour*workingHours;
	
	}
	

}

