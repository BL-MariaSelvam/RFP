package Day11_12;

public class Stock {
	private String shareName;
	private int noOfShares;
	private int sharePrice;
	private int totalStockprice;
	private int eachStockPrice;
	
	public int getTotalStockprice() {
		return totalStockprice;
	}
	public void setTotalStockprice(int totalStockprice) {
		this.totalStockprice = totalStockprice;
	}
	public int getEachStockPrice() {
		return eachStockPrice;
	}
	public void setEachStockPrice(int eachStockPrice) {
		this.eachStockPrice = eachStockPrice;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public Stock(String shareName, int noOfShares, int sharePrice) {
		super();
		this.shareName = shareName;
		this.noOfShares = noOfShares;
		this.sharePrice = sharePrice;
	}
	
	

}
