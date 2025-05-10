import java.util.Scanner;

public class kishor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the starting range:");
        int n=sc.nextInt();
        System.out.print("enter the ending range:");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            int a=i/10;
            int b=i%10;
            int sum=a+b;
            int pro=a*b;
            if((sum+pro)==i){
                System.out.println(i);
            }
        }
    }
}