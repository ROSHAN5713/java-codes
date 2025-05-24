import java.util.Scanner;
public class inttobinary2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        long binary = 0;
        long place = 1;


        if (num == 0) {
            System.out.println("0");
            return;
        }


        while (num > 0) {
            int rem = num % 2;
            binary += rem * place;
            num = num / 2;
            place *= 10;
        }


        while (binary > 0) {
            System.out.print(binary % 10 + " ");
            binary = binary / 10;
        }


    }
}