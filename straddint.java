import java.util.Scanner;
public class straddint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the alphanumeric string: ");
        String input = scanner.nextLine();
        int sum = 0;
        String number = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                number += ch;
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }
        if (!number.isEmpty()) {
            sum += Integer.parseInt(number);
        }
        System.out.println("Sum of numbers: " + sum);
    }
}