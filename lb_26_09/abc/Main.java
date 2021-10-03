package abc;

import abc.FastScanner;
import abc.PairM;
 
public class Main {
	final int p = 25;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner ();
		PairM p = new PairM ( 3, 6 );
		System.out.println ( p.max () );
		Main mc = new Main();
		mc.p = 35;
		System.out.println ( mc.p );
		System.out.println ( "So, this works !" );
	}
}
