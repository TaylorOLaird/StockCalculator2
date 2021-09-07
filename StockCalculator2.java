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
		if (args.length < 3) System.out.println("proper syntax: java StockCalculator <savings> <divRate> <addedSavings>");
		else printInvestment(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
		return;
	}
}
