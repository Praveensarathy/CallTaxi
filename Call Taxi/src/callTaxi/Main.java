package callTaxi;

import java.util.*;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.printf(" Call Taxi Booking%n");

		Taxi taxi = new Taxi();
		List<Taxi> NumberOfTaxies=  taxi.createTaxi(5);
		
		Booking book = new Booking();
		
		while(true) {
			System.out.printf("%n---------------------%n");
			System.out.printf("%10s","[1]-> To New Booking\n");
			System.out.printf("%10s","[2]-> To Print Taxi status\n");
			System.out.printf("%10s","[3]-> To Exit");
			System.out.printf("%n---------------------%n");
			System.out.print("Enter your Choice:");
			int choice = sc.nextInt();
			if(choice == 1) {
				book.cusDetails(taxi,book);
			}
			if(choice ==2) {
				taxi.TaxiStatus(book.bookings);
			}
			if(choice == 3) {
				System.out.println("Thank you ");
				break;
			}
			
		}
		
	}
}