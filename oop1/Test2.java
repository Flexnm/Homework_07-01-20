package oop1;

public class Test2 {

	public static void main(String[] args) {

		String[] colors = { "Red", "Blue", "Green", "Yellow", "Grey", "Black", "Purple", "Pink", "Brown", "White" };
		Shape[] shapes = new Shape[10];
		for (int i = 0; i < shapes.length; i++) {
			int rnd = (int) (Math.random() * 3 + 1);
			String color = colors[(int) (Math.random() * colors.length)];
			switch (rnd) {
			case 1:
				shapes[i] = new Circle(color, givePoints(rnd, 0, 0), (int) (Math.random() * 11 + 1));
				break;
			case 2:
				double base = (int) (Math.random() * 11 + 1);
				double height = (int) (Math.random() * 11 + 1);
				shapes[i] = new Triangle(color, givePoints(rnd, base, height), base, height);
				break;
			case 3:
				double width = (int) (Math.random() * 11 + 1);
				double length = (int) (Math.random() * 11 + 1);
				shapes[i] = new Rectangle(color, givePoints(rnd, width, length), width, length);
				break;
			}
		}
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}

		System.out.println("======MOVE SHAPE======");
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].moveShape((int) (Math.random() * 11 + 1), (int) (Math.random() * 11 + 1));
			System.out.println(shapes[i]);
		}

	}

	public static Point[] givePoints(int shapeNum, double side1, double side2) {
		switch (shapeNum) {
		case 1:
			Point[] pointsC = new Point[1];
			int x = (int) (Math.random() * 11);
			int y = (int) (Math.random() * 11);
			pointsC[0] = new Point(x, y);
			return pointsC;
		case 2:
			Point[] pointsT = new Point[3];
			do {
				for (int i = 0; i < pointsT.length; i++) {
					x = (int) (Math.random() * 101);
					y = (int) (Math.random() * 101);
					pointsT[i] = new Point(x, y); // A point of the base.
				}

			} while ((side1 * side2
					/ 2) != (pointsT[0].getX() * (pointsT[1].getY() - pointsT[2].getY())
							+ pointsT[1].getX() * (pointsT[2].getY() - pointsT[0].getY())
							+ pointsT[2].getX() * (pointsT[0].getY() - pointsT[1].getY())) / 2);

			return pointsT;
		case 3:
			Point[] pointsR = new Point[4];
			x = (int) (Math.random() * 11);
			y = (int) (Math.random() * 11);
			pointsR[0] = new Point(x, y);
			pointsR[1] = new Point(x + (int) side1, y);
			pointsR[2] = new Point(x + (int) side1, y + (int) side2);
			pointsR[3] = new Point(x, y + (int) side2);
			return pointsR;
		}
		return null;
	}

}
