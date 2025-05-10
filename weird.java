import java.util.Scanner;

public class weird {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n = sc.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if (n%2==0 && n>1 && n<6){
            System.out.println("Not Weird");
        }
        else if (n%2==0 && n>5 && n<21){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}