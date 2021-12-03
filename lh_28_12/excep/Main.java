package excep;

import java.util.Scanner;
import java.lang.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner S = new Scanner ( System.in );

		// int ar[] = { 1, 2, 3, 4};
		// try {
		// 	System.out.println ( ar[4] );
		// } catch ( ArrayIndexOutOfBoundsException e ) {
		// 	System.out.println ( e );
		// }
		// System.out.println ( "Heellooo" );

		// int a = S.nextInt();
		// try {
		// 	int b = 5 / a;
		// 	System.out.println ( b );
		// } catch ( ArithmeticException e ) {
		// 	System.out.println ( e );
		// }
		// System.out.println ( "Heellooo" );

		try {
			if ( S.nextInt() == 0 )
				throw new myExc ( "Exception Thrown" );
			throw new ArrayIndexOutOfBoundsException("Hello");
		} catch ( myExc|ArithmeticException me ) {
			System.out.println ( me );
		} catch ( Exception e ) {
			e.printStackTrace();
		} finally {
			System.out.println ( "No matter what, i am going to execute." );
		}
		System.out.println ( "Heellooo" );

	}

}
