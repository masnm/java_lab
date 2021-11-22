package StructureTest;

import StructureTest.Structure;
import StructureTest.DevelopStructure;

public class StructureTest {
	public static void main ( String[] agrs ) {
		FastScanner fs = new FastScanner ();
		DevelopStructure D = new DevelopStructure ();
		Structure S;
		double da, db, dc;

		System.out.print ( "Input ? " );
		int num = fs.nextInt();
		System.out.print ( "Values ? " );

		if ( num == 1 ) {
			da = fs.nextDouble ();
			S = D.produceStructure ( da );
			S.printMe();
		} else if ( num == 2 ) {
			da = fs.nextDouble ();
			db = fs.nextDouble ();
			S = D.produceStructure ( da, db );
			S.printMe();
		} else if ( num == 3 ) {
			da = fs.nextDouble ();
			db = fs.nextDouble ();
			dc = fs.nextDouble ();
			S = D.produceStructure ( da, db, dc );
			S.printMe();
		} else {
			System.out.println ( "Wrong Input" );
		}
	}
}
