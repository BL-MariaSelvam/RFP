package Day11_12;

import java.util.ArrayList;
import java.util.List;

public class StockInterfaceImpl implements StockInterface{
	
	private List<Stock> stocks=new ArrayList<>();
	private List<Stock> eachStockPrice=new ArrayList<>();
	

	@Override
	public void addStocks(String stockName, int noOfShares, int sharePrice) {
	Stock stock=new Stock(stockName,noOfShares,sharePrice);
		stocks.add(stock);
		System.out.println("Stocks added successfully");
		
	}

	@Override
	public int computestockPrice() {
		int totalStockPrice=0;
		System.out.printf("%-15s%-15s%-15s%-15s%n","Sharename","No.of shares","SharePrice","TotalSharePrice");
		for(Stock stock:stocks) {
			
			int eachPrice=stock.getNoOfShares()*stock.getSharePrice();
			stock.setEachStockPrice(eachPrice);
			System.out.printf("%-15s%-15s%-15s%-15s%n",stock.getShareName(),stock.getNoOfShares(),stock.getSharePrice(),eachPrice);
			eachStockPrice.add(stock);
			totalStockPrice+=eachPrice;
			
		}
		return totalStockPrice;
		
	}

}
