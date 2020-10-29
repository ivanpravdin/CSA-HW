public class CodeCounter {

	public static int countCode(String s) {
		int count = 0;
		for (int i = 0; i < s.length() - 3; i++) {
			if (s.substring(i, i + 2).equals("co") && s.substring(i + 3, i + 4).equals("e"))
				count++;
		}
		return count;

	}

	public static void main(String[] args) throws OutOfMemoryError {
		System.out.print(countCode("codexxcode"));

	}
}
