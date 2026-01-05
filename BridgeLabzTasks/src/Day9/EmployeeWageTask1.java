package Day9;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageTask1 {
	public static void computeEmployeeWage(
            String companyName,
            int empRatePerHour,
            int numOfWorkingDays,
            int maxHoursPerMonth) {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        int empHours = 0;
        int totalWage = 0;

        Random random = new Random();

        // Calculate employee wage till max days or max hours reached
        while (totalEmpHours < maxHoursPerMonth &&
               totalWorkingDays < numOfWorkingDays) {

            totalWorkingDays++;

            // 0 = Absent, 1 = Part Time, 2 = Full Time
            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case 1:
                    empHours = 4;
                    break;
                case 2:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;
        }

        totalWage = totalEmpHours * empRatePerHour;

        // Display result
        System.out.println("Company Name       : " + companyName);
        System.out.println("Total Working Days : " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHours);
        System.out.println("Employee Wage      : ₹" + totalWage);
        System.out.println("-------------------------------------");
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the details of company");
		System.out.println("Companyname");
		String companyName=sc.next();
		System.out.println("Wages per Hour");
		int wageperHour=sc.nextInt();
		System.out.println("No of working days");
		int noOfWorkingDays=sc.nextInt();
		System.out.println("Workhours per month");
		int workHoursperMonth=sc.nextInt();

		computeEmployeeWage(companyName,wageperHour,noOfWorkingDays,workHoursperMonth);
	}

}

