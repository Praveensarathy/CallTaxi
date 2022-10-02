package callTaxi;

import java.util.*;

public class Taxi {
	private int id =1,taxiCurPoint ='a', taxiEarning =0,taxiTrip=0,taxiCurTime=6,taxiId = id++;	
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

	public List<Taxi> createTaxi(int n) {
		int i =0;
		List<Taxi> taxies = new ArrayList<Taxi>();
		for(i=0;i<n;i++) {
			Taxi t = new Taxi();
			taxies.add(t);
		}
		return taxies;
	}

	public boolean isAvail(List<Taxi> taxies) {
		Booking book = new Booking();
		System.out.println(book.getCusDrop());
//		for(Taxi taxi : taxies) {
//			if(getpickUpTime > 6)  {	
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
		return false;
		
		
	}
	
	
	
}
