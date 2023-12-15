package ProcessingADeal;

import java.util.Scanner;

public class PaperWork {

	public static void main(String[] args) {
	System.out.println("AVERAGE TICKET SIZE");
	System.out.println("\n")
	;
	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter volue : \n");
		double volume = scanner.nextDouble();
		System.out.println("enter total number of transcations : ");
		double totalNumberOfTransactions = scanner.nextDouble();
		double averageTicket = volume/totalNumberOfTransactions;
		System.out.printf("Average Ticket size is :  %.2f", averageTicket);

		
	}

}
