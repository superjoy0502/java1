class Accounting{
	public static double valueOFSupply;
	public static double vatRate;
	public static double expenseRate;
	
	public static void print() {
		System.out.println("Value of supply: " + valueOFSupply);
		System.out.println("VAT: " + getVAT());
		System.out.println("Total: " + getTotal());
		System.out.println("Expense: " + getExpense());
		System.out.println("Income: " + getIncome());
		System.out.println("Dividend 1: " + getDividend1());
		System.out.println("Dividend 2: " + getDividend2());
		System.out.println("Dividend 3: " + getDividend3());
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}

	public static double getDividend2() {
		return getIncome() * 0.3;
	}

	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return valueOFSupply - getExpense();
	}

	public static double getExpense() {
		return valueOFSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOFSupply + getVAT();
	}

	public static double getVAT() {
		return valueOFSupply * vatRate;
	}
}


public class AccountingMethodApp {


	public static void main(String[] args) {
		Accounting.valueOFSupply = Double.parseDouble(args[0]);
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;

		Accounting.print();

	}



}
