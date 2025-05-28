import java.util.Scanner;
public class sumofallnaturannumbers{
    public static int sum(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return(n + sum(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("sum of natural numbers from 1 to " + n + " is: " + result);
    }
}