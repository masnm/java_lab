package ShapeTest;

public class Shape3D {
	public static void main ( String args[] ) {
		System.out.println("Hello" );
	}
	private String shapeName;
	private double shapeArea;

	Structure () {
		this.shapeName = "";
		this.shapeArea = 0.0d;
	}
	Structure ( String _name, double _area ) {
		this.shapeName = _name;
		this.shapeArea = _area;
	}

	public void printMe () {
		System.out.println ( "Shape Name : " + this.shapeName );
		System.out.println ( "Shape Area : " + this.shapeArea );
		System.out.println ( "" );
	}

	public String getName () { return this.shapeName; }
	public void setName ( String _name ) { this.shapeName = _name; }

	public double getArea () { return this.shapeArea; }
	public void setArea ( double _area ) { this.shapeArea = _area; }
}
