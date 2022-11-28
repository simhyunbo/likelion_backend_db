package hash.programmers;

public class printAlpha {
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            System.out.println(alphabet.charAt(i));
        }

        for (char d = 'A'; d <= 'Z'; d++) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.printf("%s%s\n", c,d);
            }
        }
    }
}
