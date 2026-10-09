public class ArraySum {

    static int arraySum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        System.out.println("Sum = " + arraySum(numbers));
    }
}