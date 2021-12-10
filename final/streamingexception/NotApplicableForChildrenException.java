package streamingexception;

public class NotApplicableForChildrenException extends Exception {
	String ss;
	public NotApplicableForChildrenException ( String checked_exception ) {
		this.ss = checked_exception;
	}
	public String toString () {
		return this.ss;
	}
}
