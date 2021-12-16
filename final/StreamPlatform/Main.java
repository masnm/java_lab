package StreamPlatform;

import streamingexception.*;
import StreamPlatform.adir.*;

public class Main {
 
	public static void main(String[] args) {

		adir ad = new adir();
		ad.sayHi();

		System.out.println("Hello");
		Subscription s = new Subscription ();
		try {
			s.buySubscription ( "123456", "Mastercard", 123 );
		} catch ( CardNotWorkingException e ) {
			System.out.println ( e );
		}

		try {
			s.cheakAge ( 13, "G" );
		} catch ( NotApplicableForChildrenException e ) {
			System.out.println ( e );
		}

	}

}
