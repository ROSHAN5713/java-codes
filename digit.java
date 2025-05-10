import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st number: ");
        long n = sc.nextInt();
        int count = 0;
        while (n !=0) {
            long r = n % 10;
            System.out.println(r);
            n = n / 10;
            count++;
        }
        System.out.println("count of number: "+count);
    }
}