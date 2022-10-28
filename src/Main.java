public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        task1();
        task2();
        task3();
        task4();
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

    public static void task2() {
        int[] arr = generateRandomArray();
        int maxExpenses = 0;
        int minExpenses = 200_000;
        //for (int i = 0; i < arr.length; i++) {
        for (int current : arr) {
            //int current = arr[i];
            if (current > maxExpenses) {
                maxExpenses = current;
            }
            if (current < minExpenses) {
                minExpenses = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + "рублей. Максимальная сумма трат за день составила " + maxExpenses + "рублей.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sumOfExpenses = 0;
        double averageExpenses;
        for (int current : arr) {
            if (current > sumOfExpenses) {
                sumOfExpenses += current;
            }
        }
        averageExpenses = (double) sumOfExpenses / arr.length;
        System.out.print("Средняя сумма трат за месяц составила " + averageExpenses + " рублей.");
        System.out. println();
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}





