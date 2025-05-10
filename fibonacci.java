import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int nd;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("enter the month number: ");
        int fd=0,sd=1;
        for(int i=0;i<=m;i++){
            nd=fd+sd;
            fd=sd;
            sd=nd;
        }
        System.out.println("the size of amiba will be: " + nd);
    }
}