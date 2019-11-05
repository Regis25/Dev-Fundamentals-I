import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Exercise3
 */
public class Exercise3 {

    public static void main(String[] args) {
        String firstWord = "H e llo";
        String secondWord = "oehLL ";
        System.out.println(isAnagram(firstWord, secondWord));
    }

    private static boolean isAnagram(String firstWord, String secondWord) {
        firstWord = firstWord.replace(" ", "").toLowerCase();
        secondWord = secondWord.replace(" ", "").toLowerCase();
        char[] firstWordArray = firstWord.toCharArray();
        String regex = "^[" + firstWord + "]{" + firstWordArray.length + "}+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(secondWord);
        return matcher.matches();
    }

}