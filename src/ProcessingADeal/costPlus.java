package ProcessingADeal;

import java.util.Scanner;

public class costPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input volume 
			Scanner scanner = new Scanner(System.in);
		System.out.print("Enter volume : \t");
		double volume = scanner.nextDouble();
		
		//transactions 
		
		Scanner transactionsScanner = new Scanner(System.in);
		System.out.print("Enter total number of transcations in total of the month  : \t");
		double transactions = scanner.nextDouble();
		// credit card  procesing 
		
		
		
		
		//amex = 1.89 x (input) 
		
		
		Scanner AMEXscanner = new Scanner(System.in);
		System.out.print("Enter AMEX total amont for the month  : \t");
		double amexTotal = scanner.nextDouble();
		// this is the total transactions in the month for AMEX  
		
		
		
		//amex transcations total x .10
		double FinalDealAmex = amexTotal * 0.0189;
		System.out.println("NEW PRICING ");
		System.out.println("Enchanced priced for amex : " + String.format("%.2f", FinalDealAmex));		
	/////////////////////////////////////////////////	
		//amex toal of what we charge 
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter volume : \t");
//		double volume = scanner.nextDouble();
//		
		System.out.println("Enter AMEX total amount of transactions : \n");
		Scanner AMEXTransactionsscanner = new Scanner(System.in);
		int amexTransactionsTotal = scanner.nextInt();
		
		double FinalAMEXTransactioTotal = amexTransactionsTotal * .10;
		System.out.println("Enchanced transaction priced for amex : " + String.format("%.2f", FinalAMEXTransactioTotal));		
	////////////////////////////////////////////////	
		System.out.println("Enter Credit card(visa, master, discoveer) total amount of transactions : \n");
		Scanner creditCardVisa = new Scanner(System.in);
		double CreditCardVisa = scanner.nextDouble();
		
		double FinalCreditCardVisa = CreditCardVisa * 1.65 / 100;
		System.out.println("Enchanced transaction priced for VISA CREDIT CARDS : " + String.format("%.2f", FinalCreditCardVisa));		
/////////////////////////////////////////////////
		
		System.out.println("Enter DEBIT CARD transactions $$ for month : \n");
		Scanner DebitCard = new Scanner(System.in);
		double debitCard = scanner.nextDouble();
		
		double FinalDebitcardCharge = debitCard * 0.05 / 100;
		System.out.println("Enchanced transaction priced for VISA CREDIT CARDS : " + String.format("%.2f", FinalDebitcardCharge));		
///////////////////
		System.out.println("Enter total debit transactions : \n");
		Scanner DebitTransactions = new Scanner(System.in);
		int debitTransactions = scanner.nextInt();
		
		double FinalDebitTransactions = debitTransactions * 0.21;
		
		System.out.println("Enhanced payments processing for debit cards transactions = " + String.format("%.2f", FinalDebitTransactions));	
////////////////////
		/// variables 
		double onFile = 19.95;
		double batch = .25 * 28;
		double ourPlus = .15 * volume  / 100;
		//System.out.println("our plus" +String.format("%.2f", ourPlus));
	
		double ourPlusTransaction = .05 * transactions ;
		//System.out.println("Our plus " +String.format("%.2f", ourPlusTransaction));
	double total = FinalDealAmex + FinalAMEXTransactioTotal + FinalCreditCardVisa + FinalDebitcardCharge +  FinalDebitTransactions + onFile + batch + ourPlus + ourPlusTransaction; 
	System.out.println("Merchants new toal bill for this month is : \n" + String.format("%.2f",total));
	}

}
