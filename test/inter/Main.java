package inter;
import java.util.ArrayList;
import java.util.Collections;

class illegalage extends Exception {
}

class illegaldesig extends Exception {
	private String detail;
	illegaldesig ( String s ) {
		this.detail = s;
	}
	public String toString () {
		return "[My Excecption : " + detail + "]";
	}
}

class excep {
	int age;
	String desig;
	void take_input () {
		FastScanner fs = new FastScanner ();
		age = fs.nextInt();
		desig = fs.next ();
		System.out.println ( "Age is : " + age );
		System.out.println ( "Des is : " + desig );
	}
	void test_age () {
		try {
			if ( age < 5 || age > 10 ) {
				throw new illegalage ();
			}
		} catch ( illegalage i ) {
			System.out.println ( "Hello hello hello." );
		}
	}
	void test_desig () throws illegaldesig {
		if ( ! new String("Admin").equals(new String(desig)) ) {
			throw new illegaldesig ( "Problem here" );
		}
	}
}

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner ();
		excep e = new excep ();
		e.take_input ();
		e.test_age ();
		try {
			e.test_desig ();
		} catch ( illegaldesig ii ) {
			System.out.println ( ii );
		}
	}

	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}

}
