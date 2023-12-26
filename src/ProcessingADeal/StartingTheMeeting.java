package ProcessingADeal;

import java.util.Scanner;

public class StartingTheMeeting {

	public static void main(String[] args) {
		System.out.println("i must ask did we call you or did you contact us ? ");
		System.out.println("A whole sale conversation is given to buisness owners once a year");
		System.out.println("its actually pretty simple , when a company like yours wants to aceept \n credit card or debit card transactions \n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calculate Your effecritve rate \n");
		System.out.println("What are the total fees charged in the stament: ?  \n");
		double totalFeesCharged = scanner.nextDouble();
		//System.out.println(totalFeesCharged);
	
		System.out.println("What are the total amount of voume ? : ");
		double totalAmountOfVolume = scanner.nextDouble(); 
		//System.out.println(totalAmountOfVolume);
	
		double effectiveRate = (totalFeesCharged/totalAmountOfVolume)*100;
		System.out.println("Effective rate is :  " );
		System.out.printf(" %.2f", effectiveRate);
		
		
		System.out.println("\nAt this stage, you’ve already determined the fees that you’re paying card issuers. \n \t ");
		System.out.println("\nEffective rate is how much of your card procerssing fees are going to the card issuers \n (visa,MasterCard, Discover and how much you are paying to process");
	
		System.out.println("Determine the interchange cost \n");
		System.out.println("Interchange cost are fees charged by card issuers . ");
		System.out.println("Interchange cost can be found in the interchange section : ");
		
		//3 buisness  
	// buisness 1 : 
		// maid company 
		// online 
			//60,000 volume 
			
	//buisness 2 : 
		// online 
		// 191.429.87
		//	99650.77
		// consolting busness 
			//26,871.00
		// $865.00
		// 602.73 charges fee
	// buisness 3: 
		// online
		
		
		
		
		/// 
		
		//chargebacks - 1 
		// no fraud / databreach 
		
		// 
		System.out.println("Processors Fee's Calculator \n");
		System.out.println("Enter toal InterChange Charges : \n");
		double interChangeCharges = scanner.nextDouble();
		
		//System.out.println(interchangeFees );
		System.out.println("Total amount of Fees that are going to your processor:.\t");
		
		
		double processorsFee = totalFeesCharged - interChangeCharges;
		System.out.println("$"+processorsFee);
		
		System.out.println("or in other words the total mark up");
		
		
	}

}
