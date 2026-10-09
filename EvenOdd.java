public class EvenOdd {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 12;

        if (isEven(number)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}