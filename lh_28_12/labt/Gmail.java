package labt;

public class Gmail extends MailingApp {
	public void open ( String Filname ) {
		System.out.println ( "Opening File : " + Filname );
	}
	public void create ( double startTime, double endTime ) {
		System.out.println ( "File Scanning starts at : " + startTime );
		System.out.println ( "File Scanning ends at : " + endTime );
	}
	public void choosetools ( String Tool, String Image ) {
		System.out.println ( "Chooseing image : " + Image + " using tool : " + Tool );
	}
	public void attachFile ( String C ) {
		System.out.println ( "Attached: file from local " + C );
	}
	public void InsertFromDrive ( String C ) {
		System.out.println ( "Attached: file from Drive " + C );
	}
}
