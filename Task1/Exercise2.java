import java.util.LinkedHashMap;;

/**
 * Example2
 */
public class Exercise2 {

    public static void main(String[] args) {
        String phrase = "This is is a new text text that have repeating repeating repeating words";
        String[] phraseArray = phrase.split(" ");
        LinkedHashMap<String, Integer> matches = new LinkedHashMap<>();
        for (String string : phraseArray) {
            matches.put(string, matches.getOrDefault(string, 0) + 1);
        }
        for (String key : matches.keySet()) {
            if(matches.get(key) > 1) {
                System.out.println(key + ":" + matches.get(key));
            }
        }
    }
}