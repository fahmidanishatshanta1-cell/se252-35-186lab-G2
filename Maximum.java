public class Maximum {

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int result = maximum(20, 35);
        System.out.println("Maximum = " + result);
    }
}