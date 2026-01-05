package Day11_12;

import java.time.LocalDateTime;

public class CompanyShares {
	private String stockSymbol;
	private int noOfShares;
	private LocalDateTime transactionDate;
	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
		this.transactionDate = LocalDateTime.now();
	}
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	public CompanyShares(String stockSymbol, int noOfShares) {
		super();
		this.stockSymbol = stockSymbol;
		this.noOfShares = noOfShares;
		this.transactionDate = LocalDateTime.now();
	}
	
	
	

}
