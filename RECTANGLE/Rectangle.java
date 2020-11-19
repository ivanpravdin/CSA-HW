package RECTANGLE;

public class Rectangle {
	Point PointA;
	Point PointB;

	public Rectangle() {
		PointA = new Point();
		PointB = new Point();
		PointA.randomPosition();
		PointB.randomPosition();
	}

	public void tostring() {
		System.out.println("I am Rectangle with Point A (" + String.valueOf(PointA.CoordinateX) + ", "
				+ String.valueOf(PointA.CoordinateY) + "), Point B (" + String.valueOf(PointB.CoordinateX) + ", "
				+ String.valueOf(PointB.CoordinateY) + ").");
	}

	public void randomSize() {
		PointA.randomPosition();
		PointB.randomPosition();
	}

	public int getArea() {
		return Math.abs(PointA.CoordinateX - PointB.CoordinateX) * Math.abs(PointA.CoordinateY - PointB.CoordinateY);
	}

	public void moveIt(int n) {
		PointA.CoordinateX += n;
		PointB.CoordinateX += n;
	}

}
