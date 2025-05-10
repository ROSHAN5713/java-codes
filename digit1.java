import java.util.Scanner;

public class digit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        long n = sc.nextInt();
        int count = 0;
        System.out.print("enter target: ");
        int m = sc.nextInt();
        while (n !=0) {
            long r = n % 10;
            n = n / 10;
            if(r==m){
                count++;
            }
        }
        System.out.println("count of number: "+count);
    }
}