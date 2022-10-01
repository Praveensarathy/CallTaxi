package callTaxi;

import java.util.*;

public class Taxi {
	int id =1;
	int curPoint ='a';
	int earning =0;
	int trip=0;
	int curTime=6;
	int TaxiId = id++;

	public static List<Taxi> createTaxi(int n) {
		int i =0;
		List<Taxi> taxies = new ArrayList<Taxi>();
		for(i=0;i<n;i++) {
			Taxi t = new Taxi();
			taxies.add(t);
		}
		return taxies;
		
	}
	
	public static void main(String[] args) {
		
		
		List<Taxi> taxi = createTaxi(4);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Book Taxi");
			System.out.println("Print Taxi Statement");
			int opt = sc.nextInt();
			switch(opt) {
				case 1:{
					Booking b = new Booking();
					if(b.isAvail(taxi)) {
						System.out.println("Taxi can be Allotted");
					}
				}
				case 2:{
					Booking.print(taxi);
				}
			}
			
		}
		
	}
}
