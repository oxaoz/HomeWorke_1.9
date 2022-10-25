public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int numbers : arr) {
            sum += numbers;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }



}





