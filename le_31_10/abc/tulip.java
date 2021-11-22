package abc;

public class tulip {
	private String color;
	private double height;
	tulip () {
		this.color = "None";
		this.height = 0.0;
	}
	tulip ( String _color, double _height ) {
		this.color = _color;
		this.height = _height;
	}

	String getColor () { return this.color; }
	void setColor ( String _color ) { this.color = _color; }

	double getHeight () { return this.height; }
	void setHeight ( double _height ) { this.height = _height; }
	
	void printInfo () {
		System.out.println ( this.getColor() + " tulip height is " + this.getHeight() );
	}

	tulip mixTulip ( tulip another ) {
		tulip T = new tulip ();
		T.setHeight ( ( this.height + another.getHeight() ) / 2 );
		if ( this.color == "Red" &&
			another.getColor() == "White" )
			T.setColor ( "Pink" );
		else
			T.setColor ( "None" );
		return T;
	}

	tulip mixTulip ( tulip another1, tulip another2 ) {
		tulip T = new tulip ();
		T.setHeight ( ( this.height + another1.getHeight() + another2.getHeight() ) / 3 );
		T.setColor ( this.color + another1.getColor() + another2.getColor() );
		return T;
	}

}
