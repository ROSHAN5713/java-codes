import java.util.Scanner;

public class HarryPorter {
    public static void main(String[] args) {
        int num,a,b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a three digit number: ");
        num=sc.nextInt();
        a=num/100;
        b=(num/10)%10;
        c=num%10;
        sum=a+b+c;
        if(num<1000){
        System.out.println("The sum of all digits is "+sum);
        }
        else{
            System.out.println("invalid number");
        }
    }
}