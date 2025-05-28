import java.util.Scanner;

public class powofnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("enter a power : ");
        int p = sc.nextInt();
        System.out.println();
        System.out.print("The ans of " + n + " in the power of "+ p +" is " + pow(n, p));
    }
    public static int pow(int n,int p){
        if(p==0){
        return 1;
        }
        else{
            return n*pow(n,p-1);
        }
    }
}

