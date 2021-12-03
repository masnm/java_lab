package labt;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner S = new Scanner ( System.in );

		System.out.println ( "" );
		System.out.println ( "Starting Gmail App" );
		Gmail g = new Gmail ();
		g.open ( "./main.java \n" );
		g.create ( 12.45, 34.1213 );
		System.out.println ( "" );
		g.addMailBody ( "Noman", "Ahmmed\n" );
		g.attachImage ( "./profilepic.png\n" );
		g.choosetools ( "Gimp", "./wallpaper.png\n" );
		g.attachFile ( "verdict.pdf\n" );
		g.InsertFromDrive ( "drive.google.com/abc.png\n" );

		System.out.println ( "Starting ImageEditor App\n" );
		System.out.println ( "" );
		ImageEditor ie = new ImageEditor ();
		ie.choosetools ( "Photoshop", "./Background.png\n" );
	}

}
