public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        java.util.Arrays.sort(numbers);
        System.out.println("min-" + numbers[0] + " max-" + numbers[numbers.length - 1]);
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        int average = 0;
        for (int num : numbers) {
            average = sum / numbers.length;
        }
        System.out.println("Average: " + average);


    }
}
