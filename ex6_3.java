public class ex6_3 {
	static int findNegative(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -6};

		System.out.println("res:" + findNegative(arr));

	}
}