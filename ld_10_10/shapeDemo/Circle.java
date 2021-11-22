package shapeDemo;

public class Circle {

	public double radious;
	public String color;

	Circle () {
	}

	Circle ( double a, String col ) {
		this.radious = a;
		this.color = col;
	}

	public double getArea () {
		return radious * radious * Math.PI ;
	}

	public void setRadious ( double radious ) {
	}

}
