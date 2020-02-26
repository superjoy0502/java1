
public class AccountingIFApp {

	public static void main(String[] args) {

		double valueOFSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOFSupply * vatRate;
		double total = vat;
		double expenseRate = 0.3;
		double expense = valueOFSupply * expenseRate;
		double income = valueOFSupply - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if (income > 10000) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}

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
