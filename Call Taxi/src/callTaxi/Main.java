package callTaxi;

import java.util.*;

public class Main {
	public static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		System.out.printf(" Call Taxi Booking%n");
		BookingView start = new BookingView();
		start.cusDetails();
	}
}