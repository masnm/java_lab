package StreamPlatform;

import streamingexception.*;

public class Subscription {
	public void buySubscription ( String cardNo, String type, double fee )
			throws CardNotWorkingException {
		String ta = "Mastercard";
		String tb = "Visa";
		if ( cardNo.length() == 16 && (type.equals(ta)||type.equals(tb)) ) {
			double parcent = 5.2;
			System.out.println("Giving "+parcent+" Concession.");
			double ffee = (5.2/100.0)*fee;
			System.out.println("Final fee is " + ffee );
		} else {
			throw new CardNotWorkingException("Invalid Card");
		}
	}

	public void cheakAge ( int age, String rating ) throws NotApplicableForChildrenException {
		String r="R",m="M",g="g",pg="PG";
		if ( age < 18 && rating.equals(r) ) {
			throw new NotApplicableForChildrenException("Not applicable for people under 18");
		} else if ( age < 15 && rating.equals(m) ) {
			throw new NotApplicableForChildrenException("Not applicable for kids under 15");
		} else if ( age < 18 && (rating.equals(g)||rating.equals(pg)) ) {
			System.out.println("Applicable for Kids");
		}
	}
}
