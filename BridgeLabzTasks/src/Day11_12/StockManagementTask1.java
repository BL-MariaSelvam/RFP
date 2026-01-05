package Day11_12;

public class StockManagementTask1 {

	public static void main(String[] args) {
		StockInterface stock=new StockInterfaceImpl();
		
		stock.addStocks("Stock A",100,200);
		stock.addStocks("Stock B",100,200);
		stock.addStocks("Stock B",100,200);
		
		System.out.println("Total StockPrice is "+stock.computestockPrice());
		

	}

}
