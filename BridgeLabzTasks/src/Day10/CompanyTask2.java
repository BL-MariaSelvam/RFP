package Day10;

public class CompanyTask2 {
	
	private String companyName;
	private int wagePerhour;
	private int fullDayHour;
	private int partDayHour;
	private int fullTime;
	private int partTime;
	private int workinghoursperMonth;
	private int workingDayperMonth;
	
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
	
	public CompanyTask2(String companyName, int wagePerhour, int fullDayHour, int partDayHour, int fullTime,
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
	

}
