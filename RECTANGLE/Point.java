package RECTANGLE;

import java.util.Random;

public class Point {

	int CoordinateX;
	int CoordinateY;

	public Point() {
		this.CoordinateX = 0;
		this.CoordinateY = 0;
	}

	private void setCoordinates(int x, int y) {
		this.CoordinateX = x;
		this.CoordinateY = y;
	}

	private int getCoordinateX() {
		return this.CoordinateX;
	}

	private int getCoordinateY() {
		return this.CoordinateY;
	}

	void tostring() {
		System.out.println("I am a point with coordinate X: " + String.valueOf(getCoordinateX()) + ", coordinate Y: "
				+ String.valueOf(getCoordinateY()));
	}

	void randomPosition() {
		Random rand = new Random();
		int x = rand.nextInt(100);
		int y = rand.nextInt(100);
		setCoordinates(x, y);
	}

	void changeX(int n) {
		setCoordinates(this.CoordinateX + n, this.CoordinateY);
	}
}
