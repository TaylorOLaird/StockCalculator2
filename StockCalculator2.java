import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.File;

import java.text.*;

class Stock {
	private String name;
	private String ticker;
	private float divYield;
	private int divFreqPerYear;
	private Boolean compounding;

	private float amountOwned;
	private float quantityOwned;

	private float yearlyAvgChange;
	private float value;

	public Stock() {
		this.name = "default_Stock_name";
		this.ticker = "default_Stock_ticker";
		this.divYield = (float)0.0;
		this.divFreqPerYear = 0;
		this.compounding = false;

		this.amountOwned = (float)0.0;
		this.quantityOwned = (float)0.0;

		this.yearlyAvgChange = (float)0.0;
		this.value = (float)0.0;
	}

	public String toString() {
		return this.name + " (" + this.ticker + "): \n\tAmount Owned: " + this.amountOwned +
				"\n\tQuantity Owned: " + this.quantityOwned + "\n\tDividend Yield: " + this.divYield +
				"\n\tDividend Frequency per Year: " + this.divFreqPerYear +
				"\n\tCompounding: " + this.compounding;
	}

	public void setName(String name) {
		this.name = name;
		return;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
		return;
	}

	public void setDivYield(float divYield) {
		if (divYield <= 0)
			System.out.println("invalid divYield, must be a positive float value");
		else
			this.divYield = divYield;
		return;
	}

	public void setDivFreqPerYear(int divFreqPerYear) {
		if (divFreqPerYear < 0)
			System.out.println("invalid divFreqPerYear, must be a non-negative int value");
		else
			this.divFreqPerYear = divFreqPerYear;
		return;
	}

	public void setCompounding(Boolean compounding) {
		this.compounding = compounding;
		return;
	}

	public void setAmountOwned(float amountOwned) {
		if (amountOwned < 0)
			System.out.println("invalid amountOwned, must be a non-negative float value");
		else
			this.amountOwned = amountOwned;
		return;
	}

	public void setQuantityOwned(float quantityOwned) {
		if (quantityOwned < 0)
			System.out.println("invalid quantityOwned, must be a non-negative float value");
		else
			this.quantityOwned = quantityOwned;
		return;
	}

	public void setYearlyAvgChange(float yearlyAvgChange) {
		this.yearlyAvgChange = yearlyAvgChange;
		return;
	}

	public void setValue(float value) {
		if (value <= 0)
			System.out.println("invalid value, must be a positive float value");
		else
			this.value = value;
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

	public float getYearlyAvgChange() {
		return this.yearlyAvgChange;
	}

	public float getValue() {
		return this.value;
	}
}

class SortByName implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		return a.getName().compareTo(b.getName());
	}
}

class SortByTicker implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		return a.getTicker().compareTo(b.getTicker());
	}
}

class SortByDividendYield implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		if (a.getDivYield() - b.getDivYield() > 0)
			return 1;
		else if (a.getDivYield() - b.getDivYield() < 0)
			return -1;
		return 0;
	}
}

class SortByDividendFrequency implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		return a.getDivFreqPerYear() - b.getDivFreqPerYear();
	}
}

class SortByCompounding implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		int boolA = a.getCompounding() ? 1 : 0;
        int boolB = b.getCompounding() ? 1 : 0;

        return boolB - boolA;
	}
}

class SortByAmountOwned implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		if (a.getAmountOwned() - b.getAmountOwned() > 0)
			return 1;
		else if (a.getAmountOwned() - b.getAmountOwned() < 0)
			return -1;
		return 0;
	}
}

class SortByQuantityOwned implements Comparator<Stock> {
	public int compare(Stock a, Stock b) {
		if (a.getQuantityOwned() - b.getQuantityOwned() > 0)
			return 1;
		else if (a.getQuantityOwned() - b.getQuantityOwned() < 0)
			return -1;
		return 0;
	}
}

class StockPortfolio {
	private String name;
	private ArrayList<Stock> portfolio;

	public StockPortfolio (String name){
		this.name = name;
		this.portfolio = new ArrayList<Stock>();
		System.out.println("name: " + this.name);
		StockCalculator2.wait(1000);
	}

	// public String toString() {
	// 	return 
	// }
}

public class StockCalculator2 {
	private final int printWidth = 60;
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

	// private StockPortfolio loadFile(String fileName) {
		
	// }

	//TODO: fix bar printing should prob be a function

	private void printUI(int amountOfBars, String text) {
		for (int i = 0; i < amountOfBars; i++)
			System.out.print("=");

		System.out.println("\n\t" + text);

		for (int i = 0; i < amountOfBars; i++)
			System.out.print("=");

		System.out.println();
	}

