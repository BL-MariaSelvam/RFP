package Day10;

public class CompanyTask4 {
	
	private String companyName;
	private int wagePerhour;
	private int fullDayHour;
	private int partDayHour;
	
	private int workinghoursperMonth;
	private int workingDayperMonth;
	private int totalWages;
	private int dailyWages;
	
	public int getDailyWages() {
		return dailyWages;
	}
	public void setDailyWages(int dailyWages) {
		this.dailyWages = dailyWages;
	}
	public int getTotalWages() {
		return totalWages;
	}
	public void setTotalWages(int totalWages) {
		this.totalWages = totalWages;
	}
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
	
	public CompanyTask4(String companyName, int wagePerhour, int fullDayHour, int partDayHour,  int workinghoursperMonth, int workingDayperMonth) {
		super();
		this.companyName = companyName;
		this.wagePerhour = wagePerhour;
		this.fullDayHour = fullDayHour;
		this.partDayHour = partDayHour;
		this.workinghoursperMonth = workinghoursperMonth;
		this.workingDayperMonth = workingDayperMonth;
	}
	

}
