package Day11_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockAccount {
	
	private List<CompanyShares> sharesList=new ArrayList<>();

	public StockAccount(String fileName) {
		try {
			Scanner sc=new Scanner(new File(fileName));
			
			while(sc.hasNext()) {
				String symbol=sc.next();
				int shares=sc.nextInt();
				sharesList.add(new CompanyShares(symbol,shares));
			}
			System.out.println("Shares added");
			sc.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error reading stock file");
		}
	}
	public double valueOf() {
		double total=0,eachSharePrice=10;
		for(CompanyShares shares:sharesList) {
			total+=(shares.getNoOfShares()*eachSharePrice);
		}
		return total;
	}

	
	public void buy(int amount,String symbol) {
		int temp=amount;
		for(CompanyShares cs:sharesList) {
			if(cs.getStockSymbol().equals(symbol)) {
				amount+=cs.getNoOfShares();
				cs.setNoOfShares(amount);
				  System.out.println("Bought " + temp + " shares of " + symbol);
	                return;
			}
			sharesList.add(new CompanyShares(symbol, amount));
			System.out.println("Shares added"+symbol);
		}
	}
	
	 // Sell shares
    public void sell(int amount, String symbol) {
        for (CompanyShares cs : sharesList) {
            if (cs.getStockSymbol().equals(symbol)) {

                if (cs.getNoOfShares() < amount) {
                    System.out.println("Insufficient shares to sell.");
                    return;
                }

                cs.setNoOfShares(cs.getNoOfShares() - amount);;
                System.out.println("Sold " + amount + " shares of " + symbol);
                return;
            }
        }
        System.out.println("Stock not found.");
    }
 // Save account to file
    public void save(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);

            for (CompanyShares cs : sharesList) {
                writer.write(
                        cs.getStockSymbol() + " " +
                        cs.getNoOfShares() + " " +
                        cs.getTransactionDate() + "\n"
                );
            }
            writer.close();
            System.out.println("Account saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
    
    // Print detailed report
    public void printReport() {
        System.out.println("\n----- STOCK ACCOUNT REPORT -----");

        for (CompanyShares cs : sharesList) {
            System.out.println(
                    "Stock Symbol: " + cs.getStockSymbol() +
                    " | Shares: " + cs.getNoOfShares() +
                    " | Last Transaction: " + cs.getTransactionDate()
            );
        }

        System.out.println("--------------------------------");
        System.out.println("Total Account Value: " + valueOf());
    }
}
