
public class AccountingArrayLoopApp {

	public static void main(String[] args) {

		double valueOFSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOFSupply * vatRate;
		double total = vat;
		double expenseRate = 0.3;
		double expense = valueOFSupply * expenseRate;
		double income = valueOFSupply - expense;
		
		double rate1 = 0.5;
		
		double[] dividendrates = new double[3];
		dividendrates[0] = 0.5;
		dividendrates[1] = 0.3;
		dividendrates[2] = 0.2;
		
		double dividend1 = income * dividendrates[0];
		double dividend2 = income * dividendrates[1];
		double dividend3 = income * dividendrates[2];

		System.out.println("Value of supply: " + valueOFSupply);
		System.out.println("VAT: " + total);
		System.out.println("Total: " + (10000 + total));
		System.out.println("Expense: " + expense);
		System.out.println("Income: " + income);
		System.out.println("Dividend 1: " + dividend1);
		System.out.println("Dividend 2: " + dividend2);
		System.out.println("Dividend 3: " + dividend3);

	}

}
