class ex6_90 {
	static float findMiddle(float[] arr) {
		double sum = 0;

		for (float key: arr) {
			sum += (double) key;
		}
		return ((float) (sum / arr.length));
	}

	static float findTarget(float[] arr) {
		float middle = findMiddle(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > middle) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		float[] arr = { 1, 2, 25, 30, 14, 32, 52, 345, 6532 };
		float target =  findTarget(arr);
		System.out.println("Target is: " + target);
	}
}