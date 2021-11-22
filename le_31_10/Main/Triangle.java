package Main;

public class Triangle {
	private String name;
	private double area;
	Triangle () {
		name = "Null";
		area = 0.0;
	}
	Triangle ( String _name, double _area ) {
		this.name = _name;
		this.area = _area;
	}
	String getName () { return this.name; }
	void setName ( String _name ) { this.name = _name; }
	double getArea () { return this.area; }
	void setArea ( double _area ) { this.area = _area; }
}
