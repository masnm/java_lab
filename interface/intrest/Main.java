package intrest;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
 
	public static void main(String[] args) {
		FastScanner fs = new FastScanner ();
		aclas ac = new aclas ();
		ac.yes();
		ac.hello();
		System.out.println ( "Hello There!." );
	}

	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}

}
