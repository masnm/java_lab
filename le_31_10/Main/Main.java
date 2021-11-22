package Main;

import Main.Triangle;
import Main.GenerateTriangle;
import Main.FastScanner;

public class Main {
 
	public static void main(String[] args) {
		GenerateTriangle GT = new GenerateTriangle ();
		Triangle T = new Triangle ();

		FastScanner fs = new FastScanner ();
		System.out.println ( "Input : " );
		int inpts = fs.nextInt();
		double da, db, dc;
		if ( inpts == 1 ) {
			da = fs.nextDouble ();
			T = GT.createTriangle ( da );
		} else if ( inpts == 2 ) {
			da = fs.nextDouble ();
			db = fs.nextDouble ();
			T = GT.createTriangle ( da, db );
		} else if ( inpts == 3 ) {
			da = fs.nextDouble ();
			db = fs.nextDouble ();
			dc = fs.nextDouble ();
			T = GT.createTriangle ( da, db, dc );
		} else
			System.out.println ( "Invalid choice" );

		System.out.println ( T.getName() + " Area:" + T.getArea() );
	}

}
