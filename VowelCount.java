
public class VowelCount {

    static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Programming"));
    }
}