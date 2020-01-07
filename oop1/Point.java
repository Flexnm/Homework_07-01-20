package oop1;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		if(x < 0) {
			x = -x;
		}
		this.x = x;
	}

	public void setY(int y) {
		if(y < 0) {
			y = -y;
		}
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
