package oop1;

import java.util.Arrays;

public class Triangle extends Shape {

	private double baseLength;
	private double height;

	public Triangle(String color, Point[] points, double baseLength, double height) {
		super(color, points);
		setBase(baseLength);
		setHeight(height);
	}

	public double getBase() {
		return baseLength;
	}

	public double getHeight() {
		return height;
	}

	public void setBase(double baseLength) {
		this.baseLength = baseLength;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calcArea() {
		return baseLength * height / 2;
	}

	public void moveShape(double deltaX, double deltaY) {
		for (Point point : getPoints()) {
			point.setX((int) (point.getX() + deltaX));
			point.setY((int) (point.getY() + deltaY));
		}
	}
	
	public String toString() {
		return super.getColor() + " Triangle Area: " + calcArea() + " " + Arrays.toString(super.getPoints());
	}

}
