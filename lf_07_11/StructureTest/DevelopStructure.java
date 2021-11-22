package StructureTest;

import StructureTest.Structure;

public class DevelopStructure {
	Structure produceStructure ( double _radius ) {
		Structure S = new Structure ();
		S.setStName ( "Sphere" );
		double volume = 4.0d / 3.0d;
		volume *= Math.PI;
		volume *= _radius * _radius;
		S.setStVolume ( volume );
		return S;
	}
	Structure produceStructure ( double _radius, double _height ) {
		Structure S = new Structure ();
		S.setStName ( "Cone" );
		double volume = 1.0d / 3.0d;
		volume *= Math.PI;
		volume *= _radius * _radius;
		volume *= _height;
		S.setStVolume ( volume );
		return S;
	}
	Structure produceStructure ( double _base, double _height, double _length ) {
		Structure S = new Structure ();
		S.setStName ( "Triangular Prism" );
		double volume = 1.0d / 2.0d;
		volume *= _base * _height;
		volume *= _length;
		S.setStVolume ( volume );
		return S;
	}
}
