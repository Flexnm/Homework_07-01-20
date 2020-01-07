package oop1;

public abstract class Shape {

	private Point[] points;
	private String color;

	public Shape(String color, Point[] points) {
		setColor(color);
		setPoints(points);
	}

	public String getColor() {
		return color;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	public abstract double calcArea();

	public abstract void moveShape(double deltaX, double deltaY);

}
