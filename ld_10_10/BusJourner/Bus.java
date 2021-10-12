package BusJourner;

public class Bus {
	public String destination;
	public double mile;
	public double ticketPrice;

	Bus () {
		destination = null;
		mile = -1.0;
		ticketPrice = -1.0;
	}

	Bus ( String _des, double _mile, double _price ) {
		destination = _des;
		mile = _mile;
		ticketPrice = _price;
	}

	double getDiscount () {
		if ( mile >= 150 && mile <= 170 ) {
			return ticketPrice - ( 0.3 * ticketPrice );
		} else {
			return ticketPrice;
		}
	}
}
