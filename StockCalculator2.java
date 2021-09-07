import java.io.*;
import java.lang.*;
import java.util.*;

import java.text.*;

class Stock {
	private String name;
	private String ticker;
	private float divYield;
	private int divFreqPerYear;
	private Boolean compounding;

	private float amountOwned;
	private float quantityOwned;

	public Stock (){
		this.name = "default_Stock_name";
		this.ticker = "default_Stock_ticker";
		this.divYield = 0.0;
		this.divFreqPerYear = 0;
		this.compounding = false;
		this.amountOwned = 0.0;
		this.quantityOwned = 0.0;
	}

	public String toString() {
		return this.name + " (" + this.ticker + "): \n\tAmount Owned: " + this.amountOwned +
				"\n\tQuantity Owned: " + this.quantityOwned + "\n\tDividend Yield: " + this.divYield +
				"\n\tDividend Frequency per Year: " + this.divFreqPerYear +
				"\n\tCompounding: " + this.compounding;
	}

	public setName void(String name) {
		this.name = name;
		return;
	}

	public setTicker void(String ticker) {
		this.ticker = ticker;
		return;
	}

	public setDivYield void(float divYield) {
		if (divYield <= 0)
			System.out.println("invalid divYield, must be a positive float value");
		else
			this.ticker = ticker;
		return;
	}

	public setDivFreqPerYear void(int divFreqPerYear) {
		if (divFreqPerYear < 0)
			System.out.println("invalid divFreqPerYear, must be a non-negative int value");
		else
			this.divFreqPerYear = divFreqPerYear;
		return;
	}

	public setCompounding void(Boolean compounding) {
		this.compounding = compounding;
		return;
	}

	public setAmountOwned void(float amountOwned) {
		if (amountOwned < 0)
			System.out.println("invalid amountOwned, must be a non-negative float value");
		else
			this.amountOwned = amountOwned;
		return;
	}

	public setQuantityOwned void(float quantityOwned) {
		if (quantityOwned < 0)
			System.out.println("invalid quantityOwned, must be a non-negative float value");
		else
			this.quantityOwned = quantityOwned;
		return;
	}

	public String getName() {
		return this.name;
	}

	public String getTicker() {
		return this.ticker;
	}

	public float getDivYield() {
		return this.divYield;
	}

	public int getDivFreqPerYear() {
		return this.divFreqPerYear;
	}

	public Boolean getCompounding() {
		return this.compounding;
	}

	public float getAmountOwned() {
		return this.amountOwned;
	}

	public float getQuantityOwned() {
		return this.quantityOwned;
	}
}

class SortByName implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		return a.name.compareTo(b.name);
	}
}

class SortByTicker implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		return a.ticker.compareTo(b.ticker);
	}
}

class SortByDividendYield implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		return a.divYield - b.divYield;
	}
}

class SortByDividendFrequency implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		return a.divFreqPerYear - b.divFreqPerYear;
	}
}

class SortByCompounding implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		int boolA = a.divFreqPerYear ? 1 : 0;
        int boolB = b.divFreqPerYear ? 1 : 0;

        return boolB - boolA;
	}
}

class SortByAmountOwned implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		return a.amountOwned - b.amountOwned;
	}
}

class SortByQuantityOwned implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		return a.quantityOwned - b.quantityOwned;
	}
}

class StockPortfolio {
	ArrayList<Stock> portfolio;
	public StockPortfolio (){
		this.portfolio = new ArrayList<Stock>();
	}

	public String toString() {
		return 
	}
}

public class StockCalculator2 {
	// public static void printInvestment(float savings, float divRate, float addedSavings) {
	// 	int totalTime = 50, printInterval = 1;
	// 	for (int years = 0; years <= totalTime; years ++) {
	// 		if (years % printInterval == 0) {
	// 			System.out.println("\n======================================================================================\n");
	// 			DecimalFormat formatter = new DecimalFormat("#,###.00");
	// 			String amount = (years < 10) ? ("0" + String.valueOf(years)) : String.valueOf(years);
	// 			System.out.print(" after " + amount + " year(s) your savings are: $" + formatter.format(savings));
	// 			System.out.println(", you'd make: $" + formatter.format((savings + savings * (divRate / 100)) - savings) + " a year.");
	// 		}
	// 		savings += addedSavings;
	// 		savings += (savings * (divRate / 100));
	// 	}
	// 	System.out.println("\n======================================================================================\n");
	// }
	public static void main(String[] args) {
		// if (args.length < 3) System.out.println("proper syntax: java StockCalculator <savings> <divRate> <addedSavings>");
		// else printInvestment(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
		// return;


	}
}
