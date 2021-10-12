package BusJourner;

import java.util.Scanner;

import BusJourner.Bus;

public class BusJourner {
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );

		Bus bus = new Bus( "Khulna", 155, 2500 );
		System.out.println ( "Destination Place = " + bus.destination );
		System.out.println ( "Destination in mile = " + bus.mile );
		System.out.println ( "Origenal ticket price = " + bus.ticketPrice );
		System.out.println ( "Discounted price if any = " + bus.getDiscount() );
	}
}

