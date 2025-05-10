import java.util.Scanner;

public class harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n !=0) {
            int r = n % 10;
            n = n / 10;
            sum = sum + r;
        }
        System.out.println("sum: "+sum);
        if(temp % sum == 0){
            System.out.println(temp+" is a harshad number.");
        }
        else{
            System.out.println(temp+" is not a harshad number.");
        }
    }
}