import java.util.Scanner;

public class ex4_50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean gotNum = false;
        float fact = 1;
        System.out.println("Введите значение числа n (больше нуля):");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("Число должно было быть больше нуля");
            return;
        }

        for (float i = 1; i <= n; i += 0.1) {
            fact *= i;
        }

        System.out.println("Результат равен " + fact);
    }
}

