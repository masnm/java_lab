package pcomp;

public class ProductionCompany {
	private String companyName;
	ProductionCompany () {
		this.companyName = "NULL";
	}
	ProductionCompany ( String _name ) {
		this.companyName = _name;
	}
	public void stopProduction () {
		System.out.println ( "Production has been stopped" );
	}
	public void productionInfo () {
		System.out.println ( "Company Name is: " + companyName );
	}
	public String getName () { return this.companyName; }
	public void setName ( String _name ) { this.companyName = _name; }
}
