import java.io.Console;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.io.IOException;
/**
 * exercise2
 */
public class exercise2 {

    public static void main(String[] args) throws IOException {
        Console console = System.console();
        String input = console.readLine();
        
        String regex = "^\\(?((\\d[0])?\\d{2})\\)?[\\.\\-\\s]?(\\d{2,4})[\\.\\-\\s]?((\\d{3})[\\.\\-\\s]?(\\d{4}))$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Your phone number " + input + " is valid.");
        } else {
            System.out.println("Your phone number " + input + " is invalid.");
        }
    }
}