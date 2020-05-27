class ex5_90 {
	static double multiplyOdd (float[] arr) {
		double result = 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				result *= (double) arr[i];
			}
		}
		return result;
	}
	public static void main (String[] args) {
		float[] arr = { 1, 2, 25, 30, 14, 32, 52, 345, 6532 };
		double result = multiplyOdd(arr);
		System.out.println("Result is: " + result);
	}
}