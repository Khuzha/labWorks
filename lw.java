import java.util.Scanner;
import java.util.Arrays;

public class Main {
	private static float[] replace(float[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите значение m:");
		int m = scan.nextInt();

		if (m > arr.length - 1) {
			System.out.println("m не может быть больше arr.length - 1");
			return null;
		}

		float temp = arr[arr.length - 1];
		arr[arr.length - 1] = arr[m];
		arr[m] = temp;
		System.out.println("Результат: " + Arrays.toString(arr));
		return arr;
	} 
	public static void main(String[] args) {
		float[] arr = {1.12f, 123.34345f, 423.34450f, 4983.324f, 23094.309f};
		replace(arr);
	}
}