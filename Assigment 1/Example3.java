import java.io.Console;

public class Example3 {

    public static void main(String [] args) {
        Console console = System.console();
        System.out.println("Check if it is Palindrome");
        String word = console.readLine();
        System.out.println(checkPalindrome(word));
    }

    public static boolean checkPalindrome(final String inputString) {
        boolean isPalindrome = true;
        int length = inputString.toCharArray().length - 1;
        for (int i = 0; i <= length; i++) {
            if (i != length - i && isPalindrome) {
                isPalindrome &= inputString.toCharArray()[i] == inputString.toCharArray()[length - i];
            } else {
                break;
            }
        }
        return isPalindrome;
    }
}