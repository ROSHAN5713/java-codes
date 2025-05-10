import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        a=sc.nextInt();
        System.out.println("enter another number");
        b=sc.nextInt();
        c=a+b;
        System.out.println("the sum is: "+c);
    }
}