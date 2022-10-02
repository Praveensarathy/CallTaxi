package callTaxi;

import java.util.*;

public class Booking {
	public static int id =1;
	private int bookingId,CustPickUpTime;
	private char curPickUp,cusDrop;

	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public int getCustPickUpTime() {
		return CustPickUpTime;
	}


	public void setCustPickUpTime(int cuspickUpTime) {
		CustPickUpTime = cuspickUpTime;
	}


	public char getCurPickUp() {
		return curPickUp;
	}


	public void setCurPickUp(char curPickUp) {
		this.curPickUp = curPickUp;
	}


	public char getCusDrop() {
		return cusDrop;
	}


	public void setCusDrop(char cusDrop) {
		this.cusDrop = cusDrop;
	}



	
	
	
	
	
	
	
	
//	public boolean isAvail(List<Taxi> taxi) {
//		for(Taxi t : taxi) {
//			if(pickUpTime > 6) {	
//			if(t.getCurPoint() == this.pickUp  && t.getCurTime() < this.pickUpTime) {
//				int dif = Math.abs(drop - this.pickUp);
//				int km = 15*dif;
//				t.setEarning(100 + ((km-5)*10));
//				
//				t.setCurPoint(this.drop);
//				t.setCurTime(this.pickUpTime + dif);
//				System.out.println(t);
//				return true;
//				}
//			}	
//		}
//		return false;
//	}
	
	
	
	public static void print(List<Taxi> taxi) {
		for(Taxi t : taxi) {
			System.out.println("TaxiId" + t.getTaxiId() + "Total Earnings-" + t.getTaxiEarning() );
			System.out.println("TaxiId\t BookingId\t CustomerId\t From\t To\t PickUpTime\t DropTime\t Amount");
		}
		
	}


}
