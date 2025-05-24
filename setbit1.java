import java.util.Scanner;

public class setbit1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the binary number: ");
        int n = sc.nextInt();
        int i = 2;

        if(((n >> i) & 1) == 1){
            System.out.println("it is set bit");
        }
        else{
            System.out.println("it is not set bit");
        }
    }
}