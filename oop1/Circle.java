package oop1;

import java.util.Arrays;

public class Circle extends Shape {

	private double radius;

	public Circle(String color, Point[] points, double radius) {
		super(color, points);
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calcArea() {
		return radius * radius * Math.PI;
	}

	public void moveShape(double deltaX, double deltaY) {
		for (Point point : getPoints()) {
			point.setX((int) (point.getX() + deltaX));
			point.setY((int) (point.getY() + deltaY));
		}
	}
	
	public String toString() {
		return super.getColor() + " Circle Area: " + calcArea() + " " + Arrays.toString(super.getPoints());
	}

}
