package pcomp;

public class TVSeries extends ProductionCompany {
	private String tvSeriesName;

	TVSeries () {
		super ();
		this.tvSeriesName = "NULL";
	}
	TVSeries ( String _name ) {
		super ( _name );
		this.tvSeriesName = "NULL";
	}
	TVSeries ( String _name, String _sname ) {
		super ( _name );
		this.tvSeriesName = _sname;
	}

	public String getTVSeries () { return this.tvSeriesName; }
	public void setTVSeries ( String _ts ) { this.tvSeriesName = _ts; }

	public void productionInfo () {
		super.productionInfo ();
		System.out.println ( "Series Name is: "+ tvSeriesName );
	}

	public void printMe () {
		productionInfo ();
		stopProduction ();
		System.out.println("");
	}
}
