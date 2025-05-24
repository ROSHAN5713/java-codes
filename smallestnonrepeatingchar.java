import java.util.HashMap;
import java.util.Map;

public class smallestnonrepeatingchar {
    public static void main(String[] args) {
        String str = "asaaafdssvcjg";
        char smallestNonRepeatingChar = findSmallestNonRepeatingChar(str);
        System.out.println("Smallest non-repeating character: " + smallestNonRepeatingChar);
    }


    public static char findSmallestNonRepeatingChar(String str) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char smallestNonRepeatingChar = '\0';
        for (char c : str.toCharArray()) {
            if (frequencyMap.get(c) == 1 && (smallestNonRepeatingChar == '\0' || c < smallestNonRepeatingChar)) {
                smallestNonRepeatingChar = c;
            }
        }

        return smallestNonRepeatingChar;
    }
}
