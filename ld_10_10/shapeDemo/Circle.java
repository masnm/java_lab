package shapeDemo;

public class Circle {

	private double radious;
	private String color;

	Circle () {
	}

	Circle ( double a, String col ) {
		this.radious = a;
		this.color = col;
	}

	private double getArea () {
		return radious * radious * Math.PI ;
	}

	public void setRadious ( double radious ) {
	}

}
