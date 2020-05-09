class Sergey {
	public static int findInd(int[] arr) {
		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 10) {
				res = i;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()
				* (int) (Math.pow(2, 31) * Math.pow(-1, (int) (Math.random() * 2))));
			System.out.println(arr[i]);
		}
		System.out.println(findInd(arr));
	}
}