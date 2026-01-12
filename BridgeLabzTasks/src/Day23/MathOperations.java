package Day23;

@FunctionalInterface
interface Operations{
	int calculate(int a,int b);
	
	static void printresult(int a,int b,String operation,Operations obj) {
		System.out.println("Result of "+operation+" is "+obj.calculate(a,b));
	}
}

public class MathOperations {
	public static void main(String[] args) {
		Operations add=(a,b)->a+b;
		Operations sub=(a,b)->a-b;
		Operations mul=(a,b)->a*b;
		Operations div=(a,b)->{
		if(b==0) {
			return 0;
		}
		else {
			return a/b;
		}
			
		};
		System.out.println(add.calculate(5, 8));
		System.out.println(sub.calculate(45, 3));
		System.out.println(mul.calculate(3, 5));
		try {
		System.out.println(div.calculate(45, 6));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Operations.printresult(5, 6, "Addition", add);
		Operations.printresult(15, 6, "Subtraction", sub);
		Operations.printresult(5, 6, "Multiplication", mul);
		Operations.printresult(54, 6, "Division", div);
	}

}
