import java.util.Scanner;

public class ex1_9 {
    static int factorial(int n) {
        if (n == 0)
          return 1;
        else
          return(n * factorial(n-1));
    }
    
    private static  float calc (int k) {
        float res = (float) (Math.pow(-1, k) / factorial(k));
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float e =  (float) (0.5 * Math.pow(10, -4));
        float a = calc(1);
        float sum = a;
        float prev = 0f;

        System.out.println("e = " + e);

        for (int k = 2; Math.abs(a - prev) > e; k++) {
            System.out.println("a = " + a + " prev = " + prev + " sum = " + sum);
            prev = a;
            a = calc(k);
            sum += a;
        }
        System.out.printf("Sum = " + sum + "a = " + a + "\n");
    }
}
