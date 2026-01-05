package Day11_12;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account No:");
		String accNo=sc.next();
		System.out.println("Enter Account Name:");
		String accName=sc.next();
		System.out.println("Enter Account Type:");
		String accType=sc.next();
		System.out.println("Enter initial Amount:");
		double amount=sc.nextDouble();
		Account account=new Account(accNo,accName,accType,amount);
		System.out.println("Account No: "+account.getAccountNo());
		System.out.println("Account Name: "+account.getAccountName());
		System.out.println("Account Type: "+account.getAccountType());
			do {
				System.out.println("Enter the option you want:");
				System.out.println("1.Check Balance");
				System.out.println("2.Deposit");
				System.out.println("3.Withdraw");
				System.out.println("4.Exit");
					int option=sc.nextInt();
					double changeBalance;
					switch(option) {
				
				
				case 1:
					System.out.println("Balance"+account.getAccountBalance());
					break;
				case 2:
					System.out.println("Enter the amount to be deposited");
					double depositAmount=sc.nextDouble();
					changeBalance=account.getAccountBalance()+depositAmount;
					account.setAccountBalance(changeBalance);
					System.out.println("Amount added. current balance is "+account.getAccountBalance());
					break;
				case 3:
					System.out.println("Enter the amount to be withdrawn");
					double withdrawnAmount=sc.nextDouble();
					account.debit(withdrawnAmount);
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid option");
					break;
				}
				}while(true);
	}

}
