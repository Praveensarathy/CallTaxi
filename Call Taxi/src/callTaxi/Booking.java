package callTaxi;

import java.util.*;

public class Booking {
	int id =1;
	int bookingId;
	char pickUp;
	char drop;
	int pickUpTime;
	
	Scanner sc = new Scanner(System.in);
	public Booking() {
		System.out.println("Call Taxi Booking:");
		System.out.print("Customer Id: "+ id);
		bookingId = id++;
		System.out.println();
		System.out.print("pickUp point :");
		pickUp = sc.next().charAt(0);

		System.out.print("drop point :");
		drop = sc.next().charAt(0);

		System.out.print("pickUp Time :");
		pickUpTime = sc.nextInt();
		
		
		
	}
	public boolean isAvail(List<Taxi> taxi) {
		for(Taxi t : taxi) {
			if(pickUpTime > 6) {
				
				
				
				
			if(t.curPoint == this.pickUp  && t.curTime < this.pickUpTime) {
				int dif = Math.abs(drop - this.pickUp);
				int km = 15*dif;
				t.earning = 100 + ((km-5)*10);
				
				t.curPoint = this.drop;
				t.curTime = this.pickUpTime + dif;
				System.out.println(t);
				return true;
				}
			}	
		}
		return false;
		
		
	}
	
	public static void print(List<Taxi> taxi) {
		for(Taxi t : taxi) {
			System.out.println("TaxiId" + t.TaxiId + "Total Earnings-" + t.earning );
			System.out.println("TaxiId\t BookingId\t CustomerId\t From\t To\t PickUpTime\t DropTime\t Amount");
			
			
		}
		
	}
	
	
}
