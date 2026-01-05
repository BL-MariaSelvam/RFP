package Day11_12;

public class StockAccountMain {

	public static void main(String[] args) {
		
		StockAccount stockAccount=new StockAccount("C:/Users/sathi/OneDrive/Desktop/selva/bridgelabz/sample.txt");
		stockAccount.printReport();
		
		stockAccount.buy(2, "TCS");
		
		stockAccount.printReport();
		stockAccount.sell(3, "TCS");
		stockAccount.printReport();
		stockAccount.save("C:/Users/sathi/OneDrive/Desktop/selva/bridgelabz/sample1.txt");
		stockAccount.printReport();
	}

}
