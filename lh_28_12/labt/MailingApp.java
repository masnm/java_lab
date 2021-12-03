package labt;

public abstract class MailingApp implements ScannerApp, ImageApp {
	public void addMailBody ( String M, String H ) {
		System.out.println ( " Hi, I am " + M + ", sending mail to " + H );
	}
	public void attachImage ( String Z ) {
		System.out.println ( "Parameter of attachImage : " + Z );
	}
}
