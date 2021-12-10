package StreamPlatform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import streamingexception.*;

public class Main {
 
	public static void main(String[] args) {
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
