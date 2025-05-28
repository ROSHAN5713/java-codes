import java.util.Scanner;

public class fibronacci {

    public static void printFibonacciSeries(int count) {
        int n1 = 0, n2 = 1;

        System.out.print("Fibonacci Series: " + n1 + " " + n2 + " ");

        for (int i = 2; i < count; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in Fibonacci series: ");
        int n = sc.nextInt();
        printFibonacciSeries(n);
    }
}
