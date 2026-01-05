package Day10;

public class EmployeeWageTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubEmpWageInterface empWages=new EmpWageBuilderTask4(5);
		
		EmpWageInterface empWages=new EmpWageBuilderTask5();
		empWages.addCompanywages("TCS", 20, 8,4,100,20);
		empWages.addCompanywages("Wipro", 30, 8,4,100,25);
		empWages.addCompanywages("Infosys",40, 8,4,100,22);
		
		empWages.computeWage();

	}

}
