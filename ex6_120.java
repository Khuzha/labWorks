
public class ex6_120 {
	private static int findMax(int[] arr) {
		int target = arr[0];

		for (int key: arr) {
			if (key > target) {
				target = key;
			}
		}
		return target;
	}


	private static int findAlmLast(int[] arr) {
		int max = findMax(arr);
		int target = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == (max - 1)) {
				target = i;
			}
		}
		return target;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 2, 3};

		System.out.println("res:" + findAlmLast(arr));
	}
}