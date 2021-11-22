package shapeDemo;

import shapeDemo.Circle;

public class shapeDemo {
	public static void main ( String args[] ) {
		Circle c = new Circle ( 12, "Green" );
		System.out.println ( c.color );
		System.out.println ( c.radious );
		System.out.println ( c.getArea() );
	}
}
