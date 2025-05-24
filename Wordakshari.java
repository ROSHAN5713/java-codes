import java.util.Scanner;

public class Wordakshari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Word Akshari Game!");
        System.out.println("Enter words such that each new word starts with the last character of the previous word.");

        String previousWord = null;

        while (true) {
            System.out.print("Enter a word: ");
            String currentWord = scanner.nextLine().trim();
            if (currentWord.isEmpty()) {
                System.out.println("Empty input not allowed. Please enter a valid word.");
                continue;
            }

            if (previousWord != null) {
                char lastChar = Character.toLowerCase(previousWord.charAt(previousWord.length() - 1));
                char firstChar = Character.toLowerCase(currentWord.charAt(0));

                if (firstChar != lastChar) {
                    System.out.println("#########");
                    break;
                }
            }

            previousWord = currentWord;
            System.out.println("Good! Keep going...");
        }

        scanner.close();
    }
}