	private StockPortfolio createFile() {
		Boolean uiRunning = true;
		int waitTime = 1000;
		String portfolioName = null;

		while (uiRunning) {
			clearScreen();
			System.out.println("===========================================================");
			System.out.println("\tEnter Portfolio name");
			System.out.println("===========================================================");

			Scanner sc = new Scanner(System.in);
			portfolioName = sc.next();
			portfolioName = portfolioName + ".txt";

			File f = new File(portfolioName);

			if (f.exists()) {
				clearScreen();
				System.out.println("===========================================================");
				System.out.println("\tFile already exists");
				System.out.println("\t0: Try new name\n\t1: Return");
				System.out.println("===========================================================");

				int choice = sc.nextInt();

				if (choice == 1)
					return null;
				else if (choice != 1 && choice != 0) {
					System.out.println("do invalid input stuff");
					wait(waitTime);
				}
			} else {
				uiRunning = false;
			}
		}

		System.out.println("do create file stuff in method");
		wait(waitTime);

		return new StockPortfolio(portfolioName);
	}

	private StockPortfolio addStock(StockPortfolio portfolio) {
		if (portfolio == null) {
			System.out.println("technically return since portfolio is null");
			wait(1000);
		}
		Stock tmpStock = new Stock();

		clearScreen();
		printUI(this.printWidth, "Enter Stock name");

		Scanner sc = new Scanner(System.in);
		tmpStock.setName(sc.nextLine());

		printUI(this.printWidth, "Enter " + tmpStock.getName() + "'s current value");
		tmpStock.setValue(sc.nextFloat());
		sc.nextLine();

		printUI(this.printWidth, "Enter " + tmpStock.getName() + "'s ticker");
		tmpStock.setTicker(sc.nextLine());

		printUI(this.printWidth, "Enter " + tmpStock.getName() + "'s divYield");
		tmpStock.setDivYield(sc.nextFloat());

		printUI(this.printWidth, "Enter " + tmpStock.getName() + "'s divFreqPerYear");
		tmpStock.setDivFreqPerYear(sc.nextInt());

		printUI(this.printWidth, "Enter if you are compounding " + tmpStock.getName() + "'s dividends, <true/false>");
		tmpStock.setCompounding(sc.nextBoolean());

		printUI(this.printWidth, "Enter amountOwned of" + tmpStock.getName());
		tmpStock.setAmountOwned(sc.nextFloat());

		printUI(this.printWidth, "Enter quantityOwned of" + tmpStock.getName());
		tmpStock.setQuantityOwned(sc.nextFloat());

		System.out.println(tmpStock);

		return null;
	}

	private void uiLoop() {
		Boolean uiRunning = true;
		Boolean portfolioLoaded = false;

		StockPortfolio portfolio1 = null;

		int waitTime = 1000;

		while (uiRunning) {
			clearScreen();
			System.out.println("===========================================================");
			System.out.println("\t0: Create file\n\t1: Load file\n\t2: Save file\n\t3: Add stock");
			System.out.println("\t4: Print portfolio\n\t5: Run prediction");
			System.out.println("\t6: exit");
			System.out.println("===========================================================");

			Scanner sc = new Scanner(System.in);
			int userInput = sc.nextInt();

			switch(userInput) {
				case 0: 
					// System.out.println("do create file stuff");
					// wait(waitTime);
					portfolio1 = createFile();
					break;
				case 1:
					System.out.println("do load file stuff");
					wait(waitTime);
					break;
				case 2:
					System.out.println("do save file stuff");
					wait(waitTime);
					break;
				case 3:
					System.out.println("do add stock stuff");
					wait(waitTime);
					portfolio1 = addStock(portfolio1);
					break;
				case 4:
					System.out.println("do print portfolio stuff");
					wait(waitTime);
					break;
				case 5:
					System.out.println("do run prediction stuff");
					wait(waitTime);
					break;
				case 6:
					System.out.println("do exit stuff");
					wait(waitTime);
					uiRunning = false;
					break;
				default:
					System.out.println("do invalid input stuff");
					wait(waitTime);
			}

			// while loop
		}
		System.out.println("Good Bye...");
		return;
	}

	// Source: https://stackoverflow.com/a/32295974
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}

	// Source: https://stackoverflow.com/a/57567069
	public static void wait(int ms) {
		try {
			Thread.sleep(ms);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) {
		// if (args.length < 3) System.out.println("proper syntax: java StockCalculator <savings> <divRate> <addedSavings>");
		// else printInvestment(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
		// return;
		StockCalculator2 portfolio1 = new StockCalculator2();
		portfolio1.uiLoop();
		return;
	}
}
