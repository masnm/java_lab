package abc;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
 
	public static void main(String[] args) {
		FastScanner fs = new FastScanner ();

		tulip red_tulip = new tulip ( "Red", 2 );
		tulip yellow_tulip = new tulip ( "Yellow", 6 );
		tulip white_tulip = new tulip ( "White", 4 );
		System.out.println ( "Properties of the first tulip object" );
		red_tulip.printInfo ();

		tulip mixedTulip = red_tulip.mixTulip ( white_tulip );
		mixedTulip.printInfo ();

		mixedTulip = yellow_tulip.mixTulip ( red_tulip, white_tulip );
		mixedTulip.printInfo ();
	}
}
