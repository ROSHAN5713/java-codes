import java.util.Scanner;

public class divisible1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st number: ");
        int n = sc.nextInt();
        System.out.print("enter the 2nd number: ");
        int m = sc.nextInt();
        System.out.println("numbers divisible by 7 and 9 are: ");
        for(int i=n;i<=m;i++){
            if(i % 7 == 0 && i % 9 == 0){
                System.out.println(i);
            }
        }
    }
}