import java.util.Random;

public class ISBN_GENERATOR {

	public static String ISBN() {
		String ISBN_CODE = "";
		Random rand = new Random();
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			int n = rand.nextInt(11);
			sum += n * (11 - i);
			if (n < 10) {
				ISBN_CODE += String.valueOf(n);
			} else {
				ISBN_CODE += "X";
			}
		}
		int CheckDigit = 11 - (sum % 11);
		if (CheckDigit < 10) {
			ISBN_CODE += String.valueOf(CheckDigit);
		} else {
			ISBN_CODE += "X";
		}
		return ISBN_CODE;

	}

	public static void main(String[] args) {
		System.out.println(ISBN());

	}

}
