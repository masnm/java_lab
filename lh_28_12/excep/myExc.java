package excep;

public class myExc extends Exception {
	String s;
	myExc ( String abc ) {
		this.s = abc;
	}
	public String toString () {
		return this.s;
	}
}
