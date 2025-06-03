import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "10 20 30 40 50";
        System.out.println("Input String: " + str);
        System.out.println("Sum of integers: " + addIntegers(str));
    }

    /**
     * Extracts integer values from a string and adds them together.
     *
     * @param str Input string containing integer values
     * @return Sum of integer values
     */
    public static int addIntegers(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        return sum;
    }
}
