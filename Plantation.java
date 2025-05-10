import java.util.Scanner;

public class Plantation {
    public static void main(String[] args) {
        int row,col,no;
        row = 3;
        col = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        no = scanner.nextInt();
        if(no<1 || no>12){
            System.out.println("invalid number");
        }
        else if (no<=col || no%col==0 || (no-1)%col==0){
            System.out.println("it is a mango tree");
        }
        else{
            System.out.println("it is a apple tree");
        }
    }
}