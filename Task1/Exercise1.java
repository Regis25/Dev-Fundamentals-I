/**
 * Exercise1
 */
public class Exercise1 {

    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7};
        int max = numberArray[0];
        int min = numberArray[0];
        int average = 0;
        for (int i = 0; i < numberArray.length; i++) {
            max = Math.max(max, numberArray[i]);
            min = Math.min(min, numberArray[i]);
            average = average + numberArray[i];
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        System.out.println("Average number: " + average/numberArray.length);
    }
}