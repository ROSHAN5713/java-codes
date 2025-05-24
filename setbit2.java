import java.util.Scanner;

public class setbit2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the binary number: ");
        int n = sc.nextInt();
        System.out.print("enter the index number: ");
        int i = sc.nextInt();
        int s = (n ^ (1 << i)) ;
        System.out.println(s);
        //if((n & ~(1<<i)) != 0){
        //    System.out.println();
        //}
        //else{
        //    System.out.println("it is not set bit");
        //}
    }
}