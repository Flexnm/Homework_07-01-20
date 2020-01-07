package oop1;

import java.util.Arrays;

public class Rectangle extends Shape {

	private double width;
	private double length;

	public Rectangle(String color, Point[] points, double width, double length) {
		super(color, points);
		setWidth(width);
		setLength(length);
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double calcArea() {
		return width * length;
	}

	public void moveShape(double deltaX, double deltaY) {
		for (Point point : getPoints()) {
			point.setX((int) (point.getX() + deltaX));
			point.setY((int) (point.getY() + deltaY));
		}
	}

	public String toString() {
		return super.getColor() + " Rectangle Area: " + calcArea() + " " + Arrays.toString(super.getPoints());
	}
}
