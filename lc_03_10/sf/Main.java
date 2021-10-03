package sf;

import java.util.ArrayList;
import java.util.Collections;

import sf.FastScanner;
import sf.SmartPhone;

public class Main {
 
	public static void main(String[] args) {
		FastScanner fs = new FastScanner ();
		SmartPhone apple = new SmartPhone ( "Apple", "Mac", 8 );
		apple.setVariable ( "Google", "Android", 15 );
		apple.ShowObj ();
		// System.out.println ( "Hello There!." );
	}

	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}

}
