import java.util.Scanner;

public class singledigitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("enter the number: ");
        
        for(int i=0;i<=m;i++){
            int nd=fd+sd;
            fd=sd;
            sd=nd;
        }
        System.out.println("the size of amiba will be: " + nd);
    }
}