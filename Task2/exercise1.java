import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * exercise1
 */
public class exercise1 {

    public static void main(String[] args) throws IOException{
    
        String input = Files.readString(Path.of("example.txt"));
        
        String regex = "^\\(?((\\d[0])?\\d{2})\\)?[\\.\\-\\s]?(\\d{2,4})[\\.\\-\\s]?((\\d{3})[\\.\\-\\s]?(\\d{4}))$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        
        Matcher matcher = pattern.matcher(input);

        HashSet<String> codes = new HashSet<>();
        HashSet<String> cities = new HashSet<>();
        HashSet<String> phones = new HashSet<>();        

        while(matcher.find()) {
            codes.add(matcher.group(1));
            cities.add(matcher.group(3));
            phones.add(matcher.group(5) + matcher.group(6));
        }
        System.out.println("Operator codes: " + codes);
        System.out.println("City Codes: " + cities);
        System.out.println("Phone number: " + phones);
    }
}