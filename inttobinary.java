import java.util.*;

public class inttobinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        int p=0;
        if(n == 0){
            System.out.println(0);
        }
        while(n>0){
            int r = n%2;
            rev=r*p;
            n=n/2;
            p=p*10;
        }

        while(rev>0){
            System.out.print(rev%10 + " ");
            rev=rev/10;
        }
    }
}