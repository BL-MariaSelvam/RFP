package Day10;

public class EmployeeWageTask6 {

	public static void main(String[] args) {
		
		EmpWageInterface1 empWagebuilder=new EmpWageBuilderTask6();
		
		empWagebuilder.addCompanies("TCS", 20, 8,4,100,20);
		empWagebuilder.addCompanies("Wipro", 30, 8,4,100,25);
		empWagebuilder.addCompanies("Infosys",40, 8,4,100,22);
		
		empWagebuilder.computewage();
		
		System.out.println("Wages is "+empWagebuilder.getTotalwage("TCS"));
		
		
	}

}
