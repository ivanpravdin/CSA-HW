public class RepeatEnd {

	public static String repeatEnd(String s, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += s.substring(s.length() - n);
		}
		return result;

	}

	public static void main(String[] args) throws OutOfMemoryError {
		System.out.print(repeatEnd("Hello", 3));

	}
}
