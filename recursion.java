
public class recursion {

	public static void main(String[] args) {
		String s = "yyyzzzaa";
		System.out.println(stringClean(s));
		System.out.println(reverse(s));

	}

	public static String stringClean(String s) {
		if (s == "" || s.length() == 1) {
			return s;
		} else {
			String cleaned = stringClean(s.substring(1));
			if (s.charAt(0) == cleaned.charAt(0)) {
				return cleaned;
			} else {
				return s.charAt(0) + cleaned;
			}
		}
	}

	public static String reverse(String s) {
		if (s == "" || s.length() == 1) {
			return s;
		} else {
			return reverse(s.substring(1)) + s.charAt(0);
		}
	}
}
