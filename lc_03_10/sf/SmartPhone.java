package sf;

public class SmartPhone {
	public String maker;
	public String os;
	public int modelNo;

	SmartPhone ( )
	{
	}

	SmartPhone ( String _maker, String _os, int _model )
	{
		this.maker = _maker;
		this.os = _os;
		this.modelNo = _model;
	}

	void setVariable (  String _maker, String _os, int _model  )
	{
		this.maker = _maker;
		this.os = _os;
		this.modelNo = _model;
	}

	public void ShowObj ()
	{
		System.out.println ( "Maker : " + maker );
		System.out.println ( "Operating System : " + os );
		System.out.println ( "Model no : " + modelNo );
	}
}
