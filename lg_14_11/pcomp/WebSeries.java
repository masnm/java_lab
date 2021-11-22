package pcomp;

public class WebSeries extends ProductionCompany {
	private String seriesName;
	private String platformName;

	WebSeries () {
		super ();
		this.seriesName = "NULL";
		this.platformName = "NULL";
	}
	WebSeries ( String _name ) {
		super ( _name );
		this.seriesName = "NULL";
		this.platformName = "NULL";
	}
	WebSeries ( String _name, String _sname, String _pname ) {
		super ( _name );
		this.seriesName = _sname;
		this.platformName = _pname;
	}

	public String getSeries () { return this.seriesName; }
	public String getPlatform () { return this.platformName; }

	public void setSeries ( String _sname ) { this.seriesName = _sname; }
	public void setPlatform ( String _pname ) { this.platformName = _pname; }

	public void productionInfo () {
		super.productionInfo ();
		System.out.println ( "Series Name is: "+ seriesName );
		System.out.println ( "Platform Name is: "+ platformName );
	}

	public void printMe () {
		productionInfo ();
		stopProduction ();
		System.out.println("");
	}
}
