package Day11_12;

public class Account {
	private String accountNo;
	private String accountName;
	private double accountBalance;
	private String accountType;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Account(String accountNo, String accountName, String accountType, double accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}
	public void debit(double withdrawnAmount) {
		if(accountBalance<withdrawnAmount) {
			System.out.println("Insufficient Balance. ");
		}
		else {
			accountBalance-=withdrawnAmount;
			System.out.println("Amount withdrawn. current balance is "+accountBalance);
		}
		
	}
	
	

}
