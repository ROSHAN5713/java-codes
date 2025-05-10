import java.util.Scanner;

public class reversesquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int s = n*n;
        int r = 0;
        while(n!=0){
            int r1 = n%10;
            r = n;
            r = r*10+r;
            n = n/10;
         
        }
        System.out.print(r);
        
        while(s!=0){
            int r2 = s%10;
            s = s/10;
        }
    }
}