import java.io.Console;
import java.lang.Math;

public class Example1 {
    
    public static void main(String [] args) {
        Console console = System.console();
        System.out.println("Largest Number");
        double digit = Double.parseDouble(console.readLine());
        System.out.println(largestNumber(digit));
    }

    public static int largestNumber(final double digits) {
        return (int)(Math.pow(10, digits) - 1);
    }
}