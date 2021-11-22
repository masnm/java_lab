package StructureTest;

public class Structure {
	private String structureName;
	private double structureVolume;

	Structure () {
		this.structureName = "";
		this.structureVolume = 0.0d;
	}
	Structure ( String _name, double _volume ) {
		this.structureName = _name;
		this.structureVolume = _volume;
	}

	public void printMe () {
		System.out.println ( "Structure Name : " + this.structureName );
		System.out.println ( "Structure Volume : " + this.structureVolume );
		System.out.println ( "" );
	}

	public String getStName () { return this.structureName; }
	public void setStName ( String _name ) { this.structureName = _name; }

	public double getStVolume () { return this.structureVolume; }
	public void setStVolume ( double _volume ) { this.structureVolume = _volume; }
}
