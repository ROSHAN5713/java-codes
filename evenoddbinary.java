import java.util.Scanner;

public class evenoddbinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the binary number: ");
        int n = sc.nextInt();
        int i = 2;

        if((n & 1) != 0){
            System.out.println("it is odd");
        }
        else{
            System.out.println("it is even");
        }
    }
}