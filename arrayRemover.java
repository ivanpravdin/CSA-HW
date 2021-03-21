import java.util.Random;

public class arrayRemover {

	public static int[] remover(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0)
				continue;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					arr[j] = 0;
			}
		}
		return arr;
	}

	public static int[] createArray(int n) {
		Random rd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(999) + 1;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = createArray(1000000);

		long startTime = System.nanoTime();
		remover(arr);
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println(duration / 1000000);
		// for (int i : arr) {
		// System.out.print(i + " ");
		// }

	}

}
