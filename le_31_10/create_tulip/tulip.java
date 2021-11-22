project create_tulip;

class tulip {
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
}
