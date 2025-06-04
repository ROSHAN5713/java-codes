import java.util.Scanner;

public class Excepition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first number:");
            int a = sc.nextInt();
            System.out.print("\nEnter the second number:");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("\nResult: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divided by 0");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("\nProgram ended.");
        }
        sc.close();
    }
}

