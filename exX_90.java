public class exX_90 {
    public static void main(String[] args) {
        float arr[] = new float[10];
        float target = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            target += i;
        }
        target /= arr.length;
        System.out.println("target = " + target);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                System.out.println("Номер первого элемента в массиве," +
                    "значение которого больше среднего арифметического" +
                    "всех значений этого же массива - " + i);
                return;
            }
        }
    }
}