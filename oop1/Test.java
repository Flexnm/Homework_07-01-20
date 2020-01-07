package oop1;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		Point point = new Point(-1, 1);
		Point[] points = new Point[1];
		points[0] = point;
		Shape c = new Circle("blue", points, 1);

		System.out.println(Arrays.toString(points));

		System.out.println(Arrays.toString(c.getPoints()));

		c.moveShape(2, 2);

		System.out.println(Arrays.toString(c.getPoints()));

		Shape[] shapes = new Shape[10];
		for (int i = 0; i < shapes.length; i++) {
			int rnd = (int) (Math.random() * 3 + 1);
			switch (rnd) {
			case 1:
				shapes[i] = new Circle("", givePoints(rnd), (int) (Math.random() * 11 + 1));
				break;
			case 2:
				double base = (int) (Math.random() * 11 + 1);
				double height = (int) (Math.random() * 11 + 1);
				shapes[i] = new Triangle("", givePoints(rnd), base, height);
				break;
			case 3:
				double width = (int) (Math.random() * 11 + 1);
				double length = (int) (Math.random() * 11 + 1);
				shapes[i] = new Rectangle("", givePoints(rnd), width, length);
				break;
			}
		}
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}

	}

	public static Point[] givePoints(int shapeNum) {
		switch (shapeNum) {
		case 1:
			Point[] pointsC = new Point[1];
			int x = (int) (Math.random() * 11);
			int y = (int) (Math.random() * 11);
			pointsC[0] = new Point(x, y);
			return pointsC;
		case 2:
			Point[] pointsT = new Point[3];
			for (int i = 0; i < pointsT.length; i++) {
				x = (int) (Math.random() * 11);
				y = (int) (Math.random() * 11);
				pointsT[i] = new Point(x, y);
			}
			return pointsT;
		case 3:
			Point[] pointsR = new Point[4];
			for (int i = 0; i < pointsR.length; i++) {
			x = (int) (Math.random() * 11);
			y = (int) (Math.random() * 11);
			pointsR[i] = new Point(x, y);
			}
			return pointsR;
		}
		return null;
	}

}
