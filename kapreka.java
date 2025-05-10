import java.util.Scanner;

public class kapreka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int k = n*n;
        int sum = 0;
        while (k !=0) {
            int r = k % 10;
            k = k / 10;
            sum = sum + r;
        }
        System.out.println("sum: "+sum);
        if(sum == n){
            System.out.println(n+" is a kapreka number.");
        }
        else{
            System.out.println(n+" is not a kapreka number.");
        }
    }
}

//explain kapreka number?