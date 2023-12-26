package ProcessingADeal;

import java.util.Scanner;

public class EffectiveRate {
	// life time merchant service 
	//	payments hoop

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		// TOTAL Fees / total volume * 100
		System.out.println("EFFECTIVE RATE \n");
		System.out.println("Fees a month : \n");
		
		Scanner scanner = new Scanner(System.in);
		double monthlyFees = scanner.nextDouble();
		
		System.out.println("Enter volume : \n");
		double totalVolume = scanner.nextDouble();
		
	double effectiveRate = (monthlyFees / totalVolume)*100;
	
	System.out.println("Effective rate = "+ effectiveRate);
	


	}

}
