package create_tulip;	

public class create_tulip {
	public static void main ( String args[] ) {
		tulip red_tulip = new tulip ( "Red", 2 );
		tulip white_tulip = new tulip ( "White", 2 );
		System.out.println ( "Properties of the first tulip object" );
		red_tulip.printInfo ();
	}
}
