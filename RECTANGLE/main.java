package RECTANGLE;

public class main {

	public static void main(String[] args) {
		Rectangle A = new Rectangle();
		Rectangle B = new Rectangle();

		A.tostring();
		B.tostring();

		A.moveIt(50);
		B.moveIt(50);

		System.out.println(A.getArea());
		System.out.println(B.getArea());
	}

}
