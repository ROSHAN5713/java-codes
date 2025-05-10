import java.util.Scanner;

public class Joey {
    public static void main(String[] args) {
        int num,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a three digit number: ");
        num=sc.nextInt();
        if(num>999){
        System.out.println("invalid number.");
        }
        else{
            b=(num/10)%10;
            if(b%3==0){
                System.out.println("Trendy Number.");
            }
            else{
                System.out.println("Not a Trendy Number.");
            }
        }
    }
}