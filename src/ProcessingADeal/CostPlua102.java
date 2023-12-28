package ProcessingADeal;

import java.math.BigDecimal;
import java.util.Scanner;

public class CostPlua102 {

	public static void main(String[] args) {
// cost is the interchange the banks are the once that get there rates  . This is my PLUS . 
		// the best part of whole sale $50 on 10,000 dollars and .10 per transaction (flat) 
		// interchange is interchange we can not lower that
		
		
		
		
		
		
		
		
		// my company is going to make $50(bases points  on $10,000)
		
		// 		// fun facts 
		// 3 years ago usa made it legal to implement cash discount to store before it was just gas stations 
		
		
		/// step1 : solution: //if we cant intergrate we can always change to a qd4 
			
		// where they are now 
		// effectve rate = fees / volume ;(anything over 2 we can lower (blended rate)) we can low to 1.9 
	
		// 20 on 10,000 is what we make . 1.65 + 1.4 = 1.9
		
		
		// blended rate / volume = new monthly amount 
		System.out.println("Enter BSP for account : ");
	double BSP;													// bses points .50 is 5     .20 is 2
		Scanner BSPScanner = new Scanner(System.in); 			
	double inputBSP = BSPScanner.nextDouble();
	//	System.out.println(inputBSP * 100 + " = Total of bases points implemented \n");   //   output = 50.0 = Total of bases points implemented 

	int BSPInDollars = (int) Math.round(inputBSP * 100);
		//System.out.println(BSPInDollars + " = Total of bases points implemented in dollars \n");		//output:50 = Total of bases points implemented in dollars 
	double Commision = inputBSP + .10;
		
	
		
		// interchange has to be passed down to you . 
		System.out.println("Intechange cost Debit is : .05 + 0.21 ¢ \n" );
		System.out.println("Plus : \t \t \t  "+ BSPInDollars + "( BSP)" +"+ .10 ¢");
		System.out.println("\t \t");
		System.out.println("\t \t");
	double debitInterchange = .05 + 0.21;
		System.out.println("Based on yout Bases points : \t");
		System.out.println(" Debit Interchange =  " + debitInterchange);

	
	
		
	double debitCostPlus = debitInterchange + Commision;
		System.out.println(" Debit cost : \t " + String.format("%.2f",Commision));
		System.out.println("Debit transaction new pricing =  " + debitCostPlus+ " per $100");
		System.out.println("\t \t");
		System.out.println("RATES AS HIGH AS $" + BSPInDollars + " is how much my company will make every $10,000 \n"); // based on 2 percent 
	double creditInterchange = 1.65 + 0.10;
	double creditChargeForMerchant = creditInterchange + Commision;
		System.out.println("Intechange cost Debit is : 1.65 + 0.10 ¢ \n" );
		System.out.println("Plus : \t \t \t  "+ BSPInDollars + "( BSP)" +"+ .10 ¢");
		System.out.println("\n \n");
		System.out.println("Credit price processor new price : " +  creditChargeForMerchant+ " per $100");

	// transactions	
		System.out.println("\n This is the PLUS part \n ");
		
		
		
		
		
		
		
		
		
		
		System.out.println("Enter volume : \t");
	double volume;
		Scanner volumeScanner = new Scanner(System.in);
	double inputVolume = volumeScanner.nextDouble();
	  
	
	
	System.out.println("Enter total transactions \n");
	double transactions;
		Scanner transactionsScanner = new Scanner(System.in);
	double inputTransactions = transactionsScanner.nextDouble();
	System.out.println("\n \n");
	
	
	
	
	
	
	
	
	
	
	
	    //System.out.println(inputVolume + " = your volume \n");
		// volume * .5 "%" = percent plus
	System.out.println("EPS charge to you : \n");
	double MyChargeOnMerchant = ((inputBSP * 100) * inputVolume) / inputVolume; // 50.0 bases points
	double MyChargeOnDimeTransactions = .10 * inputTransactions;   // should be 30
	System.out.println("$ " + MyChargeOnDimeTransactions + " -.10 per transaction" ); // 30
		
		
		
	double CominationOfDimePlusBSP = Double.sum(MyChargeOnMerchant, MyChargeOnDimeTransactions);
	
	

	
	

	BigDecimal myNumber = new BigDecimal(inputBSP);
	myNumber = myNumber.movePointLeft(2);
//	System.out.println(myNumber); // output : 0.005

	System.out.printf("$ %.2f - (ressisual) bases points %n", myNumber.multiply(BigDecimal.valueOf(inputVolume)));

//	System.out.printf("$ %.2f  -(ressisual)bases points %n", (myNumber * inputVolume);


		//System.out.println("$" + (  MyChargeOnDimeTransactions) / inputTransactions + " .10¢ per transactions \n  ");  // 10.0
		
		
		
		
		
		double batchFee = 0.25*22;  // every day we batch its a .25 cent fee
		double MerchantFee = 19.95;
		double terminal = 40.00;
		System.out.printf("$ %.2f BatchFee \n", batchFee);
		System.out.printf("$ %.2f Merchant Fee \n", MerchantFee);
		System.out.printf("$ %.2f Terminal \n", terminal);
		
		System.out.println("Total income to EPS  = ");
	//System.out.println("Debit charge for this merchant : "+  MyChargeOnMerchant + " " + MyChargeOnDime"); // Debit charge for this merchant : 1050.0

	
// ALWAYS FILL OUT
	// my company is now saving you __________ is my company is charging you ____ , if my company is not worth _____ then there is nothing that I can do .    
	
	System.out.println("\n \n");
	System.out.println("My company makes $"+ BSPInDollars+" every $10,000 "+ " and $10 every 100 transactions .\n" );
	
	
	}

}
