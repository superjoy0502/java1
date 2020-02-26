
public class AccountingArrayApp {

	public static void main(String[] args) {

		double valueOFSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOFSupply * vatRate;
		double total = vat;
		double expenseRate = 0.3;
		double expense = valueOFSupply * expenseRate;
		double income = valueOFSupply - expense;

		System.out.println("Value of supply: " + valueOFSupply);
		System.out.println("VAT: " + total);
		System.out.println("Total: " + (10000 + total));
		System.out.println("Expense: " + expense);
		System.out.println("Income: " + income);

		double[] dividendrates = new double[3];
		dividendrates[0] = 0.5;
		dividendrates[1] = 0.3;
		dividendrates[2] = 0.2;

		int i = 0;
		while (i < dividendrates.length) {
			System.out.println("Dividend 1: " + (income * dividendrates[i]));
			i++;
		}
	}

}
