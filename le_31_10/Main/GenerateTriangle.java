package Main;

import Main.Triangle;

public class GenerateTriangle {
	Triangle createTriangle () {
		Triangle T = new Triangle ();
		return T;
	}
	Triangle createTriangle ( double side ) {
		double area = Math.sqrt ( 3 ) / 4;
		area *= side * side;
		Triangle T = new Triangle ( "Equilateral Triangle", area );
		return T;
	}
	Triangle createTriangle ( double side, double base ) {
		double area = 0.5 * base * side;
		Triangle T = new Triangle ( "Isosceles Triangle", area );
		return T;
	}
	Triangle createTriangle ( double side1, double side2, double side3 ) {
		double s = ( side1 + side2 + side3 ) / 2;
		double area = s * ( s - side1 ) * ( s - side2 ) * ( s - side3 );
		area = Math.sqrt ( area );
		Triangle T = new Triangle ( "Scalene Triangle", area );
		return T;
	}
}
