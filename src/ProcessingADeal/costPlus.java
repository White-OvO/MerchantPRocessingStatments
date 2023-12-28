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

		
		
		Scanner AMEXscanner = new Scanner(System.in);
		System.out.print("Enter AMEX total amont for the month  : \t");
		double amexTotal = scanner.nextDouble();
		// this is the total transactions in the month for AMEX  
		
		
		
		//amex transcations total x .10
		double FinalDealAmex = amexTotal * 0.0165;    // 20 OR 2 BASES 2.0 BASES POINTS
		System.out.println("NEW PRICING ");
		System.out.println("Enchanced priced for American Express including total amount of transactions a month : " + String.format("%.2f", FinalDealAmex));	
		System.out.println("Meaning : INTERCHANGE : 1.89%  \t");
		System.out.println("Dues and assesments : .14%\t");
		System.out.println("Commissions : .20% + (the banks .20 or 20 bsp for the bank . t"); // 20 $ out of every 10,000
		System.out.println("Total = 2.0 total of 2 bases points or 2% or 2.0 \t");
		System.out.println("Meaning every transation of $100 would be $2.05 \t income: =  $97.57");
		System.out.println("\t ");
		System.out.println(FinalDealAmex + " is the final Amex cost w the total amount of transactions * 2 percent \t");
		
		/////////////////////////////////////////////////	
		//amex toal of what we charge 
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter volume : \t");
//		double volume = scanner.nextDouble();
//		
		System.out.println("Enter AMEX total amount of transactions : \n");
		Scanner AMEXTransactionsscanner = new Scanner(System.in);
		int amexTransactionsTotal = scanner.nextInt();
		
		double FinalAMEXTransactioTotal = amexTransactionsTotal * .0189;
		System.out.println("Enchanced transaction priced for amex : " + String.format("%.2f", FinalAMEXTransactioTotal));	
		
		
		
		
		
		
		
		
	////////////////////////////////////////////////	 VISA , MASTER , DISCOVERY
		System.out.println("Enter Credit card(visa, master, discoveer) total $$$$$$$ of transactions : \n");
		Scanner creditCardVisa = new Scanner(System.in);
		double CreditCardVisa = scanner.nextDouble();
		
		
		
		
		
		double FinalCreditCardVisa = CreditCardVisa * 1.65 / 100;      //INTERCHANGE FOR VISA
		System.out.println("Enchanced transaction priced for VISA CREDIT CARDS : " + String.format("%.2f", FinalCreditCardVisa));	
		System.out.println("NEW PRICING ");
		System.out.println("Enchanced priced for VISA including total amount of transactions a month : " + String.format("%.2f", FinalDealAmex));	
		System.out.println("Meaning : INTERCHANGE : 1.65%  \t");
		System.out.println("Dues and assesments : .14%\t");
		System.out.println("Commissions : .20% + (the banks .20 or 20 bsp for the bank . t"); // 20 $ out of every 10,000
		System.out.println("Total = 2.05 total of 2 bases points or 2% or 2.0 \t");
		System.out.println("Meaning every transation of $100 would be $2.05 \t income: =  $97.95");
		
		System.out.println("NEW PRICING ");
		System.out.println("Enchanced priced for Master Card including total amount of transactions a month : " + String.format("%.2f", FinalDealAmex));	
		System.out.println("Meaning : INTERCHANGE : 1.65%  \t");
		System.out.println("Dues and assesments : .14%\t");
		System.out.println("Commissions : .20% + (the banks .20 or 20 bsp for the bank . t"); // 20 $ out of every 10,000
		System.out.println("Total = 2.05 total of 2 bases points or 2% or 2.0 \t");
		System.out.println("Meaning every transation of $100 would be $2.05 \t income: =  $97.95");
		
		System.out.println("NEW PRICING ");
		System.out.println("Enchanced priced for Discovery including total amount of transactions a month : " + String.format("%.2f", FinalDealAmex));	
		System.out.println("Meaning : INTERCHANGE : 1.65%  \t");
		System.out.println("Dues and assesments : .14%\t");
		System.out.println("Commissions : .20% + (the banks .20 or 20 bsp for the bank . t"); // 20 $ out of every 10,000
		System.out.println("Total = 2.05 total of 2 bases points or 2% or 2.0 \t");
		System.out.println("Meaning every transation of $100 would be $2.05 \t income: =  $97.95");
		
/////////////////////////////////////////////////
		
		System.out.println("Enter DEBIT CARD transactions $$ for month : \n");
		Scanner DebitCard = new Scanner(System.in);
		double debitCard = scanner.nextDouble();
		
		double FinalDebitcardCharge = debitCard * 0.05 / 100;
		System.out.println("Enchanced transaction priced for Debit CARDS : " + String.format("%.2f", FinalDebitcardCharge));		
///////////////////
		System.out.println("Enter total debit transactions : \n");
		Scanner DebitTransactions = new Scanner(System.in);
		int debitTransactions = scanner.nextInt();
		
		double FinalDebitTransactions = debitTransactions * 0.21;
		
		System.out.println("Enhanced payments processing for debit cards transactions = " + String.format("%.2f", FinalDebitTransactions));	
		
		
		
		System.out.println("NEW PRICING ");
		//System.out.println("Enchanced priced for Debit including total amount of transactions a month : " + String.format("%.2f", FinalDealAmex));	
		System.out.println("Meaning : INTERCHANGE : .05% + .10cents \t");
		System.out.println("Dues and assesments : .14%\t");
		System.out.println("Commissions bank : .20% \t");
		System.out.println("Total = 0.59 total of 2 bases points or 2% or 2.0 \t");
		System.out.println("Meaning every transation of $100 would be $99.00 \t income: =  $99.41");
////////////////////
		/// variables 
		double terminal = 19.95;
		double batch = .25 * 28;
		double ourPlus = .20 * volume  / 100;
		//System.out.println("our plus" +String.format("%.2f", ourPlus));
	
		double ourPlusTransaction = .05 * transactions ;
		//System.out.println("Our plus " +String.format("%.2f", ourPlusTransaction));
	double total = FinalDealAmex + FinalAMEXTransactioTotal + FinalCreditCardVisa + FinalDebitcardCharge +  FinalDebitTransactions + terminal + batch + ourPlus + ourPlusTransaction; 
	System.out.println("Merchants new toal bill for this month is : \n" + String.format("%.2f",total));
	}

}
