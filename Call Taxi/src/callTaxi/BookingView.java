package callTaxi;

import java.util.List;

public class BookingView {
	Booking book = new Booking();
	Taxi t = new Taxi();
	List<Taxi> taxi=  t.createTaxi(5);

	public void cusDetails() {
		System.out.println("Call Taxi Booking:");
		book.setBookingId(Booking.id++);
		System.out.print("Customer Id: "+ book.getBookingId());
		System.out.print("pickUp point :");
		book.setCustPickUpTime(Main.sc.next().charAt(0));

		System.out.print("drop point :");
		book.setCusDrop(Main.sc.next().charAt(0));

		System.out.print("pickUp Time :");
		book.setCustPickUpTime(Main.sc.nextInt());
		
		
	}
}
