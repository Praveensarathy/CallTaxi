package callTaxi;

import java.util.*;

public class Taxi {
	static private int id =0;
	private String taxiDetail;
	private int	taxiCurPoint ='a', taxiEarning =0,taxiTrip=0,taxiCurTime=6,taxiId = id++,taxiBookingId;	
	public int getTaxiCurPoint() {
		return taxiCurPoint;
	}

	public void setTaxiCurPoint(int taxiCurPoint) {
		this.taxiCurPoint = taxiCurPoint;
	}

	public int getTaxiEarning() {
		return taxiEarning;
	}

	public void setTaxiEarning(int taxiEarning) {
		this.taxiEarning = taxiEarning;
	}

	public int getTaxiTrip() {
		return taxiTrip;
	}

	public void setTaxiTrip(int taxiTrip) {
		this.taxiTrip = taxiTrip;
	}

	public int getTaxiCurTime() {
		return taxiCurTime;
	}

	public void setTaxiCurTime(int taxiCurTime) {
		this.taxiCurTime = taxiCurTime;
	}

	public int getTaxiId() {
		return taxiId;
	}

	public void setTaxiId(int taxiId) {
		this.taxiId = taxiId;
	}
	public int getTaxiBookingId() {
		return taxiBookingId;
	}

	public void setTaxiBookingId(int taxiBookingId) {
		this.taxiBookingId = taxiBookingId;
	}

	public String getTaxiDetail() {
		return taxiDetail;
	}

	public void setTaxiDetail(String taxiDetatil) {
		this.taxiDetail = taxiDetatil;
	}

	List<Taxi> taxies = new ArrayList<Taxi>();
	public List<Taxi> createTaxi(int n) {
		int i;
		for(i=0;i<n;i++) {
			Taxi t = new Taxi();
			taxies.add(t);
			
		}
		return taxies;
	}
	public boolean isvail( Booking book) {
		
		for(Taxi taxi : taxies) {
			
				if(book.getCurPickUp() == taxi.taxiCurPoint && book.getCustPickUpTime() >= taxi.taxiCurTime) {
					int dif = Math.abs(book.getCusDrop() - taxi.taxiCurPoint);
					int km = 15*dif;
					book.setJourneyCost(100 + ((km-5)*10));
					taxi.setTaxiEarning(taxi.getTaxiEarning() + book.getJourneyCost() );
					taxi.setTaxiCurPoint(book.getCusDrop());
					taxi.setTaxiCurTime(book.getCustPickUpTime() + dif);
					book.setCusTaxiId(taxi.taxiId);
					taxi.taxiTrip++;
					taxi.taxiBookingId = book.getBookingId();
					if(taxi.getTaxiCurTime() > 12) {
						return false;
					}
					return true;
				}
				else if(book.getCurPickUp() > taxi.taxiCurPoint && book.getCustPickUpTime() > taxi.taxiCurTime) 
				{
					int dif = Math.abs(book.getCusDrop() - taxi.taxiCurPoint);
					int km = 15*dif;
					book.setJourneyCost(100 + ((km-5)*10));
					taxi.setTaxiEarning(taxi.getTaxiEarning() + book.getJourneyCost() );
					taxi.setTaxiCurPoint(book.getCusDrop());
					taxi.setTaxiCurTime(book.getCustPickUpTime() + dif);
					taxi.taxiTrip++;
					taxi.taxiBookingId = book.getBookingId();
					book.setCusTaxiId(taxi.taxiId);
					if(taxi.getTaxiCurTime() > 12) {
						return false;
					}
				
					System.out.println("\n");
					return true;
				}
			}
		return false;
	}
	public void TaxiStatus(ArrayList<Booking> bookings) {
		System.out.println("--------------------------------------------------------------------");
		for(Taxi taxi : taxies) {
			System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","|BookingId|","|PickUpTime|","|PickUpLocation|", "|DropLocation|", "Earning");	
			for(Booking book : bookings) {
				if(taxi.getTaxiId() == book.getCusTaxiId()) {
					System.out.printf("%5d%15d%17c%15c%13d\n",book.getBookingId(),book.getCustPickUpTime(),book.getCurPickUp(), book.getCusDrop(), book.getJourneyCost());
				}
			}
			System.out.printf("Taxi Id : %d Taxi Free Time - %-10d Total Earning--> %5d\n", taxi.taxiId ,taxi.getTaxiCurTime(), taxi.getTaxiEarning());
			System.out.println("--------------------------------------------------------------------");
		}
	}

}