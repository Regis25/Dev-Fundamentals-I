import java.io.Console;

public class Example2 {
    
    public static void main(String [] args) {
        Console console = System.console();
        System.out.println("Century from Year");
        double year = Double.parseDouble(console.readLine());
        System.out.println(centuryFromYear(year));
    }

    public static int centuryFromYear(final double year) {
        double div = year / 100;
        if (div - (int)div > 0) {
            div = div + 1;
        } 
        return (int)div;
    }
}