package ShapeTest;

import ShapeTest.Shape3D;

public class ProduceShape3D {
	Shape3D createShape3D ( double a ) {
		Shape3D D = new Shape3D ();
		D.setName ( "Cube" );
		D.setArea ( 6.0d * a * a );
		return D;
	}
	Shape3D createShape3D ( double r, double h ) {
		Shape3D D = new Shape3D ();
		D.setName ( "Cylinder" );
		D.setArea ( (2.0d*Math.PI*r*h) + (2.0d*Math.PI*r*r) );
		return D;
	}
	Shape3D createShape3D ( double x, double y, double z ) {
		Shape3D D = new Shape3D ();
		D.setName ( "Cuboid" );
		D.setArea ( 2.0d*x*y + 2.0d*y*z + 2.0d*z*x );
		return D;
	}
}
