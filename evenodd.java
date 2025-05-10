import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a single digit number:");
        no = sc.nextInt();
        if(no>9){
            System.out.println("invalid number");
        }
        else if (no==0){
            System.out.println("it is zero.");
        }
        else if (no%2==0){
            System.out.println("it is an even number.");
        }
        else{
            System.out.println("it is an odd number.");
        }
    }
}