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
	public void cusDetails(Taxi numberOfTaxies) {
		this.setBookingId(Booking.id++);
		System.out.println("  Customer Id   : "+ this.getBookingId() );
		System.out.println();
		System.out.print("  pickUp point \n[a][b][c][d][e] : ");
		this.setCurPickUp(Booking.validateName().charAt(0));
		System.out.println();
		System.out.print("  drop point \n[a][b][c][d][e] : ");
		this.setCusDrop(Booking.validateName().charAt(0));
		System.out.println();
		System.out.print("pickUp Time[6-12] : ");
		this.setCustPickUpTime(Booking.validateInteger());
		System.out.println();
		
	}
	public static String validateName() {
		String value = "";
		boolean handled = false;
		while(!handled) {
			try {
				value = Main.sc.nextLine();
				if(value.charAt(0) >= 'a' && value.charAt(0) <= 'e') {
					
					handled = true;
				}
				else {
					System.out.print("Please choose these Location only [a][b][c][d][e]:");
					handled = false;
				}
				
			}
			catch(Exception e) {
				System.out.println("Enter valid name! : ");
				handled =  false;
			}
		}
		return value;
	}
	public static int validateInteger() {
		int value = 0;
		boolean handled = false;
		while(!handled) {
			try {
				value = Integer.parseInt(Main.sc.nextLine());
				handled = true;
			}
			catch(Exception e){
				System.out.print("Enter valid option[1][2][3]  : ");
				handled = false;
			}
		}
		return value;
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
