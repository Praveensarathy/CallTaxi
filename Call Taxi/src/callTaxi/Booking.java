package callTaxi;

import java.util.*;

public class Booking {
	public static int id =1;
	private int bookingId,CustPickUpTime,cusTaxiId,journeyCost;
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
	
	ArrayList<Booking> bookings = new ArrayList();
	public void cusDetails(Taxi numberOfTaxies, Booking book) {
		this.setBookingId(Booking.id++);
		System.out.println("Customer Id: "+ this.getBookingId());
		System.out.print("pickUp point :");
		this.setCurPickUp(Main.sc.next().charAt(0));

		System.out.print("drop point :");
		this.setCusDrop(Main.sc.next().charAt(0));

		System.out.print("pickUp Time :");
		this.setCustPickUpTime(Main.sc.nextInt());
		if(numberOfTaxies.isvail(book)) {
			bookings.add(book);
		}
	}
	public int getCusTaxiId() {
		return cusTaxiId;
	}
	public void setCusTaxiId(int cusTaxiId) {
		this.cusTaxiId = cusTaxiId;
	}
	public int getJourneyCost() {
		return journeyCost;
	}
	public void setJourneyCost(int journeyCost) {
		this.journeyCost = journeyCost;
	}

}
